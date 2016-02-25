package br.com.opining.library.model.room.polarized;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;

@XmlRootElement
public class NewPolarizedRoom {
	
	private String newSubject;
	private Integer newArgumentTimeInMinutes;
	private User creator;
	private Integer newNumMaxParticipants;
	private String newPassword;
	
	public PolarizedRoom toPolarizedRoom(){
		
		PolarizedRoom polarizedRoom = new PolarizedRoom();
		
		polarizedRoom.setSubject(newSubject);
		polarizedRoom.setArgumentTimeInMinutes(newArgumentTimeInMinutes);
		polarizedRoom.setCreator(creator);
		polarizedRoom.setNumMaxParticipants(newNumMaxParticipants);
		polarizedRoom.setPassword(newPassword);
		
		return polarizedRoom;
	}
	
	@XmlElement
	public String getNewSubject() {
		return newSubject;
	}
	
	public void setNewSubject(String newSubject) {
		this.newSubject = newSubject;
	}
	
	@XmlElement
	public Integer getNewArgumentTimeInMinutes() {
		return newArgumentTimeInMinutes;
	}
	
	public void setNewArgumentTimeInMinutes(Integer newArgumentTimeInMinutes) {
		this.newArgumentTimeInMinutes = newArgumentTimeInMinutes;
	}
	
	@XmlElement
	public User getCreator() {
		return creator;
	}
	
	public void setCreator(User newCreator) {
		this.creator = newCreator;
	}
	
	@XmlElement
	public Integer getNewNumMaxParticipants() {
		return newNumMaxParticipants;
	}
	
	public void setNewNumMaxParticipants(Integer newNumMaxParticipants) {
		this.newNumMaxParticipants = newNumMaxParticipants;
	}
	
	@XmlElement
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
