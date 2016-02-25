package br.com.opining.library.client.model;

public class User {
	
	public static final int LOGIN_MAX_LENGHT = 15;
	public static final int LOGIN_MIN_LENGHT = 4;
	
	public static final int NAME_MAX_LENGHT = 255;
	public static final int NAME_MIN_LENGHT = 3;
	
	public static final int PASSWORD_MAX_LENGHT = 15;
	public static final int PASSWORD_MIN_LENGHT = 6;
	
	
	private String name;
	private String login;
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
}
