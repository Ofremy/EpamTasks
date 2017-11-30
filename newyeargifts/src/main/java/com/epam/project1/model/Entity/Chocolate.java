package com.epam.project1.model.Entity;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class Chocolate extends AbstractConfectionery {
    private double chocolateMg;

    public Chocolate(){

    }

    public Chocolate(String name,double fat, double carbohydrates, double protein,
                     double weight, double shugarMg, double chocolateMg) {
        super(name,fat, carbohydrates, protein, weight, shugarMg);
        this.chocolateMg = chocolateMg;
    }

    public double getChocolateMg() {
        return chocolateMg;
    }

    public void setChocolateMg(double chocolateMg) {
        this.chocolateMg = chocolateMg;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateMg=" + chocolateMg +
                ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chocolate)) return false;
        if (!super.equals(o)) return false;

        Chocolate chocolate = (Chocolate) o;

        return Double.compare(chocolate.chocolateMg, chocolateMg) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(chocolateMg);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
