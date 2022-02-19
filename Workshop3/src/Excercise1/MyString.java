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
public class MyString implements IString{

    @Override
    public int f1(String st) {
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {
            if(Character.isDigit(st.charAt(i))){
                int num = Integer.parseInt(st.charAt(i) + "");
                sum += num;
            }
        }
        return sum;
    }

    @Override
    public String f2(String st) {
        String se = "";
        for (int i = 0; i < st.length(); i++) {
            if(Character.isDigit(st.charAt(i)) && Integer.parseInt(st.charAt(i)+"") != 9){
                int num = Integer.parseInt(st.charAt(i) + "");
                num += 1;
                se = se + num;
            }
            else{
                se = se + st.charAt(i);
            }
        }
        return se;
    }
    
}
