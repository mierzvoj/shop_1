package pjatk;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = PriceValidator.class)

public @interface ShopAnn {
    public String key() default "-1";

    String message() default "Invalid Shop name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
*/