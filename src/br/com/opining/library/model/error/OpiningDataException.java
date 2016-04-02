package br.com.opining.library.model.error;

public class OpiningDataException extends RuntimeException {

	private static final long serialVersionUID = 3750097353477835520L;
	
	private OpiningError opiningError;
	
	public OpiningDataException(Errors error) {
		super(error.getMessage());
		opiningError = error.getOpiningError();
	}
	
	public OpiningDataException(Errors error, Throwable cause) {
		super(error.getMessage(), cause);
		opiningError = error.getOpiningError();
	}
	
	public OpiningError getOpiningError() {
		return opiningError;
	}

}
