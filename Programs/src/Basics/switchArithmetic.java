package Basics;
import java.util.Scanner;
public class switchArithmetic {

	public static void main(String[] args) {
    Scanner v = new Scanner(System.in);
    
    System.out.println("Enter first number :");
    float a = v.nextFloat();
    System.out.println("Enter second number :");
    float b = v.nextFloat();
    
    System.out.println("Enter Symbol +,-,*,/,% :");
    char sym = v.next().charAt(0);
    
    
    

    switch(sym) {
    
    case '+':
    	System.out.println("Addition is :"+(a+b));
    	break;
    	
    case '-':
    	System.out.println("Addition is :"+(a-b));
    	break;
    	
    case '*':
    	System.out.println("Addition is :"+(a*b));
    	break;
    	
    case '/':
    	System.out.println("Addition is :"+(a/b));
    	break;
    	
    case '%':
    	System.out.println("Addition is :"+(a%b));
    	break;
    	
    default :
    	System.out.println("Dole check kara naitar symbol check kara .");
    }
	}

}
