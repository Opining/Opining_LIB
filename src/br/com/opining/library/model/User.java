package br.com.opining.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Is the class that represents the Opining user with their informations
 */
@Entity
@Table(name = "tb_user")
@XmlRootElement
@NamedQuery(name = "User.getAll", query = "from User")
public class User {
	
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
	@Column(name = "id_user")
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
	@Column(name = "login", nullable = true, unique = true, length = LOGIN_MAX_LENGHT)
	private String login;
	
	/** 
	 * Is the user's GCM token.
	 */
	@Column(name = "token", nullable = true, unique = true)
	private String token;
	
	@XmlElement
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
	
	@XmlElement
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
		this.login = login;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", password=" + password + ", login=" + login
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
}
