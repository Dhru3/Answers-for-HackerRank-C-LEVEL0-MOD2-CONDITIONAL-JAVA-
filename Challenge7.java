// Write a program to check whether the time is valid or not using conditional construct.

import java.util.*;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine(); 
        String[] a = time.split(":"); 
        int hr,min,sec; 
        hr = Integer.parseInt(a[0]); 
        min = Integer.parseInt(a[1]); 
        sec = Integer.parseInt(a[2]); 
        if(hr>=0 &&hr<=23 && min>=0 && min <=59 && sec>=0 && sec<=59)
        {
            System.out.print("Valid"); 
        }
        else 
        {
            System.out.print("Not Valid");
        }
    }
}