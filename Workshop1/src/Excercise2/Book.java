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
public class Book {
    String name;
    double price;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return price - (price*0.1);
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public Book(){
        
    }
    
    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    
}
