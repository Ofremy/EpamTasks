package com.epam.project1.model.Entity;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class Caramel extends AbstractConfectionery {
    private double caramelMg;


    public double getCaramelMg() {
        return caramelMg;
    }

    public void setCaramelMg(double caramelMg) {
        this.caramelMg = caramelMg;
    }

    public Caramel(){

    }
    public Caramel(String name,double fat, double carbohydrates, double protein,
                   double weight, double shugarMg, double caramelMg) {
        super(name,fat, carbohydrates, protein, weight, shugarMg);
        this.caramelMg = caramelMg;
    }

    @Override
    public String toString() {
        return "Caramel{" +
                "caramelMg=" + caramelMg +
                ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caramel)) return false;
        if (!super.equals(o)) return false;

        Caramel caramel = (Caramel) o;

        return Double.compare(caramel.caramelMg, caramelMg) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(caramelMg);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
