package ObjectOriented;
import java.util.*;
public class arithmeticCalciWithClass {
	
	void addition() {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter values for addition :");
		System.out.println("Enter a :");
		int a = v.nextInt();
		System.out.println("Enter b :");
		int b = v.nextInt();
		
		System.out.println("Addition :"+ (a+b));
		}
	void substraction() {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter values for substraction :");
		System.out.println("Enter a :");
		int a = v.nextInt();
		System.out.println("Enter b :");
		int b = v.nextInt();
		
		System.out.println("substraction :"+ (a-b));
		}
	void multiplication() {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter values for Multiplication :");
		System.out.println("Enter a :");
		int a = v.nextInt();
		System.out.println("Enter b :");
		int b = v.nextInt();
		
		System.out.println("Multiplication :"+ (a*b));
		}
	void division() {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter values for division :");
		System.out.println("Enter a :");
		int a = v.nextInt();
		System.out.println("Enter b :");
		int b = v.nextInt();
		
		System.out.println("Division :"+ (a/b));
		}

	public static void main(String[] args) {
	
		arithmeticCalciWithClass arithmetic = new arithmeticCalciWithClass();	
		arithmetic.addition();
		arithmetic.substraction();
		arithmetic.multiplication();
		arithmetic.division();
	}

}
