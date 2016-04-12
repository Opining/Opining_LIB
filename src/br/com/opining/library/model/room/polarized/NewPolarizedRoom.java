package br.com.opining.library.model.room.polarized;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.opining.library.model.User;
import br.com.opining.library.model.error.Errors;
import br.com.opining.library.model.error.OpiningValidateException;

@XmlRootElement
public class NewPolarizedRoom {
	
	public static final int MAX_ARGUMENT_TIME_IN_MINUTES = 2;
	public static final int MIN_ARGUMENT_TIME_IN_MINUTES = 1;
	
	public static final int SUBJECT_MAX_LENGHT = 50;
	public static final int SUBJECT_MIN_LENGHT = 1;
	
	public static final int PASSWORD_MAX_LENGHT = 15;
	public static final int PASSWORD_MIN_LENGHT = 6;
	
	private String newSubject;
	private Integer newArgumentTimeInMinutes;
	private User creator;
	private String newPassword;
	private Boolean isPrivate;

	public PolarizedRoom toPolarizedRoom(){
		
		PolarizedRoom polarizedRoom = new PolarizedRoom();
		
		polarizedRoom.setSubject(newSubject);
		polarizedRoom.setArgumentTimeInMinutes(newArgumentTimeInMinutes);
		polarizedRoom.setCreator(creator);
		polarizedRoom.setPassword(newPassword);
		polarizedRoom.setIsPrivate(isPrivate);
		
		return polarizedRoom;
	}
	
	@XmlElement
	public String getNewSubject() {
		return newSubject;
	}
	
	public void setNewSubject(String newSubject) {
		
		if((newSubject == null)||(newSubject.length()<SUBJECT_MIN_LENGHT))
			throw new OpiningValidateException(Errors.SUBJECT_IS_TOO_SHORT);
		
		if(newSubject.length()>SUBJECT_MAX_LENGHT)
			throw new OpiningValidateException(Errors.SUBJECT_IS_TOO_LONG);
		
		this.newSubject = newSubject;
	}
	
	@XmlElement
	public Integer getNewArgumentTimeInMinutes() {
		return newArgumentTimeInMinutes;
	}
	
	public void setNewArgumentTimeInMinutes(Integer newArgumentTimeInMinutes) {
		
		if(newArgumentTimeInMinutes < MIN_ARGUMENT_TIME_IN_MINUTES)
			throw new OpiningValidateException(Errors.ARGUMENT_TIME_TOO_SHORT);
		
		if(newArgumentTimeInMinutes > MAX_ARGUMENT_TIME_IN_MINUTES)
			throw new OpiningValidateException(Errors.ARGUMENT_TIME_TOO_LONG);
		
		this.newArgumentTimeInMinutes = newArgumentTimeInMinutes;
	}
	
	@XmlElement
	public User getCreator() {
		return creator;
	}
	
	public void setCreator(User newCreator) {
		this.creator = newCreator;
	}
	
	@XmlElement
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String newPassword) {
		
		if (newPassword.length() > PASSWORD_MAX_LENGHT)
			throw new OpiningValidateException(Errors.PASSWORD_IS_TOO_LONG);
		
		if (newPassword == null || newPassword.length() < PASSWORD_MIN_LENGHT)
			throw new OpiningValidateException(Errors.PASSWORD_IS_TOO_SHORT);
		
		this.newPassword = newPassword;
	}

	@XmlElement
	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
}
