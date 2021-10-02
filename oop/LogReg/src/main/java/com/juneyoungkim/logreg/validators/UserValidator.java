package com.juneyoungkim.logreg.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.juneyoungkim.logreg.models.User;
import com.juneyoungkim.logreg.services.UserService;

@Component
public class UserValidator implements Validator {
	
	@Autowired
	private UserService userServ;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		User user = (User) target;
		
		if(!user.getPasswordConfirmation().equals(user.getPassword())) {
			errors.rejectValue("passwordConfirmation", "Match");
		}
		if(userServ.findByEmail(user.getEmail()) != null) {
			errors.rejectValue("email", "Duplicate");
		}
	}

	
}
