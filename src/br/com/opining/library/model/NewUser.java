package br.com.opining.library.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;

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

	public void setNewLogin(String newLogin) {
		this.newLogin = newLogin;
	}

	@XmlElement
	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	@XmlElement
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}
