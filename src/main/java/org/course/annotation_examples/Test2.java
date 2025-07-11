package org.course.annotation_examples;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("org.course.annotation_examples.Xiaomi");
       Annotation annotation1 =  xiaomiClass.getAnnotation(SmartPhone.class);
       SmartPhone sm1 = (SmartPhone) annotation1;
       System.out.println("Annotation info from Xiaomi class: " +
               sm1.OS() + " , " + sm1.yearOfCompanyCreation());

       Class iphoneClass = Class.forName("org.course.annotation_examples.Iphone");
       Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
       SmartPhone sm2 = (SmartPhone) annotation2;
       System.out.println("Annotation info from Xiaomi class: " +
               sm2.OS() + " , " + sm2.yearOfCompanyCreation());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default  "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone(OS = "Android", yearOfCompanyCreation = 1968)
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}

