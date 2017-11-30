package com.epam.project1.util;

import com.epam.project1.model.BucketConfectioneryRepository;
import com.epam.project1.model.Entity.AbstractConfectionery;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class Sort {
    private static List<AbstractConfectionery> list = BucketConfectioneryRepository.INSTANCE.getBucketGift();

    public static void sortByWeight() {
        Collections.sort(list, new Comparator<AbstractConfectionery>() {
            public int compare(AbstractConfectionery abstractConfectionery, AbstractConfectionery t1) {
                return (int) (abstractConfectionery.getWeight() - t1.getWeight());
            }
        });
    }

    public static void sortByShugarmg() {
        Collections.sort(list, new Comparator<AbstractConfectionery>() {
            public int compare(AbstractConfectionery abstractConfectionery, AbstractConfectionery t1) {
                return (int) (abstractConfectionery.getShugarMg() - t1.getShugarMg());
            }
        });

    }

    public static void sortByProtein() {
        Collections.sort(list, new Comparator<AbstractConfectionery>() {
            public int compare(AbstractConfectionery abstractConfectionery, AbstractConfectionery t1) {
                return (int) (abstractConfectionery.getProtein() - t1.getProtein());
            }
        });

    }

    public static void sortByFat() {
        Collections.sort(list, new Comparator<AbstractConfectionery>() {
            public int compare(AbstractConfectionery abstractConfectionery, AbstractConfectionery t1) {
                return (int) (abstractConfectionery.getFat() - t1.getFat());
            }
        });

    }

    public static void sortByCarbohydrates() {
        Collections.sort(list, new Comparator<AbstractConfectionery>() {
            public int compare(AbstractConfectionery abstractConfectionery, AbstractConfectionery t1) {
                return (int) (abstractConfectionery.getCarbohydrates() - t1.getCarbohydrates());
            }
        });
    }
}
