package Basics;
import java.util.Scanner;

public class checkUpperCase {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	char input = v.next().charAt(0);
	
	if(input >= 'A' && input <='Z') {
		System.out.println("UpprCase !");
	}else if(input >='a' && input <='z') {
		System.out.println("Lowercase !");
	}else {
		System.out.println("Invalid !");
	}
	
	}

}
