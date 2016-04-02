package br.com.opining.library.model.error;

public class OpiningValidateException extends IllegalArgumentException {
	
	private OpiningError opiningError;
	
	private static final long serialVersionUID = 4670228500387612796L;
	
	public OpiningValidateException(Errors error) {
		super(error.getMessage());
		opiningError = error.getOpiningError();
	}
	
	public OpiningValidateException (Errors error, Throwable cause) {
		super(error.getMessage(), cause);
		opiningError = error.getOpiningError();
	}
	
	public OpiningError getOpiningError() {
		return opiningError;
	}
}
