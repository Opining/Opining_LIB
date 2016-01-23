package br.com.opining.library.model.room.polarized;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import br.com.opining.library.model.room.polarized.participant.PolarizedDebater;

@XmlRootElement
public class Argument {
	
	private Integer idArgument;
	
	private Side side;
	
	private Calendar moment;
	
	private PolarizedDebater author;
	
	private PolarizedRoom room;
	
	private Boolean isAnonymous;
	
	private String content;
	

	@XmlElement
	public Integer getIdArgument() {
		return idArgument;
	}

	public void setIdArgument(Integer idArgument) {
		this.idArgument = idArgument;
	}
	
	@XmlElement
	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}
	
	@XmlElement
	public Calendar getMoment() {
		return moment;
	}

	public void setMoment(Calendar moment) {
		this.moment = moment;
	}
	
	@XmlElement
	public PolarizedDebater getAuthor() {
		return author;
	}

	public void setAuthor(PolarizedDebater author) {
		this.author = author;
	}
	
	@XmlElement
	public PolarizedRoom getRoom() {
		return room;
	}

	public void setRoom(PolarizedRoom room) {
		this.room = room;
	}
	
	@XmlElement
	public Boolean getIsAnonymous() {
		return isAnonymous;
	}

	public void setIsAnonymous(Boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}
	
	@XmlElement
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Argument [idArgument=" + idArgument + ", side=" + side
				+ ", moment=" + moment + ", author=" + author + ", room="
				+ room + ", isAnonymous=" + isAnonymous + ", content="
				+ content + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Argument other = (Argument) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (idArgument == null) {
			if (other.idArgument != null)
				return false;
		} else if (!idArgument.equals(other.idArgument))
			return false;
		if (isAnonymous == null) {
			if (other.isAnonymous != null)
				return false;
		} else if (!isAnonymous.equals(other.isAnonymous))
			return false;
		if (moment == null) {
			if (other.moment != null)
				return false;
		} else if (!moment.equals(other.moment))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (side != other.side)
			return false;
		return true;
	}



}
