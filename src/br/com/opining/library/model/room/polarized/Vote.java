package br.com.opining.library.model.room.polarized;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.room.polarized.participant.PolarizedDebater;


@XmlRootElement
public class Vote {

	private Integer idVote;
	
	private PolarizedDebater voter;
	
	private Side position;
	
	
	@XmlElement
	public Integer getIDVote() {
		return idVote;
	}
	
	public void setIDVote(Integer iDVote) {
		idVote = iDVote;
	}
	
	@XmlElement
	public PolarizedDebater getVoter() {
		return voter;
	}
	
	public void setVoter(PolarizedDebater voter) {
		this.voter = voter;
	}
	
	@XmlElement
	public Side getPosition() {
		return position;
	}
	
	public void setPosition(Side position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Vote [idVote=" + idVote + ", voter=" + voter + ", position="
				+ position + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		if (idVote == null) {
			if (other.idVote != null)
				return false;
		} else if (!idVote.equals(other.idVote))
			return false;
		if (position != other.position)
			return false;
		if (voter == null) {
			if (other.voter != null)
				return false;
		} else if (!voter.equals(other.voter))
			return false;
		return true;
	}
	
	
}
