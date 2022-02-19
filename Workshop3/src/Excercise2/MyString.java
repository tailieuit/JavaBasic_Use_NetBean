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
public class MyString implements IString{

    @Override
    public String f1(String str, String s1, String s2) {
        if(str.contains(s1) == true){
            str = str.replace(s1, s2);
        }
        else
        {
            System.out.println("Không tìm thấy kí tự");
        }
        return str;
    }

    @Override
    public String f2(String str, String s) {
        return str.concat(s);
    }
    
}
