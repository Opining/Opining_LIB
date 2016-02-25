package br.com.opining.library.client.model.room.polarized;

import br.com.opining.library.client.model.room.DebateRoom;

public class PolarizedRoom extends DebateRoom {
	
	private String subject;
	private Integer argumentTimeInMinutes;
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Integer getArgumentTimeInMinutes() {
		return argumentTimeInMinutes;
	}
	
	public void setArgumentTimeInMinutes(Integer argumentTimeInMinutes) {
		this.argumentTimeInMinutes = argumentTimeInMinutes;
	}

}
