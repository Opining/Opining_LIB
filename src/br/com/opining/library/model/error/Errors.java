package br.com.opining.library.model.error;

public enum Errors {
	
	LOGIN_IS_TOO_LONG (101, "Este nome de login possui mais caracteres que o permitido"),
	PASSWORD_IS_TOO_LONG (102, "Esta senha possui mais caracteres que o permitido"),
	NAME_IS_TOO_LONG (103, "Este nome possui mais caracteres que o permitido"),
	NAME_IS_TOO_SHORT (104, "Este nome possui menos caracteres que o permitido"),
	PASSWORD_IS_TOO_SHORT (105, "Esta senha possui menos caracteres que o permitido"),
	LOGIN_IS_TOO_SHORT (106, "Este nome de login possui menos caracteres que o permitido"),
	LOGIN_FORMAT_NOT_ACCEPTED (107, "O login só deve possuir caracteres alfa-numéricos"),
	NAME_FORMAT_NOT_ACCEPTED (108, "O nome só deve possuir letras A-Z, Ç maiúsculas, minúsculas e espaços"),
	SUBJECT_IS_TOO_SHORT (109, "Tema da sala possui menos caracteres que o permitido"),
	SUBJECT_IS_TOO_LONG (110, "Tema da sala possui menos caracteres que o permitido"),
	ARGUMENT_TIME_TOO_SHORT (111, "O tempo de argumentação deve ser maior"),
	ARGUMENT_TIME_TOO_LONG (112, "O tempo de argumentação deve ser menor"),
	
	DUPLICATE_LOGIN (201, "Este nome de login já está em uso"),
	USER_NOT_FOUND (202, "Usuário inexistente"),
	USER_HAS_BEEN_INVALIDATED (203, "Usuário não existe mais"),
	ROOM_NOT_FOUND (204, "Esta sala não existe");
	
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
