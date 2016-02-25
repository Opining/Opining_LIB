package br.com.opining.library.model.room.participant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.opining.library.model.room.polarized.Side;

@XmlRootElement
@Entity
@Table(name = "tb_polarized_debater")
@NamedQuery(name = "PolarizedDebater.getAll", query = "from PolarizedDebater")
public class PolarizedDebater extends Debater{
	
	@Column(name = "side")
	@Enumerated(EnumType.ORDINAL)
	private Side side;
	
	@Column(name = "is_valid", columnDefinition="BINARY(1)", insertable = false, updatable = true)
	private Boolean isValid;
	
	@Column(name = "is_banned", columnDefinition="BINARY(1)", insertable = false, updatable = true)
	private Boolean isBanned;
	
	@XmlElement
	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}
	
	@XmlTransient
	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	
	@XmlTransient
	public Boolean getIsBanned() {
		return isBanned;
	}

	public void setIsBanned(Boolean isBanned) {
		this.isBanned = isBanned;
	}
	
}
