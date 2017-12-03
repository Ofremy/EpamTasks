package com.epam.task.service;

import com.epam.task.view.ConsoleView;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Orest
 * 03.12.2017
 * Java Version 1.8.
 */
public class Reflections {
    public static Object createObject(String className) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, InvocationTargetException {
        Class<?> clazz = Class.forName(className);
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            if (c.getParameterCount() == 0) {
                return c.newInstance();
            }
        }
        return null;
    }

    public static void fields(Object o, ConsoleView consoleView) throws IllegalAccessException {
        Field[] field = o.getClass().getDeclaredFields();
        for (Field f : field) {
            if (!f.isAccessible()) {
                f.setAccessible(true);
                consoleView.printMessage(f.getName() + " " + f.get(o));
            }
        }
    }

    public static void methods(Object o, ConsoleView consoleView) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = o.getClass().getDeclaredMethods();
        for (Method m : methods) {
            if (!m.isAccessible()) {
                m.setAccessible(true);
                if (m.getParameterCount() == 0) {
                    m.invoke(o);

                } else {
                    m.invoke(o, 25f);
                }
                consoleView.printMessage("method name = " + m.getName());
                consoleView.printMessageInLine("result = ");
                fields(o, consoleView);
            }
        }
    }

}
