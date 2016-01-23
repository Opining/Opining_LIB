package br.com.opining.library.model.room.polarized;

import java.util.Calendar;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.room.polarized.participant.PolarizedDebater;

@XmlRootElement
public class ComplaintVoting {
	
	private Integer idComplaintVoting;
	
	private PolarizedDebater denunciator;
	
	private PolarizedDebater denounced;
	
	private Calendar moment;
	
	private List<Vote> votes;
	
	
	@XmlElement
	public Integer getIdComplaintVoting() {
		return idComplaintVoting;
	}
	
	public void setIdComplaintVoting(Integer idComplaintVoting) {
		this.idComplaintVoting = idComplaintVoting;
	}
	
	@XmlElement
	public PolarizedDebater getDenunciator() {
		return denunciator;
	}
	
	public void setDenunciator(PolarizedDebater denunciator) {
		this.denunciator = denunciator;
	}
	
	@XmlElement
	public PolarizedDebater getDenounced() {
		return denounced;
	}
	
	public void setDenounced(PolarizedDebater denounced) {
		this.denounced = denounced;
	}
	
	@XmlElement
	public Calendar getMoment() {
		return moment;
	}
	
	public void setMoment(Calendar moment) {
		this.moment = moment;
	}
	
	@XmlElement
	public List<Vote> getVotes() {
		return votes;
	}
	
	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "ComplaintVoting [idComplaintVoting=" + idComplaintVoting
				+ ", denunciator=" + denunciator + ", denounced=" + denounced
				+ ", moment=" + moment + ", votes=" + votes + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplaintVoting other = (ComplaintVoting) obj;
		if (denounced == null) {
			if (other.denounced != null)
				return false;
		} else if (!denounced.equals(other.denounced))
			return false;
		if (denunciator == null) {
			if (other.denunciator != null)
				return false;
		} else if (!denunciator.equals(other.denunciator))
			return false;
		if (idComplaintVoting == null) {
			if (other.idComplaintVoting != null)
				return false;
		} else if (!idComplaintVoting.equals(other.idComplaintVoting))
			return false;
		if (moment == null) {
			if (other.moment != null)
				return false;
		} else if (!moment.equals(other.moment))
			return false;
		if (votes == null) {
			if (other.votes != null)
				return false;
		} else if (!votes.equals(other.votes))
			return false;
		return true;
	}
	

}
