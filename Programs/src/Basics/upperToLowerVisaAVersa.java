package Basics;
import java.util.Scanner;
public class upperToLowerVisaAVersa {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	System.out.println("Enter the characer :");
	char input = v.next().charAt(0);
	
	if(input >= 'a' && input<='z') {
		System.out.println((char)(input-32));
	}else if(input >= 'A' && input<='Z') {
		System.out.println((char)(input+32));
	}else
	 System.out.println("Invalid ");
	
	}

}
