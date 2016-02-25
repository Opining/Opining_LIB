package br.com.opining.library.client.model.room.polarized;

import br.com.opining.library.client.model.User;

public class NewPolarizedRoom {
	
	private String newSubject;
	private Integer newArgumentTimeInMinutes;
	private User creator;
	private Integer newNumMaxParticipants;
	private String newPassword;
	
	public PolarizedRoom toPolarizedRoom(){
		
		PolarizedRoom polarizedRoom = new PolarizedRoom();
		
		polarizedRoom.setArgumentTimeInMinutes(newArgumentTimeInMinutes);
		polarizedRoom.setCreator(creator);
		polarizedRoom.setNumMaxParticipants(newNumMaxParticipants);
		polarizedRoom.setSubject(newSubject);
		
		return polarizedRoom;		
	}
	
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
