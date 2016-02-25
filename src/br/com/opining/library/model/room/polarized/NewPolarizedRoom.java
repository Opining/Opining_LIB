package br.com.opining.library.model.room.polarized;

import br.com.opining.library.model.User;

public class NewPolarizedRoom {
	
	private String newSubject;
	private Integer newArgumentTimeInMinutes;
	private User creator;
	private Integer newNumMaxParticipants;
	private String newPassword;
	
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
	
	public User getNewCreator() {
		return creator;
	}
	
	public void setNewCreator(User newCreator) {
		this.creator = newCreator;
	}
	
	public Integer getNewNumMaxParticipants() {
		return newNumMaxParticipants;
	}
	
	public void setNewNumMaxParticipants(Integer newNumMaxParticipants) {
		this.newNumMaxParticipants = newNumMaxParticipants;
	}
	
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
