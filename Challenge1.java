// Write a C program to check the values are equal or not

import java.util.*;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==b){
            System.out.println("EQUAL");
        }
        
        else{
            System.out.println("NOT EQUAL");
        }
    }
}