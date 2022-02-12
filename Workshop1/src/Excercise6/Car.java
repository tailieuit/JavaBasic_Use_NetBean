/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise6;

/**
 *
 * @author PC
 */
public class Car {
    String ID, Name, Country, Color;
    double Price;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public Car(){
        
    }

    public Car(String ID, String Name, String Country, String Color, double Price) {
        this.ID = ID;
        this.Name = Name;
        this.Country = Country;
        this.Color = Color;
        this.Price = Price;
    }
    
    public double Discount(){
        double discount;
        if(Color.equals("Red"))
        {
            discount = Price*0.2;
        }
        else
        {
            discount = 0;
        }
        return discount;
    }
}
