package Basics;

import java.util.Scanner;

public class displayOddAdditionArray {
	
        public static void main(String[]args) {
		Scanner v = new Scanner(System.in);

	    int n = v.nextInt();
	    int sum = 0;
	    int a[] = new int[n];
	    
	    for(int i=0;i<n;i++) {
	    	a[i]  = v.nextInt();
	    	}
	    for(int i=0;i<n;i++) {
	    	if(a[i] % 2 == 1) {
	    	sum += a[i];
	    	}
	    	System.out.println("Sum of odd array elements is :"+sum);
	    }
        }
       }
