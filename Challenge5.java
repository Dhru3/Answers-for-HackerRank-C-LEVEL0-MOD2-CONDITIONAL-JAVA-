//Write a C program to check the number is either divisible by 3 or divisible by 5 and display the corresponding message

import java.util.*;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%3==0 && num%5!=0){
            System.out.println("Hi");
        }
        else if (num%5==0 && num%3!=0){
            System.out.println("Hello");
        }
        else if (num%3==0 && num%5==0) {
            System.out.println("HiHello");
        }
    }
}