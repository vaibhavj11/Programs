package Basics;
import java.util.Scanner;
public class hourGlassPattern {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);	
	
	System.out.println("Enter the number and see the magic :");
	int n = v.nextInt();
	
	int t = n*2-1;
	
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=i;sp++) {
			System.out.print(" ");
		}
		for(int j=n;j>=i;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
     
	for(int i=4;i<=1;i--) {
		for(int sp=i;sp>=i-1;sp--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
	    }
		System.out.println();
	}
	}

}
