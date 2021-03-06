package br.com.opining.library.client.model.room.polarized;

import br.com.opining.library.client.model.User;

public class NewPolarizedRoom {
	
	private String newSubject;
	private Integer newArgumentTimeInMinutes;
	private User creator;
	private String newPassword;
	private Boolean isPrivate;
	
	public String getNewSubject() {
		return newSubject;
	}
	
	public void setNewSubject(String newSubject) {
		this.newSubject = newSubject;
	}
	
	public Integer getNewArgumentTimeInMinutes() {
		return newArgumentTimeInMinutes;
	}
	
	public void setNewArgumentTimeInMinutes(Integer newArgumentTimeInMinutes) {
		this.newArgumentTimeInMinutes = newArgumentTimeInMinutes;
	}
	
	public User getCreator() {
		return creator;
	}
	
	public void setCreator(User newCreator) {
		this.creator = newCreator;
	}
	
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	public Boolean getIsPrivate() {
		return isPrivate;
	}
	
	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
}
