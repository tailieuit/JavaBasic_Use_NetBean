/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise3;

import java.util.List;

/**
 *
 * @author Admin
 */
public class MyFan implements IFan{

    @Override
    public void f1(List<Fan> t, String xCode) {
        double newprice;
        for (int i = 0; i < t.size(); i++) {
            String s = Character.toString(t.get(i).getCode().charAt(0));
            newprice = t.get(i).getPrice();
            if(xCode.equalsIgnoreCase(s)){
                t.get(i).setPrice(newprice*1.1);
            }
        }
    }

    @Override
    public void f2(List<Fan> t, double xPrice) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getPrice()<=xPrice){
                count++;
            }
        }
        
    }

    @Override
    public void f3(List<Fan> t) {
        
    }
    
}
