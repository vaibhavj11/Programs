package Basics;

import java.util.Scanner;
import java.util.Scanner;

public class symAplhaDigit {

	public static void main(String[] args) {
			Scanner v = new Scanner(System.in);

			char input = v.next().charAt(0);
			
			if(input >= 'A' && input <='Z'  || input >='a' && input <='z') {
				System.out.println("Alphabet");
			}else if(input >= '0' && input <='9') {
				System.out.println("Number !");
			}else if(input == '@' || input == '$') {
				System.out.println("Special Character !");
			}else {
				System.out.println("Invalid ! ");
			}
			
	}

}
