package br.com.opining.library.client.model;

public class NewUser {
	
	private String newLogin;
	private String newName;
	private String newPassword;
	
	public User toUser(){
		
		User user = new User();
		
		user.setLogin(this.newLogin);
		user.setName(this.newName);
		
		return user;
		
	}

	public String getNewLogin() {
		return newLogin;
	}

	public void setNewLogin(String newLogin) {
		this.newLogin = newLogin;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}
