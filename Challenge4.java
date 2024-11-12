// Write a C program to check the number is divisible by 3 or not using conditional construct.

import java.util.*;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = num%3;
        
        if(num%3==0){
            System.out.println("The number is divisible by 3");
        }
        
        else{
            System.out.println("The number is not divisible by 3 and gives a remainder " + r);
        }
    }
}