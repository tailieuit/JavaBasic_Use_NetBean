/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise2;

/**
 *
 * @author PC
 */
public class Car {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car() {
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return name + "\t" + price;
    }
}
