package com.epam.lab1.Service;

import java.io.*;

/**
 * Created by Orest
 * 02.12.2017
 * Java Version 1.8.
 */
public class ObjectIO {
    public static void saveObj(Object o,String fileName){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(o);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Object readObj(String fileName) {
        Object o = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            o = in.readObject();
        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return o;
    }
}
