package javase02.t06t07;


import java.lang.annotation.Documented;

@Documented
public @interface MyAnnotation {
    String author();
    String date();
}

