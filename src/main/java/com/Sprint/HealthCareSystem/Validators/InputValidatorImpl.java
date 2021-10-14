package com.Sprint.HealthCareSystem.Validators;

import org.springframework.stereotype.Component;

@Component
public class InputValidatorImpl implements InputValidator {

	@Override
	public boolean nameValidator(String name) {
		
		return name.matches( "[A-Z][a-z]{3,}" );
	}

	@Override
	public boolean contactValidator(String contact) {
		return contact.matches("[0-9]{10}");
	}

	@Override
	public boolean emailValidator(String email) {
		return email.matches("^[a-zA-Z_]+@[a-zA-Z]+\\\\.[a-zA-Z]{2,4}$");
	}

	
	@Override
	public boolean passwordValidator(String password) {
		return password.length()==8;
	}

	
	public boolean usernameValidator(String username) {
		return username.length()>=4;
	}
}