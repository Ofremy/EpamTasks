package com.epam.task4.test;

import com.epam.task4.Enum.EnumAsClass;
import com.epam.task4.Enum.MySeasonEnum;
import com.epam.task4.Enum.ReallEnum;
import static com.epam.task4.Enum.MySeasonEnum.*;

import java.util.Arrays;

/**
 * Created by Orest
 * 22.11.2017
 * Java Version 1.8.
 */
public class Test {
    public void go() {
        ReallEnum reallEnum = ReallEnum.WINTER;
        MySeasonEnum mySeasonEnum = MySeasonEnum.WINTER;

        System.out.println("reallEnum.name() = " + reallEnum.name());
        System.out.println("mySeasonEnum.name() = " + mySeasonEnum.name());

        System.out.println();

        System.out.println("reallEnum.ordinal() = " + reallEnum.ordinal());
        System.out.println("mySeasonEnum.ordinal() = " + mySeasonEnum.ordinal());

        System.out.println();

        System.out.println("reallEnum.getClass() = " + reallEnum.getClass());
        System.out.println("mySeasonEnum.getClass() = " + mySeasonEnum.getClass());

        System.out.println();

        System.out.println("reallEnum.isCool() = " + reallEnum.isCool());
        System.out.println("mySeasonEnum.isCool() = " + mySeasonEnum.isCool());

        System.out.println();

        System.out.println("reallEnum.getMonths() = " + Arrays.toString(reallEnum.getMonths()));
        System.out.println("mySeasonEnum.getMonths() = " + Arrays.toString(mySeasonEnum.getMonths()));

        System.out.println();

        System.out.println("reallEnum.compareTo(ReallEnum.Spring) = " + reallEnum.compareTo(ReallEnum.SPRING));
        System.out.println("mySeasonEnum.compareTo(MySeasonEnum.Spring) = " + mySeasonEnum.compareTo(MySeasonEnum.SPRING));

        System.out.println();

        System.out.println("reallEnum.equals(ReallEnum.AUTUMN) = " + reallEnum.equals(ReallEnum.AUTUMN));
        System.out.println("mySeasonEnum.compareTo(MySeasonEnum.AUTUMN) = " + mySeasonEnum.equals(MySeasonEnum.AUTUMN));

        System.out.println();

        System.out.println("reallEnum.getDeclaringClass() = " + reallEnum.getDeclaringClass());
        System.out.println("mySeasonEnum.getDeclaringClass() = " + mySeasonEnum.getDeclaringClass());

        System.out.println();

        System.out.println("reallEnum.toString() = " + reallEnum.toString());
        System.out.println("mySeasonEnum.toString() = " + mySeasonEnum.toString());

        System.out.println();

        System.out.println("reallEnum = " + reallEnum);
        System.out.println("mySeasonEnum = " + mySeasonEnum);

        System.out.println();

        System.out.println(ReallEnum.AUTUMN + " " + ReallEnum.SPRING + " " + ReallEnum.SUMMER + " " + ReallEnum.WINTER);
        System.out.println(MySeasonEnum.AUTUMN + " " + MySeasonEnum.SPRING + " " + MySeasonEnum.SUMMER + " " + MySeasonEnum.WINTER);

        System.out.println();

        System.out.println("ReallEnum.values() = " + Arrays.toString(ReallEnum.values()));
        System.out.println("MySeasonEnum.values() = " + Arrays.toString(MySeasonEnum.values()));

        System.out.println();

        System.out.println("ReallEnum.valueOf(AUTUMN) = " + ReallEnum.valueOf("AUTUMN"));
        System.out.println("MySeasonEnum.valueOf(AUTUMN) = " + MySeasonEnum.valueOf("AUTUMN"));



        switch (reallEnum){
            case WINTER:
                System.out.println("win");
                break;
            case SPRING:
                System.out.println("lose");
                break;
            default:
                System.out.println("oops");
        }

        switch (mySeasonEnum.toString()){
            case WINTER_AS_STRING_CONSTANT:
                System.out.println("win");
                break;
            case SPRING_AS_STRING_CONSTANT:
                System.out.println("lose");
                break;
            default:
                System.out.println("oops");
        }

        getByName();

    }

    public void getByName(){

        System.out.println(EnumAsClass.valueOf(new MySeasonEnum[]{MySeasonEnum.WINTER},"WINTeR"));
        System.out.println(Enum.valueOf(ReallEnum.class,"WINTER"));


    }


}
