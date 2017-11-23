package com.epam.task4.Enum;

/**
 * Created by Orest
 * 22.11.2017
 * Java Version 1.8.
 */
public abstract class MySeasonEnum extends EnumAsClass<MySeasonEnum> {
    public static final MySeasonEnum WINTER;
    public static final MySeasonEnum SPRING;
    public static final MySeasonEnum AUTUMN;
    public static final MySeasonEnum SUMMER;

    public static final String WINTER_AS_STRING_CONSTANT = "WINTER";
    public static final String SPRING_AS_STRING_CONSTANT = "SPRING";
    public static final String AUTUMN_AS_STRING_CONSTANT = "AUTUMN";
    public static final String SUMMER_AS_STRING_CONSTANT = "SUMMER";

    private static final MySeasonEnum[] values;
    private boolean isCool;

    public abstract String[] getMonths();

    static {
        WINTER = new MySeasonEnum("WINTER", 0, true) {
            public String[] getMonths() {
                return new String[]{"December", "January", "February"};
            }
        };
        SPRING = new MySeasonEnum("SPRING", 1, false) {
            public String[] getMonths() {
                return new String[]{"March", "April", "May"};
            }
        };
        AUTUMN = new MySeasonEnum("AUTUMN", 2, false) {
            public String[] getMonths() {
                return new String[]{"June", "July", "August"};
            }
        };
        SUMMER = new MySeasonEnum("SUMMER", 3, true) {
            public String[] getMonths() {
                return new String[]{"September", "October", "November"};
            }
        };

        values = (new MySeasonEnum[]{
                WINTER, SPRING, AUTUMN, SUMMER
        });
    }

    public static MySeasonEnum[] values() {
        return values;
    }

    public static MySeasonEnum valueOf(String name) {
        for (MySeasonEnum e : values) {
            if (e.name().equals(name)) return e;
        }
        return null;
    }


    public boolean isCool() {
        return this.isCool;
    }

    private MySeasonEnum(String var1, int var2, boolean isCool) {
        super(var1, var2);
        this.isCool = isCool;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
