package br.com.devrodrigues.cartoes.domain.annotation;

import br.com.devrodrigues.cartoes.domain.objectvalue.AcceleratorType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AllowAccelerator {
    AcceleratorType acceleratorType() default AcceleratorType.ACCELERATOR;
}
