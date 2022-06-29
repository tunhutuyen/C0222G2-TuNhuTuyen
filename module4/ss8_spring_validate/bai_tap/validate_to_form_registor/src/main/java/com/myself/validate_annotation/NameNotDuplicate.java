package com.myself.validate_annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// tự tao annotation ---------------------------------
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = NameNotDuplicateValidator.class)
@Documented
public @interface NameNotDuplicate {

    String message() default "First name must not duplicate!!!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}