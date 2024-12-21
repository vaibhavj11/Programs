package Basics;
import java.util.*;
public class nestedIfElse {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	System.out.println("Enter the year :");
	int yr = v.nextInt();
	
	if(yr%100 == 0) {
		if(yr % 400 == 0) {
			System.out.println("Leap Year !");
		}else {
			System.out.println("Not Leap year !");
		}
	}else {
		if(yr % 4 == 0) {
			System.out.println("Leap Year !");
		}else {
			System.out.println("Not Leap Year !");
		}
	}
	            
	}

}
