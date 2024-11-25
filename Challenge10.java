//Write a C program to input basic Salary of an employee and calculate its gross salary according to following:

//Basic Salary <= 10000 : HRA = 20%, DA=80%

//Basic Salary <= 20000 : HRA = 25%, DA=90%

//Basic Salary > 20000 : HRA = 30%, DA=95%

import java.util.*;

public class Challenge10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sal = sc.nextInt();
        double HRA =0.0;
        double DA = 0.0, GrossSal=0.0;
        
        if(Sal <= 10000){
            HRA = 0.20 *Sal;
            DA = 0.80 * Sal;
        }
        
        else if(Sal <= 20000){
            HRA = 0.25 * Sal;
            DA = 0.90 * Sal;
        }
        
        else if(Sal > 20000){
            HRA = 0.30 * Sal;
            DA = 0.95 * Sal;
        }
        
        else{
            System.out.println("Invalid Input");
        }
        
        GrossSal =  Sal + HRA+ DA; 
        System.out.printf("Rs.%.2f", GrossSal);
    }
}

