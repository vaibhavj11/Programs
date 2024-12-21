package Basics;
import java.util.*;
public class arrayAddition {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	System.out.println("Enter the no of rows :");
	int r = v.nextInt();
	System.out.println("Enter the no of columns :");
	int c = v.nextInt();
	
	
	int a[][] = new int[r][c];
	
	System.out.println("Enter the array a :");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			a[i][j] = v.nextInt();
		}
		
	}
	
	
   int b[][] = new int[r][c];
	
	System.out.println("Enter the array a :");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			b[i][j] = v.nextInt();
		
		}
	}
	
   int res[][] = new int[r][c];
	System.out.println("The resultant addition is :");
	System.out.println("Enter the array b :");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			res[i][j] = a[i][j] + b[i][j];
			System.out.print(res[i][j]+" ");
		}
		System.out.println();
	}
	}

}
