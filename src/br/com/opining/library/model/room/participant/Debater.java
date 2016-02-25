package br.com.opining.library.model.room.participant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.room.DebateRoom;
import br.com.opining.library.model.User;

@XmlRootElement
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Debater {
	
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "id_debater")
	private Integer idDebater;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_room")
	private DebateRoom room;

	@XmlElement
	public Integer getIdDebater() {
		return idDebater;
	}

	public void setIdDebater(Integer idDebater) {
		this.idDebater = idDebater;
	}
	
	@XmlElement
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@XmlElement
	public DebateRoom getRoom() {
		return room;
	}

	public void setRoom(DebateRoom room) {
		this.room = room;
	}
	
}
