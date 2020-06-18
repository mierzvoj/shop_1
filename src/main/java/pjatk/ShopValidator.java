package pjatk;

import javax.validation.*;
import java.lang.annotation.*;
/*
public class ShopValidator implements ConstraintValidator<shopName, String> {
    private String validVar;
    @Override
    public boolean isValid(String shopName, ConstraintValidatorContext constraintValidatorContext) {
        String regex = "[a-zA-Z]";
        return shopName.matches(regex) == true && shopName.length() >= 6;

    }

    @Override
    public void initialize(shopName constraintAnnotation) {
        String validVar = constraintAnnotation.key();

    }


}
*/