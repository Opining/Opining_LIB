package br.com.opining.library.client.model.room.participant;

import br.com.opining.library.client.model.room.DebateRoom;
import br.com.opining.library.model.User;

public abstract class Debater {
	
	private Integer idDebater;
	private User user;
	private DebateRoom room;

	public Integer getIdDebater() {
		return idDebater;
	}

	public void setIdDebater(Integer idDebater) {
		this.idDebater = idDebater;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public DebateRoom getRoom() {
		return room;
	}

	public void setRoom(DebateRoom room) {
		this.room = room;
	}
	
}
