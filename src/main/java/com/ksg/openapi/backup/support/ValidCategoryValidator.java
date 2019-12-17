package com.ksg.openapi.backup.support;

import lombok.Getter;
import lombok.Setter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 강성근
 */
@Getter
@Setter
public class ValidCategoryValidator implements ConstraintValidator<ValidCategory, String> {

        private static final Map<String, List> availableCategories;

        static {

            availableCategories = new HashMap<>();
            availableCategories.put("simpleDto", Arrays.asList("work", "game"));

        }

        private String categoryType;

        @Override
        public void initialize(ValidCategory constraintAnnotation) {

            this.setCategoryType(constraintAnnotation.categoryType());

        }

        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {

            List categories = com.ksg.openapi.backup.support.ValidCategoryValidator.availableCategories.get(categoryType);
            if (categories == null || categories.isEmpty()) {

                return false;

            }


            return false;

        }





}
