package com.ksg.openapi.backup.support;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by 강성근
 */
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {ValidCategoryValidator.class})
public @interface ValidCategory {

    String categoryType();

    String message() default "Category is not valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
