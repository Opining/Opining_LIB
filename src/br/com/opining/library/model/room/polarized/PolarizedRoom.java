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
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "argument_time_minutes")
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
