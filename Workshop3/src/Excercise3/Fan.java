/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise3;

/**
 *
 * @author Admin
 */
public class Fan {
    String code;
    double price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fan() {
    }

    public Fan(String code, double price) {
        this.code = code;
        this.price = price;
    }
}
