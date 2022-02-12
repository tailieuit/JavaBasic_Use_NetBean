/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise1;

/**
 *
 * @author PC
 */
public class ColorFan extends Fan{
    int series;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public ColorFan() {
    }

    public ColorFan(int series, String code, double price) {
        super(code, price);
        this.series = series;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + series;
    }
    
    
}
