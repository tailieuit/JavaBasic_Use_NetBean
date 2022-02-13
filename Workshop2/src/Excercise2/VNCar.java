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
public class VNCar extends Car{
    int series;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public VNCar() {
    }

    public VNCar(int series, String name, double price) {
        super(name, price);
        this.series = series;
    }
    
    public double getSalePrice(){
        double SalePrice;
        if(series<300){
           SalePrice = price*0.1; 
        }
        else{
            SalePrice = 0;
        }
        return SalePrice;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + series + "\t" + getSalePrice(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
