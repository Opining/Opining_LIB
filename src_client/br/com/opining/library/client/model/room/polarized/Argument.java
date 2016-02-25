package br.com.opining.library.client.model.room.polarized;

import java.util.Calendar;

import br.com.opining.library.client.model.room.participant.PolarizedDebater;

public class Argument {
	
	public static final int ARGUMENT_CONTENT_MAX_LENGTH = 1000;
	
	private Integer idArgument;
	private Side side;
	private Calendar moment;
	private PolarizedDebater author;
	private PolarizedRoom room;
	private Boolean isAnonymous;
	private String content;

	public Integer getIdArgument() {
		return idArgument;
	}

	public void setIdArgument(Integer idArgument) {
		this.idArgument = idArgument;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Calendar getMoment() {
		return moment;
	}

	public void setMoment(Calendar moment) {
		this.moment = moment;
	}

	public PolarizedDebater getAuthor() {
		return author;
	}

	public void setAuthor(PolarizedDebater author) {
		this.author = author;
	}
	
	public PolarizedRoom getRoom() {
		return room;
	}

	public void setRoom(PolarizedRoom room) {
		this.room = room;
	}
	
	public Boolean getIsAnonymous() {
		return isAnonymous;
	}

	public void setIsAnonymous(Boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
