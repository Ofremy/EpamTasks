package com.epam.project1.model.Entity;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class Cookies extends AbstractConfectionery {
    public enum Form {
        SQUARE,
        TRIANGLE,
        ROUND;
    }

    private Form form;

    public Cookies() {

    }

    public Cookies(String name,double fat, double carbohydrates, double protein,
                   double weight, double shugarMg, Form form ) {
        super(name,fat, carbohydrates, protein, weight, shugarMg);
        this.form = form;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "form=" + form +
                ", " + super.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cookies)) return false;
        if (!super.equals(o)) return false;

        Cookies cookies = (Cookies) o;

        return form == cookies.form;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (form != null ? form.hashCode() : 0);
        return result;
    }
}
