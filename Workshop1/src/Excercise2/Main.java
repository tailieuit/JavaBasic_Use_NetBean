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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        Book b = new Book(name, price);
        System.out.println("1. Test getName()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        int tc = sc.nextInt();
        if(tc == 1){
            System.out.println("OUTPUT: " + b.getName().charAt(0) + b.getName().charAt(1) + b.getName().charAt(2));
        }
        if(tc == 2){
            System.out.print("Enter new price: ");
            b.setPrice(sc.nextDouble());
            System.out.println("OUTPUT: " + b.getPrice());
        }
    }
    
}
