package Basics;
import java.util.*;
public class checkUpperCaseOrNot {

	public static void main(String[]gs) {
	Scanner v = new Scanner(System.in);
	
	
	char letter = v.next().charAt(0);
	int count = 0;
	for(char i='A';i<='Z';i++) {
		if(letter == i) {
			count++;
		}
		
	}
	if(count == 1) {
		System.out.println("Uppercase !");
	}
	else {
		System.out.println("Lowercase !");
	}
	}
	
}
