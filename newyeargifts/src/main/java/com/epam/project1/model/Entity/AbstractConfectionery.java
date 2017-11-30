package com.epam.project1.model.Entity;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public abstract class AbstractConfectionery {
    protected String name;
    protected double fat;
    protected double carbohydrates;
    protected double protein;
    protected double weight;
    protected double shugarMg;

    AbstractConfectionery() {
    }

    AbstractConfectionery(String name,double fat, double carbohydrates, double protein, double weight, double shugarMg) {
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.weight = weight;
        this.shugarMg = shugarMg;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getShugarMg() {
        return shugarMg;
    }

    public void setShugarMg(double shugarMg) {
        this.shugarMg = shugarMg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractConfectionery)) return false;

        AbstractConfectionery that = (AbstractConfectionery) o;

        if (Double.compare(that.fat, fat) != 0) return false;
        if (Double.compare(that.carbohydrates, carbohydrates) != 0) return false;
        if (Double.compare(that.protein, protein) != 0) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.shugarMg, shugarMg) != 0) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(fat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(carbohydrates);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(protein);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(shugarMg);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                ", protein=" + protein +
                ", weight=" + weight +
                ", shugarMg=" + shugarMg +
                '}';
    }
}
