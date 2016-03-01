package br.com.opining.library.model.room.polarized;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;

@XmlRootElement
public class NewPolarizedRoom {
	
	private String newSubject;
	private Integer newArgumentTimeInMinutes;
	private User creator;
	private String newPassword;
	private Boolean isPrivate;

	public PolarizedRoom toPolarizedRoom(){
		
		PolarizedRoom polarizedRoom = new PolarizedRoom();
		
		polarizedRoom.setSubject(newSubject);
		polarizedRoom.setArgumentTimeInMinutes(newArgumentTimeInMinutes);
		polarizedRoom.setCreator(creator);
		polarizedRoom.setPassword(newPassword);
		polarizedRoom.setIsPrivate(isPrivate);
		
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
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@XmlElement
	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
}
