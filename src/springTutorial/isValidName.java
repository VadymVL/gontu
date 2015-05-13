package springTutorial;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy=CustomNameValidator.class)
@Target( {ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)

public @interface isValidName {
	
	String params() default ("\\D+");
	
	String message() default "Your name must not contain numbers!";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};

}
