package Basics;
import  java.util.*;
public class graeaterThanThree {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);
	System.out.println("Enter three numbers :");
		int a = v.nextInt();
        int b = v.nextInt();
        int c = v.nextInt();
        
        if(a>b && a>c) {
        	System.out.println(a+" is greater number :");
        }else if(b>a && b>c) {
        	System.out.println(b+" is greater number :");
        }else {
        	System.out.println(c+" is greater number :");
        }
		
		
	}

}
