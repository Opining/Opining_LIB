package br.com.opining.library.client.model.room;

import java.util.Calendar;
import br.com.opining.library.client.model.User;

public abstract class DebateRoom {
	
	protected Integer idRoom;
	protected User creator;
	protected Calendar creationDate;
	protected Integer numMaxParticipants;
	protected String password;
	protected Boolean isPrivate;
	
	public Integer getIdRoom() {
		return idRoom;
	}
	
	public void setIdRoom(Integer idRoom) {
		this.idRoom = idRoom;
	}
	
	public User getCreator() {
		return creator;
	}

	public void setCreator(br.com.opining.library.client.model.User creator2) {
		this.creator = creator2;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
	
	public Integer getNumMaxParticipants() {
		return numMaxParticipants;
	}
	
	public void setNumMaxParticipants(Integer numMaxParticipants) {
		this.numMaxParticipants = numMaxParticipants;
	}
	
	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}	
}
