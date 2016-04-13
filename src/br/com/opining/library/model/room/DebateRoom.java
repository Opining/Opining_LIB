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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.opining.library.model.User;
import br.com.opining.library.model.error.Errors;
import br.com.opining.library.model.error.OpiningValidateException;

@XmlRootElement
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class DebateRoom {
	
	public static final int NUM_MAX_DEBATES = 1000;
	
	public static final int NUM_MAX_PARTICIPANTS = 10;
	
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
	
	@Column(name = "password", length = PASSWORD_MAX_LENGHT)
	protected String password;
	
	@Column(name = "is_private", columnDefinition="BINARY(1)")
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

	@XmlTransient
	public Calendar getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
	
	@XmlTransient
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {

		if (password.length() > PASSWORD_MAX_LENGHT)
			throw new OpiningValidateException(Errors.PASSWORD_IS_TOO_LONG);
		
		if (password == null || password.length() < PASSWORD_MIN_LENGHT)
			throw new OpiningValidateException(Errors.PASSWORD_IS_TOO_SHORT);
		
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
