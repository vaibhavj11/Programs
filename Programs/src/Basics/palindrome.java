package Basics;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	System.out.println("Enter the number :");
	int n = v.nextInt();
	int temp = n;
	int ans = 0;
	while(temp > 0) {
		int dig  = temp % 10;
		ans = ans * 10 + dig;
		temp /= 10;
	}
	
	if(n == ans) {
		System.out.println("Palindrome !");
	}
	System.out.println("Not Palindrome !");
	}

}
