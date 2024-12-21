package Basics;
import java.util.*;
public class powerOf2 {

	static boolean powOf2(int n) {
		
		if(n == 0) {
			return false;
		}
		
			return (n & (n-1)) == 0;

	}
	
	public static void main(String[]args) {
	Scanner v = new Scanner(System.in);
	
	System.out.println("Enter the number :");
	int n = v.nextInt();
	
	System.out.println(powOf2(n));
	
	}
	
}
