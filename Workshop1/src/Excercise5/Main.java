/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher tea[] = new Teacher[100];
        System.out.print("Input number teacher: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Teacher " + (i + 1) + " th");
            System.out.print("Input ID: ");
            String ID = sc.nextLine();
            System.out.print("Input Name: ");
            String Name = sc.nextLine();
            System.out.print("Input Gender: ");
            String Gender = sc.nextLine();
            System.out.print("Input Address: ");
            String Address = sc.nextLine();
            System.out.print("Input Grading: ");
            int Grading = sc.nextInt();

            Teacher t = new Teacher(ID, Name, Gender, Address, Grading);
            tea[i] = t;
        }

        //Display list teacher
        System.out.println("List of teacher");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Gender" + "\t" + "Address" + "\t" + "Grading" + "\t" + "Salary");
        for (int i = 0; i < n; i++) {
            System.out.println(tea[i].getID() + "\t" + tea[i].getName() + "\t" + tea[i].getGender() + "\t" + tea[i].getAddress() + "\t" + tea[i].getGrading() + "\t" + tea[i].Slary());
        }

        //Smallest slary
        double smallest = tea[0].Slary();
        for (int i = 0; i < n; i++) {
            if (smallest < tea[i].Slary()) {
                smallest = tea[i].Slary();
            }
        }
        
        //Display smallest salary
        System.out.println("Teacher has smallest salary");
        System.out.println("ID" + "\t" + "Name" + "\t" + "Gender" + "\t" + "Address" + "\t" + "Grading" + "\t" + "Salary");
        for (int i = 0; i < n; i++) {
            if(tea[i].Slary() == smallest)
            System.out.println(tea[i].getID() + "\t" + tea[i].getName() + "\t" + tea[i].getGender() + "\t" + tea[i].getAddress() + "\t" + tea[i].getGrading() + "\t" + tea[i].Slary());
        }
    }
}
