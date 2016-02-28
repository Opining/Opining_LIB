package br.com.opining.library.model.room.polarized;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.room.DebateRoom;

@Entity
@Table(name = "tb_polarized_room")
@XmlRootElement
@NamedQuery(name = "PolarizedRoom.getAll", query = "from PolarizedRoom")
public class PolarizedRoom extends DebateRoom {
	
	public static final int MAX_ARGUMENT_TIME_IN_MINUTES = 2;
	public static final int MIN_ARGUMENT_TIME_IN_MINUTES = 1;
	
	public static final int ARGUMENT_TIME_IN_MINUTES_DEFAULT = 2;
	
	public static final int SUBJECT_MAX_LENGHT = 50;
	public static final int SUBJECT_MIN_LENGHT = 1;
	
	@Column(name = "subject", length = SUBJECT_MAX_LENGHT)
	private String subject;
	
	@Column(name = "argument_time_minutes", columnDefinition = "INT DEFAULT " + ARGUMENT_TIME_IN_MINUTES_DEFAULT)
	private Integer argumentTimeInMinutes;
	
	@XmlElement
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@XmlElement
	public Integer getArgumentTimeInMinutes() {
		return argumentTimeInMinutes;
	}
	
	public void setArgumentTimeInMinutes(Integer argumentTimeInMinutes) {
		this.argumentTimeInMinutes = argumentTimeInMinutes;
	}

}
