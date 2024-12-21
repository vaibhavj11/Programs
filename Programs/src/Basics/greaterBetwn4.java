package Basics;

import java.util.Scanner;

public class greaterBetwn4 {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter three numbers :");
			int a = v.nextInt();
	        int b = v.nextInt();
	        int c = v.nextInt();
	        int d = v.nextInt();
	        
	        if(a>b && a>c && a>d) {
	        	System.out.println(a+" is greater number :");
	        }else if(b>a && b>c && b>d) {
	        	System.out.println(b+" is greater number :");
	        }else if(c>a && c>b && c>d){
	        	System.out.println(c+" is greater number :");
	        }else {
	        	System.out.println(d+" is greater number :");
	        }

	}

}
