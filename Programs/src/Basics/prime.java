package Basics;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);
	
	System.out.println("Enter the number :");
		int n = v.nextInt(); 
		
		int count = 0;
		
	 int i=1;
	 while(i<=n) {
		 if(n % i == 0) {
			 count++;
		 }
		 i++;
	 }
	 if(count == 2) {
		 System.out.println("Prime !");
	 }
	 else {
		 System.out.println("Not Prime !");
	 }
	}

}
