import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter int ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1 == 0 || num2 == 0){
            throw new ArithmeticException("input is 0");
        }
        
       
        try {
            int c = num1 / num2; 
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) { 
            e.printStackTrace();           
        }
        finally{
            System.out.println("finally");
        }
        
        
        
        
        
        

    }
}