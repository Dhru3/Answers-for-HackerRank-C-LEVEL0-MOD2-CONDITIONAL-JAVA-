//Write a program to find given a specific date ,check whether the date is valid or not. Year will be in range 1900 to 9999

import java.util.*;

public class Challenge8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String a[] = date.split("/");
        int d,m,y;
        d= Integer.parseInt(a[0]);
        m= Integer.parseInt(a[1]);
        y= Integer.parseInt(a[2]);
        
        //LEAP YEAR CONDITION
        if ((y%4==0 && y%100!=0)|| (y%400==0)){
            if(m==2 && d<=29 && d>0){
                System.out.println("Valid");
            }
        }
        
        if (y>=1900 && y <=9999){
            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
                if (d>0 && d<=31){
                    System.out.println("Valid");
                }
            }
            
            else if(m==4 || m==6|| m==9 || m==11){
                if(d>0 && d<=30){
                    System.out.println("Valid");
                }
            }
            
            else if (m==2 && d<=28 && d>0){
                System.out.println("Valid");
                
            }
            
            else{
                System.out.println("Invalid");
            }
        }
        
        else{
            System.out.println("Invalid");
        }
        
    }
}
