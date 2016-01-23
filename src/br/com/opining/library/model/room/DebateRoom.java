package br.com.opining.library.model.room;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@MappedSuperclass
public abstract class DebateRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_room")
	protected Integer idRoom;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "moment", columnDefinition = "TIMESTAMP DEFAULT current_timestamp", insertable = false, updatable = false)
	protected Calendar creationDate;
	
	@Column(name = "max_participants", nullable = false)
	protected Integer numMaxParticipants;
	
	@Column(name = "password")
	protected String password;
	
	@XmlElement
	public Integer getIdRoom() {
		return idRoom;
	}
	
	public void setIdRoom(Integer idRoom) {
		this.idRoom = idRoom;
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
	
	@XmlElement
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DebateRoom other = (DebateRoom) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (idRoom == null) {
			if (other.idRoom != null)
				return false;
		} else if (!idRoom.equals(other.idRoom))
			return false;
		if (numMaxParticipants == null) {
			if (other.numMaxParticipants != null)
				return false;
		} else if (!numMaxParticipants.equals(other.numMaxParticipants))
			return false;
		return true;
	}	
}
