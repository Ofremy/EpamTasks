package com.epam.task4.Enum;

/**
 * Created by Orest
 * 22.11.2017
 * Java Version 1.8.
 */
public enum ReallEnum {
    WINTER(true) {
        public String[] getMonths() {
            return new String[]{"December", "January", "February"};
        }
    },
    SPRING(false) {
        public String[] getMonths() {
            return new String[]{"March", "April", "May"};
        }
    },
    AUTUMN(false) {
        public String[] getMonths() {
            return new String[]{"June", "July", "August"};
        }
    },
    SUMMER(true) {
        public String[] getMonths() {
            return new String[]{"September", "October", "November"};
        }
    };

    private boolean isCool;

    ReallEnum(boolean isCool) {
        this.isCool = isCool;
    }

    public boolean isCool() {
        return isCool;
    }

    public abstract String[] getMonths();
}
