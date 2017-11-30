package com.epam.project1.model;

import com.epam.project1.model.Entity.AbstractConfectionery;
import com.epam.project1.model.Entity.Caramel;
import com.epam.project1.model.Entity.Chocolate;

import java.util.ArrayList;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public enum BucketConfectioneryRepository {
    INSTANCE;

    private ArrayList<AbstractConfectionery> list = new ArrayList<AbstractConfectionery>();

    public ArrayList<AbstractConfectionery> getBucketGift() {
        return list;
    }

    public void addCondectionery(AbstractConfectionery confectionery) {
        list.add(confectionery);
    }

     {
         list.add(new Caramel("orest",254,42,312,432,432,24));
         list.add(new Chocolate("lel",43,213,3123,4324,524,432));
    }
    public double getBucketWeight(){
        double result = 0;
        for (AbstractConfectionery obj : list) {
            result+=obj.getWeight();
        }
        return result;
    }
}
