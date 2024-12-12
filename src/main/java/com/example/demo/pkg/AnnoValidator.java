package com.example.demo.pkg;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AnnoValidator implements ConstraintValidator<Anno, Pojo>  {

    private final TestComponent testComponent;

	public AnnoValidator(TestComponent testComponent) {
		this.testComponent = testComponent;
	}

    @Override
    public boolean isValid(Pojo value, ConstraintValidatorContext context) {
        testComponent.call();
        return true;
    }
}
