package com.example.demo.pkg;

import jakarta.annotation.Resource;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AnnoValidator implements ConstraintValidator<Anno, Pojo>  {

    @Resource
    private TestComponent testComponent;

    @Override
    public boolean isValid(Pojo value, ConstraintValidatorContext context) {
        testComponent.call();
        return true;
    }
}
