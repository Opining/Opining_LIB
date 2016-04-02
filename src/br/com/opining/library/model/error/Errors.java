package br.com.opining.library.model.error;

public enum Errors {
	
	LOGIN_IS_TOO_LONG (101, ""),
	PASSWORD_IS_TOO_LONG (102, ""),
	NAME_IS_TOO_LONG (103, ""),
	NAME_IS_TOO_SHORT (104, ""),
	PASSWORD_IS_TOO_SHORT (105, ""),
	LOGIN_IS_TOO_SHORT (106, ""),
	LOGIN_FORMAT_NOT_ACCEPTED (107, ""),
	NAME_FORMAT_NOT_ACCEPTED (108, ""),
	SUBJECT_IS_TOO_SHORT (109, ""),
	SUBJECT_IS_TOO_LONG (110, ""),
	ARGUMENT_TIME_TOO_SHORT (111, ""),
	ARGUMENT_TIME_TOO_LONG (112, "");
	
	private final int code;
	private final String message;
	
	Errors (int index, String message) {
		this.code = index;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	public OpiningError getOpiningError(){
		return new OpiningError(this.getCode(), this.getMessage());
	}
	
}
