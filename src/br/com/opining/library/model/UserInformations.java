package br.com.opining.library.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * is the class that represents the user information that 
 * will be stored for future research and studies.
 */
@Entity
@Table(name = "tb_user_informations")
@XmlRootElement
@NamedQuery(name = "UserInformations.getAll", query = "from UserInformations")
public class UserInformations {
	
	/**
	 * Is the entity's indentifier
	 */
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user_informations")
	private Integer idUserInformations;
	
	/**
	 * Is the user that contain this informations
	 */
	@OneToOne
	@JoinColumn(name = "fk_id_user")
	private User user;
	
	/**
	 * It is a list that contains the time that the user logged in the application
	 */
	@ElementCollection
	@CollectionTable(name = "tb_info_login_time", 
					 joinColumns = @JoinColumn(name = "fk_id_user_informations"))
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "login_time", columnDefinition = "TIMESTAMP DEFAULT current_timestamp", 
			insertable = false, updatable = false)
	private List<Calendar> loginTimes;
	
	/**
	 * It is a list that contains the time that the user logged out the application
	 */
	@ElementCollection
	@CollectionTable(name = "tb_info_logout_time", 
					 joinColumns = @JoinColumn(name = "fk_id_user_informations"))
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "logout_time", columnDefinition = "TIMESTAMP DEFAULT current_timestamp", 
			insertable = false, updatable = false)
	private List<Calendar> logoutTimes;
	
	@XmlElement
	public Integer getIdUserInformations() {
		return idUserInformations;
	}
	
	public void setIdUserInformations(Integer idUserInformations) {
		this.idUserInformations = idUserInformations;
	}
	
	@XmlElement
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@XmlElement
	public List<Calendar> getLoginTimes() {
		return loginTimes;
	}
	
	public void setLoginTimes(List<Calendar> loginTimes) {
		this.loginTimes = loginTimes;
	}
	
	@XmlElement
	public List<Calendar> getLogoutTimes() {
		return logoutTimes;
	}
	
	public void setLogoutTimes(List<Calendar> logoutTimes) {
		this.logoutTimes = logoutTimes;
	}

	@Override
	public String toString() {
		return "UserInformations [idUserInformations=" + idUserInformations + ", user=" + user + ", loginTimes="
				+ loginTimes + ", logoutTimes=" + logoutTimes + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInformations other = (UserInformations) obj;
		if (idUserInformations == null) {
			if (other.idUserInformations != null)
				return false;
		} else if (!idUserInformations.equals(other.idUserInformations))
			return false;
		if (loginTimes == null) {
			if (other.loginTimes != null)
				return false;
		} else if (!loginTimes.equals(other.loginTimes))
			return false;
		if (logoutTimes == null) {
			if (other.logoutTimes != null)
				return false;
		} else if (!logoutTimes.equals(other.logoutTimes))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
}
