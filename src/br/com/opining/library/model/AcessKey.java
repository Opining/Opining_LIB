package br.com.opining.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Is the class that represents the HTTP access key to webservice services, 
 * which will be processed by the client and placed in the HTTP header 
 * at the at the time of the requests.
 */
@Entity
@Table(name = "tb_acess_key")
@XmlRootElement
@NamedQuery(name = "AcessKey.getAll", query = "from AcessKey")
public class AcessKey {
	
	/**
	 * Is the key's indentifier
	 */
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_key")
	private Integer idKey;
	
	/**
	 * It's the key that will be processed by client
	 */
	@Column(name = "acess_key", nullable = false)
	private String key;
	
	/**
	 * It's the user that contains this key
	 */
	@OneToOne
	@JoinColumn(name = "fk_id_user")
	private User user;
	
	@XmlElement
	public Integer getIdKey() {
		return idKey;
	}
	
	public void setIdKey(Integer idKey) {
		this.idKey = idKey;
	}
	
	@XmlElement
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	@XmlElement
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "AcessKey [idKey=" + idKey + ", key=" + key + ", user=" + user + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcessKey other = (AcessKey) obj;
		if (idKey == null) {
			if (other.idKey != null)
				return false;
		} else if (!idKey.equals(other.idKey))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
}