package br.com.opining.library.model.room.polarized;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;
import br.com.opining.library.model.room.DebateRoom;

@Entity
@Table(name = "tb_polarized_room")
@XmlRootElement
public class PolarizedRoom extends DebateRoom {
	
	@ManyToOne
	@JoinColumn(name = "fk_id_creator")
	private User creator;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "argument_time_minutes")
	private Integer argumentTimeInMinutes;
	
	@XmlElement
	public User getCreator() {
		return creator;
	}
	
	public void setCreator(User creator) {
		this.creator = creator;
	}
	
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

	@Override
	public String toString() {
		return "PolarizedRoom [creator=" + creator + ", subject=" + subject + ", argumentTimeInMinutes="
				+ argumentTimeInMinutes + ", idRoom=" + idRoom + ", creationDate=" + creationDate
				+ ", numMaxParticipants=" + numMaxParticipants + ", Password=" + password + "]";
	}
}
