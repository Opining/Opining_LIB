package br.com.opining.library.model.room.polarized.participant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;
import br.com.opining.library.model.room.polarized.PolarizedRoom;
import br.com.opining.library.model.room.polarized.Side;

@XmlRootElement
@Entity
@Table(name = "tb_polarized_debater")
@NamedQuery(name = "PolarizedDebater.getAll", query = "from PolarizedDebater")
public class PolarizedDebater {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_debater")
	private Integer idDebater;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_user")
	private User user;
	
	@Column(name = "side")
	@Enumerated(EnumType.ORDINAL)
	private Side side;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_room")
	private PolarizedRoom room;
	
	@Column(name = "is_valid", columnDefinition="BINARY(1)", insertable = false, updatable = true)
	private Boolean isValid;
	
	@Column(name = "is_banned", columnDefinition="BINARY(1)", insertable = false, updatable = true)
	private Boolean isBanned;
	

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
	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}
	
	@XmlElement
	public PolarizedRoom getRoom() {
		return room;
	}

	public void setRoom(PolarizedRoom room) {
		this.room = room;
	}
	
	@XmlElement
	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	
	@XmlElement
	public Boolean getIsBanned() {
		return isBanned;
	}

	public void setIsBanned(Boolean isBanned) {
		this.isBanned = isBanned;
	}

	@Override
	public String toString() {
		return "PolarizedDebater [idDebater=" + idDebater + ", user=" + user
				+ ", side=" + side + ", room=" + room + ", isValid=" + isValid
				+ ", isBanned=" + isBanned + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PolarizedDebater other = (PolarizedDebater) obj;
		if (idDebater == null) {
			if (other.idDebater != null)
				return false;
		} else if (!idDebater.equals(other.idDebater))
			return false;
		if (isBanned == null) {
			if (other.isBanned != null)
				return false;
		} else if (!isBanned.equals(other.isBanned))
			return false;
		if (isValid == null) {
			if (other.isValid != null)
				return false;
		} else if (!isValid.equals(other.isValid))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (side != other.side)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	

}
