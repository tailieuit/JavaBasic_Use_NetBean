/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static ColorFan clf[] = new ColorFan[100];
    
    //Input
    public static void Input(){
        System.out.print("Input number colorfan: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Color Fan " + (i+1) + " th");
            System.out.print("Input code: ");
            String code = sc.nextLine();
            System.out.print("Input price: ");
            double price = sc.nextDouble();
            System.out.print("Input series: ");
            int series = sc.nextInt();
            
            ColorFan c = new ColorFan(series, code, price);
            clf[i] = c;
        }
    }
    
    //Output
    public static void Output(){
        System.out.println("List of Color Fan");
        System.out.println("Code" + "\t" + "Price" + "\t" + "Series");
        for (int i = 0; i < n; i++) {
            System.out.println(clf[i].toString());
        }
    }
    
    //Search
    public static void Search(String name){
        name = sc.nextLine();
        System.out.println("Color fan with name " + name + " :" );
        System.out.println("Code" + "\t" + "Price" + "\t" + "Series");
        for (int i = 0; i < n; i++) {
            if(clf[i].getCode().equals(name)){
                System.out.println(clf[i].toString());
            }
        }
    }
    public static void main(String[] args) {
        Input();
        Output();
        System.out.print("Input name search: ");
        String name = sc.nextLine();
        Search(name);
    }
}
