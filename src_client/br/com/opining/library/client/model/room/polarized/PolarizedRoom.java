package br.com.opining.library.client.model.room.polarized;

import br.com.opining.library.client.model.room.DebateRoom;

public class PolarizedRoom extends DebateRoom {
	
	public static final int MAX_ARGUMENT_TIME_IN_MINUTES = 2;
	public static final int MIN_ARGUMENT_TIME_IN_MINUTES = 1;
	
	public static final int SUBJECT_MAX_LENGHT = 50;
	public static final int SUBJECT_MIN_LENGHT = 1;
	
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
