package br.com.opining.library.model.room.polarized;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.room.participant.PolarizedDebater;

@Entity
@Table(name = "tb_argument")
@XmlRootElement
public class Argument {
	
	public static final int ARGUMENT_CONTENT_MAX_LENGTH = 1000;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_argument")
	private Integer idArgument;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "side")
	private Side side;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "moment")
	private Calendar moment;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_author")
	private PolarizedDebater author;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_room")
	private PolarizedRoom room;
	
	@Column(name = "is_anonymous", columnDefinition="BINARY(1)", insertable = false, updatable = true)
	private Boolean isAnonymous;
	
	@Column(name = "content", length = ARGUMENT_CONTENT_MAX_LENGTH)
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
}
