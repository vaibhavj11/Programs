package Basics;
import java.util.Scanner;
public class elseIf {

	public static void main(String[]args) {
	Scanner v = new Scanner(System.in);
	
	System.out.println("Enter marks :");
	int marks = v.nextInt();
	
	if(marks >= 85) {
		System.out.println("A+ Grade !");
	}else if(marks >= 75) {
		System.out.println("A Grade !");
	}else if(marks >= 65) {
		System.out.println("B Grade !");
	}else if(marks >=35){
		System.out.println("Just Pass !");
	}
	else {
		System.out.println("Tumcha mulga vaya gela ahe , laksh dya .");
		}
	}
	
}
