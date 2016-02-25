package br.com.opining.library.client.model.room;

import java.util.Calendar;

import br.com.opining.library.model.User;

public abstract class DebateRoom {
	
	protected Integer idRoom;
	protected User creator;
	protected Calendar creationDate;
	protected Integer numMaxParticipants;
	protected String password;
	
	public Integer getIdRoom() {
		return idRoom;
	}
	
	public void setIdRoom(Integer idRoom) {
		this.idRoom = idRoom;
	}
	
	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
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
	
}
