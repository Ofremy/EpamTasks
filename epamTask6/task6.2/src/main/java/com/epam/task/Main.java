package com.epam.task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

/**
 * Created by Orest
 * 04.12.2017
 * Java Version 1.8.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fromConsole = reader.readLine();
        String inCode = "Orest";

        System.out.println("fromConsole " + fromConsole);
        System.out.println("inCode " + inCode);

        Field f1 = fromConsole.getClass().getDeclaredField("value");
        Field f2 = inCode.getClass().getDeclaredField("value");

        changeAccessible(f1);
        changeAccessible(f2);

        f1.set(fromConsole, new char[]{'C', 'o', 'N', 's', 'O', 'L'});
        f2.set(inCode, new char[]{'T', 's', 'E', 'r', 'O'});

        System.out.println(fromConsole);
        System.out.println(inCode);
    }

    private static void changeAccessible(Field field) {
        try {
            field.setAccessible(true);
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & 0xFFFFFFEF);
        } catch (Exception localException) {
        }
    }
}
