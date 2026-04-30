package com.tnsif.scenario;
import java.util.Scanner;

class Check {
    // We pass the number as a parameter so the method can access it
    void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        
        // 1. Create an object of the Check class
        Check obj = new Check();
        
        // 2. Call the method and pass the input number
        obj.checkEvenOdd(num);
        
        sc.close(); // Good practice to close the scanner
    }
}