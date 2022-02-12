/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise3;

/**
 *
 * @author PC
 */
public class Product {
    String ID, Name, Company, Color;
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

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
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

    public Product() {
    }

    public Product(String ID, String Name, String Company, String Color, double Price) {
        this.ID = ID;
        this.Name = Name;
        this.Company = Company;
        this.Color = Color;
        this.Price = Price;
    }
    
    public double Discount(){
        return Price*0.2;
    }
}
