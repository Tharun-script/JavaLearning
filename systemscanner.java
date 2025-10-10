import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter ");
        String single = scan.next();       
        System.out.println(single);
        
        System.out.println("Enter string");
        String name = scan.nextLine();    
        System.out.println("Hello, " + name);

        
        System.out.println("Enter int ");
        int num = scan.nextInt();
        System.out.println(num);
        
        System.out.println("Enter Double ");
        Double D = scan.nextDouble();
        System.out.println(D);
        
        System.out.println("Enter Long ");
        Long L = scan.nextLong();
        System.out.println(L);
        
        System.out.println("Enter Boolean ");
        Boolean B = scan.nextBoolean();
        System.out.println(B);
        

    }
}