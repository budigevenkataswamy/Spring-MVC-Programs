package controller;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FormValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void validate(Object from, Errors error) {
			FormBean f=(FormBean)from;
			if(f.getName().equals(""))
				error.reject("name","name is required");
			
			if(f.getEmail().equals(""))
				error.reject("email","email is required");
	}

}
