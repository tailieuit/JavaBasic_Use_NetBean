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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fan code: ");
        String code = sc.nextLine();
        System.out.print("Enter fan price: ");
        double price = sc.nextDouble();
        Fan f = new Fan(code, price);
        System.out.println("1. TC = 1 - test getCode()");
        System.out.println("2. TC = 2 - test setPrice()");
        System.out.print("Enter TC: ");
        int tc = sc.nextInt();
        if(tc == 1)
        {
            System.out.println("OUTPUT: " + f.getCode());
        }
        if(tc == 2)
        {
            System.out.print("Enter new fan price: ");
            f.setPrice(sc.nextDouble());
            System.out.println("OUTPUT: " + f.getPrice());
        }
    }
}
