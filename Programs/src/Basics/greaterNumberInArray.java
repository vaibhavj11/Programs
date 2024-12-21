package Basics;
import java.util.*;
public class greaterNumberInArray {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	System.out.println("Enter size of array :");
	int n = v.nextInt();
	
	int a[] = new int[n];
	System.out.println("Enter the array :");
	
	for(int i=0;i<n;i++) {
		a[i] = v.nextInt();
	}
	
	
	    int max = a[0];
		for(int j=1;j<n;j++) {
			if(max < a[j]) {
				max = a[j];
			}
	}
		System.out.println("Greater number is :"+max);
	}

}
