/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyFan mf = new MyFan();
        List<Fan> t = new ArrayList<>();
        Fan a = new Fan("FS21", 80.0);
        t.add(a);
        Fan b = new Fan("KS20", 60.0);
        t.add(b);
        Fan c = new Fan("FF21", 70.00);
        t.add(c);
        System.out.print("Add how many fans: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Fan code: ");
            String code = sc.nextLine();
            System.out.print("Fan price: ");
            double price = sc.nextDouble();
            Fan d = new Fan(code, price);

            t.add(d);
        }
        System.out.println("Enter TC (1-f1; 2-f2; 3-f3): ");
        int tc = sc.nextInt();
            if (tc == 1) {
                System.out.println("The list before running f1: ");
                System.out.println(mf);
    }

}
