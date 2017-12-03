package com.epam.task.model;

/**
 * Created by Orest
 * 03.12.2017
 * Java Version 1.8.
 */
public class UnaryArithmeticOperation {
    private float number;

    public UnaryArithmeticOperation(){

    }
    public UnaryArithmeticOperation(float number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "UnaryArithmeticOperation{" +
                "number=" + number +
                '}';
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public void increment(){
        this.number++;
    }

    public void decrement(){
        this.number--;
    }

    public void changeSign(){
        this.number*=-1;
    }
}
