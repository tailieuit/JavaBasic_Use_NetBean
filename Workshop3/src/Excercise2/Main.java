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
        MyString ms = new MyString();
        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC (1 or 2): ");
        int tc = sc.nextInt();
        String y = sc.nextLine();
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("OUTPUT: ");
        System.out.print("Enter a string 1: ");
        String s1 = sc.nextLine();
        if(tc == 1){
            System.out.print("Enter a string 2: ");
            String s2 = sc.nextLine();
            System.out.println(ms.f1(str, s1, s2));
        }
        if(tc==2){
            System.out.println(ms.f2(str, " " + s1));
        }
    }
}
