package com.epam.project1.model.Entity;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class Sweets extends AbstractConfectionery {
    public enum Color{
        BLACK,
        WHITE,
        RED,
        YELLOW,
        GREEN;
    }
    private Color color;

    public Sweets(){

    }

    public Sweets(String name,double fat, double carbohydrates,
                  double protein, double weight, double shugarMg, Color color) {
        super(name,fat, carbohydrates, protein, weight, shugarMg);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "color=" + color +
                ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sweets)) return false;
        if (!super.equals(o)) return false;

        Sweets sweets = (Sweets) o;

        return color == sweets.color;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
