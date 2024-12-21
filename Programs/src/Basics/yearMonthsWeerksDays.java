package Basics;
import java.util.Scanner;
public class yearMonthsWeerksDays {
	public static void main(String[]args) {
	Scanner v = new Scanner(System.in);
	
	System.out.println("Enter the Days :");
	int n = v.nextInt();
	
	
	int yr = n / 365;
	int rem = n % 365;
	System.out.println("Years : "+yr);
	System.out.println("Days :"+rem);
	
	int months = rem / 30;
	int rem1 = rem % 30;
	System.out.println("Months :"+months);
	System.out.println("Days :"+rem1);
	
	int weeks = rem1 / 7;
	int rem2 = rem1 % 7;
	
	System.out.println("Weeks :"+weeks);
	System.out.println("Days :"+rem2);
	}
	
}
