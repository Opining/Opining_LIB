package br.com.opining.library.model.room.polarized;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;
import br.com.opining.library.model.room.DebateRoom;

@Entity
@Table(name = "tb_polarized_room")
@AttributeOverrides({  
    @AttributeOverride(name="idRoom", column = @Column(name = "id_room")),  
    @AttributeOverride(name="creationDate", column = @Column(name = "moment", columnDefinition = "TIMESTAMP DEFAULT current_timestamp", insertable = false, updatable = false)),
    @AttributeOverride(name="numMaxParticipants", column = @Column(name = "max_participants", nullable = false)),
    @AttributeOverride(name="password", column = @Column(name = "password"))
})  
@XmlRootElement
@NamedQuery(name = "PolarizedRoom.getAll", query = "from PolarizedRoom")
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
