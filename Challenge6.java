//Write a C program to check whether the given year is leap year or not using conditional construct

import java.util.*;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}