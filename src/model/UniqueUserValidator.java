package model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserValidator implements ConstraintValidator<UniqueUser, String> {


    public boolean isValid(String userName, ConstraintValidatorContext constraintContext) {
        if (userName.equals("")) return true;        
        boolean isValid = true;
        if(UserDoa.findUserByName(userName) != null) {
        	isValid = false;
        }
        return isValid;
    }

	@Override
	public void initialize(UniqueUser arg0) {
		// TODO Auto-generated method stub
		
	}


}