package com.example.champions_app;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ChampionNameValidator implements
        ConstraintValidator<ChampionNameConstraint, String> {

    @Override
    public void initialize(ChampionNameConstraint championName) {
    }

    @Override
    public boolean isValid(String championNameField,
                           ConstraintValidatorContext cxt) {
        return championNameField != null && championNameField.matches("[A-Z][a-z]+");
    }
}
