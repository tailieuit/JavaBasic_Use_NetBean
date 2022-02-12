/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        Product pro[] = new Product[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input nummber product: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Product " + (i + 1) + " th:");
            System.out.print("Input ID: ");
            String ID = sc.nextLine();
            System.out.print("Input Name: ");
            String Name = sc.nextLine();
            System.out.print("Input Company: ");
            String Company = sc.nextLine();
            System.out.print("Input Color: ");
            String Color = sc.nextLine();
            System.out.print("Input Price: ");
            double Price = sc.nextDouble();

            Product p = new Product(ID, Name, Company, Color, Price);
            pro[i] = p;
        }

        System.out.println("The list of product");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Company" + "\t" + "Color" + "\t" + "Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            System.out.println(pro[i].getID() + "\t" + pro[i].getName() + "\t" + pro[i].getCompany() + "\t" + pro[i].getColor() + "\t" + pro[i].getPrice() + "\t" + pro[i].Discount());
        }

        System.out.println("List of product with color Red or Blue");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Company" + "\t" + "Color" + "\t" + "Price" + "\t" + "Discount");
        for (int i = 0; i < n; i++) {
            if (pro[i].getColor().equals("Red") || pro[i].getColor().equals("Blue")) {
                System.out.println(pro[i].getID() + "\t" + pro[i].getName() + "\t" + pro[i].getCompany() + "\t" + pro[i].getColor() + "\t" + pro[i].getPrice() + "\t" + pro[i].Discount());
            }

        }
    }

}
