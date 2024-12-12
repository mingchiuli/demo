package com.example.demo.pkg;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {AnnoValidator.class})
@Target({ PARAMETER })
@Retention(RUNTIME)
public @interface Anno {
    String message() default "{wiki.chiu.micro.user.valid.RegisterSave.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    int[] values() default {};
}
