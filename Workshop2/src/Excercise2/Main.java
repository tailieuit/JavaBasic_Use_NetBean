/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static VNCar vnc[] = new VNCar[100];
    //Input
    public static void Input(){
        System.out.print("Input number car: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Car " + (i+1) + " th");
            System.out.print("Input name: ");
            String Name = sc.nextLine();
            System.out.print("Input price: ");
            double price = sc.nextDouble();
            System.out.print("Input series: ");
            int series  = sc.nextInt();
            VNCar vn = new VNCar(series, Name, price);
            vnc[i] = vn;
        }
    }
    //Ouput
    public static void Output(){
        System.out.println("List of car");
        System.out.println("Name" + "\t" + "Price" + "\t" + "Series" + "\t" +"Discount");
        for (int i = 0; i < n; i++) {
            System.out.println(vnc[i].toString());
        }
    }
    
    //Search
    public static void Search(String Namecar){
        Namecar = sc.nextLine();
        System.out.println("Car has name " + Namecar);
        System.out.println("Name" + "\t" + "Price" + "\t" + "Series" + "\t" +"Discount");
        for (int i = 0; i < n; i++) {
            if(vnc[i].getName().equals(Namecar)){
                System.out.println(vnc[i].toString());
            }
        }
    }
    public static void main(String[] args) {
        Input();
        Output();
        System.out.print("Input name car: ");
        String NameCar = sc.nextLine();
        Search(NameCar);
        
    }
    
}
