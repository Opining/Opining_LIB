package br.com.opining.library.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;
import br.com.opining.library.model.error.Errors;
import br.com.opining.library.model.error.OpiningValidateException;

@XmlRootElement
public class NewUser {
	
	
	public static final int LOGIN_MAX_LENGHT = 15;
	public static final int LOGIN_MIN_LENGHT = 4;
	
	public static final int NAME_MAX_LENGHT = 255;
	public static final int NAME_MIN_LENGHT = 3;
	
	public static final int PASSWORD_MAX_LENGHT = 15;
	public static final int PASSWORD_MIN_LENGHT = 6;
	
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

	public void setNewLogin(String newLogin) {
		
		if (!newLogin.matches("^[a-z0-9]+$"))
			throw new OpiningValidateException(Errors.LOGIN_FORMAT_NOT_ACCEPTED);
		
		if (newLogin == null || newLogin.length() < LOGIN_MIN_LENGHT)
			throw new OpiningValidateException(Errors.LOGIN_IS_TOO_SHORT);
		
		if (newLogin.length() > LOGIN_MAX_LENGHT)
			throw new OpiningValidateException(Errors.LOGIN_IS_TOO_LONG);
		
		this.newLogin = newLogin;
	}

	@XmlElement
	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		
		if (newName.length() > NAME_MAX_LENGHT)
			throw new OpiningValidateException(Errors.NAME_IS_TOO_LONG);
		
		if (newName == null || newName.length() < NAME_MIN_LENGHT)
			throw new OpiningValidateException(Errors.NAME_IS_TOO_SHORT);
		
		this.newName = newName;
	}

	@XmlElement
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		
		if (newPassword.length() > PASSWORD_MAX_LENGHT)
			throw new OpiningValidateException(Errors.PASSWORD_IS_TOO_LONG);
		
		if (newPassword == null || newPassword.length() < PASSWORD_MIN_LENGHT)
			throw new OpiningValidateException(Errors.PASSWORD_IS_TOO_SHORT);
		
		this.newPassword = newPassword;
	}
	
}
