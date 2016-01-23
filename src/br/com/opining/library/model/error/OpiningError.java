package br.com.opining.library.model.error;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OpiningError {
	
	private int code;
	private String message;

	public OpiningError() {}
	
	public OpiningError(int code, String menssage) {
		this.code = code;
		this.message = menssage;
	}
	
	@XmlElement
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@XmlElement
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
