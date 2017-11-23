package com.epam.task4.Enum;

import java.io.*;


/**
 * Created by Orest
 * 20.11.2017
 * Java Version 1.8.
 */
abstract public class EnumAsClass<T extends EnumAsClass<T>>
        implements Comparable<T>, Serializable {
    private final String name;
    private final int ordinal;

    protected EnumAsClass(String var1, int var2) {
        this.name = var1;
        this.ordinal = var2;
    }

    public final String name() {
        return this.name;
    }

    public final int ordinal() {
        return this.ordinal;
    }


    public final boolean equals(Object var1) {
        return this == var1;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public static <T extends EnumAsClass<T>>T valueOf(T[] enums, String name) {
        if (name != null){
            for (T t : enums) {
                if (t.name().equals(name)){
                    return t;
                }
            }
        }
        return null;
    }


    public final int compareTo(T var1) {
        if(this.getClass() != var1.getClass() && this.getDeclaringClass() != var1.getDeclaringClass()) {
            throw new ClassCastException();
        } else {
            return this.ordinal - var1.ordinal();
        }
    }

    @SuppressWarnings("unchecked")
    public final Class<T> getDeclaringClass() {
        Class var1 = this.getClass();
        Class var2 = var1.getSuperclass();
        return var2 == Enum.class ? var1 : var2;
    }

    protected final void finalize() {
    }

    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    private void readObject(ObjectInputStream var1) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("can\'t deserialize enum");
    }

    private void readObjectNoData() throws ObjectStreamException {
        throw new InvalidObjectException("can\'t deserialize enum");
    }

    public String toString() {
        return this.name;
    }
}
