package br.com.opining.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.opining.library.model.error.Errors;
import br.com.opining.library.model.error.OpiningValidateException;
import br.com.opining.library.validation.Validable;

/**
 * Is the class that represents the Opining user with their informations
 */
@Entity
@Table(name = "tb_user", uniqueConstraints = @UniqueConstraint(columnNames = {"login"}))
@XmlRootElement
@NamedQuery(name = "User.getAll", query = "from User")
public class User implements Validable{
	
	public static final int LOGIN_MAX_LENGHT = 15;
	public static final int LOGIN_MIN_LENGHT = 4;
	
	public static final int NAME_MAX_LENGHT = 255;
	public static final int NAME_MIN_LENGHT = 3;
	
	public static final int PASSWORD_MAX_LENGHT = 15;
	public static final int PASSWORD_MIN_LENGHT = 6;
	
	/** 
	 * Is the user's indentifier
	 */
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user", updatable = false, insertable = false)
	private Integer idUser;
	
	/** 
	 * Is the user's real name
	 */
	@Column(name = "name", nullable = false, length = NAME_MAX_LENGHT)
	private String name;
	
	/** 
	 * Is the user's password
	 */
	@Column(name = "password", nullable = false, length = PASSWORD_MAX_LENGHT)
	private String password;
	
	/** 
	 * Is the user's nickname, used to log in the application. 
	 * If that attribute is null, that user is inactive.
	 */
	@Column(name = "login", unique = true, length = LOGIN_MAX_LENGHT)
	private String login;
	
	@XmlTransient
	public Integer getIdUser() {
		return idUser;
	}
	
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlTransient
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@XmlElement
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		
		if (login == null || login.length() < LOGIN_MIN_LENGHT)
			throw new OpiningValidateException(Errors.LOGIN_IS_TOO_SHORT);
		
		if (this.login.length() > LOGIN_MAX_LENGHT)
			throw new OpiningValidateException(Errors.LOGIN_IS_TOO_LONG);
		
		this.login = login;
	}

	@Override
	public boolean validate() throws OpiningValidateException {
		
		if (this.password == null || this.password.length() < PASSWORD_MIN_LENGHT)
			throw new OpiningValidateException(Errors.PASSWORD_IS_TOO_SHORT);
		
		if (this.name == null || this.name.length() < NAME_MIN_LENGHT)
			throw new OpiningValidateException(Errors.NAME_IS_TOO_SHORT);
		
		if (this.password.length() > PASSWORD_MAX_LENGHT)
			throw new OpiningValidateException(Errors.PASSWORD_IS_TOO_LONG);
		
		if (this.name.length() > NAME_MAX_LENGHT)
			throw new OpiningValidateException(Errors.NAME_IS_TOO_LONG);
		
		if (!this.login.matches("^[a-z0-9]+$"))
			throw new OpiningValidateException(Errors.LOGIN_FORMAT_NOT_ACCEPTED);
		
		//if (!this.name.matches("^[a-záàâãéèêíïóôõöúçñ ]+$"))
			//throw new OpiningValidateException(Errors.NAME_FORMAT_NOT_ACCEPTED);
		
		return true;
	}
	
}
