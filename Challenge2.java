// Write a C program to check the number is odd or even using conditional construct

import java.util.*;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 == 0){
            System.out.println("EVEN");
        }
        
        else{
            System.out.println("ODD");
        }
    }
}