package springTutorial;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomNameValidator implements ConstraintValidator<isValidName, String>{

	private String params; ///required params
	
	@Override
	public void initialize(isValidName constraintAnnotation) {
		this.params = constraintAnnotation.params();
	}

	@Override
	public boolean isValid(String userName, ConstraintValidatorContext context) {
		
		if(userName == null) {
			return false;
		}
		System.out.print(params);
		System.out.print(" ");
		System.out.print(userName);
		if(userName.matches(params)){//if(userName != null){//userName.matches("[^A-Z]*")) {
			System.out.print(" " + true);
			return true;
		} else {
			System.out.print(" " + false);
			return false;
		}
	}

}
