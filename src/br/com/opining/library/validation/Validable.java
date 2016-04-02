package br.com.opining.library.validation;

import br.com.opining.library.model.error.OpiningValidateException;

public interface Validable {
	
	public boolean validate() throws OpiningValidateException;
	
}
