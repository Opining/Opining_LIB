package br.com.opining.library.client.model.error;

public class OpiningError {
	
	private int code;
	private String message;

	public OpiningError() {}
	
	public OpiningError(int code, String menssage) {
		this.code = code;
		this.message = menssage;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
