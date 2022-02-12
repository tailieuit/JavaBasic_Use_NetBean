/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car[] = new Car[100];
        System.out.print("Enter number Car: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Car " + (i + 1) + " th");
            System.out.print("Input ID: ");
            String ID = sc.nextLine();
            System.out.print("Input Name: ");
            String Name = sc.nextLine();
            System.out.print("Input Country: ");
            String Country = sc.nextLine();
            System.out.print("Input Color: ");
            String Color = sc.nextLine();
            System.out.print("Input Price: ");
            double Price = sc.nextDouble();
            
            Car c = new Car(ID, Name, Country, Color, Price);
            car[i] = c;
        }
        
        
        //Display list of car
        System.out.println("List of car");
        System.out.println("ID" + "\t" +"Name"+ "\t" +"Country"+ "\t" +"Color"+ "\t" +"Price"+ "\t" +"Discount");
        for (int i = 0; i < n; i++) {
            System.out.println(car[i].getID()+"\t" +car[i].getName()+"\t" +car[i].getCountry()+"\t" +car[i].getColor()+"\t" +car[i].getPrice()+"\t" +car[i].Discount());
        }
        
        //Count
        int count = 0;
        for (int i = 0; i < n; i++) {
            if((car[i].getPrice() - car[i].Discount()) < (car[0].getPrice() - car[0].Discount()))
            {
                count++;
            }
        }
        System.out.println("Number car that  have less than price of the first car in the list: " + count);

    }
}
