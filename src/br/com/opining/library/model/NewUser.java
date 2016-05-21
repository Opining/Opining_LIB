package br.com.opining.library.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;
import br.com.opining.library.model.error.Errors;
import br.com.opining.library.model.error.OpiningValidateException;

@XmlRootElement
public class NewUser {
	
	private String newLogin;
	private String newName;
	private String newPassword;
	
	public User toUser(){
		
		User user = new User();
		
		user.setLogin(this.newLogin);
		user.setName(this.newName);
		user.setPassword(this.newPassword);
		
		return user;
		
	}
	
	public User toUser(Integer idUser){
		
		User user = toUser();		
		user.setIdUser(idUser);
		
		return user;
		
	}
	
	@XmlElement
	public String getNewLogin() {
		return newLogin;
	}

	public void setNewLogin(String login) {
		
		if (!login.matches("^[a-z0-9]+$"))
			throw new OpiningValidateException(Errors.LOGIN_FORMAT_NOT_ACCEPTED);
		
		if (login == null || login.length() < User.LOGIN_MIN_LENGHT)
			throw new OpiningValidateException(Errors.LOGIN_IS_TOO_SHORT);
		
		if (login.length() > User.LOGIN_MAX_LENGHT)
			throw new OpiningValidateException(Errors.LOGIN_IS_TOO_LONG);
		
		this.newLogin = login;
	}

	@XmlElement
	public String getNewName() {
		return newName;
	}

	public void setNewName(String name) {
		
		if (name.length() > User.NAME_MAX_LENGHT)
			throw new OpiningValidateException(Errors.NAME_IS_TOO_LONG);
		
		if (name == null || name.length() < User.NAME_MIN_LENGHT)
			throw new OpiningValidateException(Errors.NAME_IS_TOO_SHORT);
		
		this.newName = name;
	}

	@XmlElement
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}
