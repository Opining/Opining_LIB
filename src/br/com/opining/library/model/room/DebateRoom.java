package br.com.opining.library.model.room;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.opining.library.model.User;

@XmlRootElement
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class DebateRoom {
	
	public static final int NUM_MAX_PARTICIPANTS_DEFAULT = 10;
	
	public static final int MAX_NUM_MAX_PARTICIPANTS = 10;
	public static final int MIN_NUM_MAX_PARTICIPANTS = 2;
	
	public static final int PASSWORD_MAX_LENGHT = 15;
	public static final int PASSWORD_MIN_LENGHT = 6;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "id_room")
	protected Integer idRoom;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_creator")
	protected User creator;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "moment", columnDefinition = "TIMESTAMP DEFAULT current_timestamp", insertable = false, updatable = false)
	protected Calendar creationDate;
	
	@Column(name = "max_participants", columnDefinition = "DEFAULT " + NUM_MAX_PARTICIPANTS_DEFAULT)
	protected Integer numMaxParticipants;
	
	@Column(name = "password")
	protected String password;
	
	@Transient
	protected Boolean isPrivate;
	
	@XmlElement
	public Integer getIdRoom() {
		return idRoom;
	}
	
	public void setIdRoom(Integer idRoom) {
		this.idRoom = idRoom;
	}
	
	@XmlElement
	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	@XmlElement
	public Calendar getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
	
	@XmlElement
	public Integer getNumMaxParticipants() {
		return numMaxParticipants;
	}
	
	public void setNumMaxParticipants(Integer numMaxParticipants) {
		this.numMaxParticipants = numMaxParticipants;
	}
	
	@XmlTransient
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@XmlElement
	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	
}
