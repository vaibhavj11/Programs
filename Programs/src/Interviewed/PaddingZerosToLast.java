package Interviewed;

import java.util.Scanner;

public class PaddingZerosToLast {

	public static void main(String[] args) {
		
Scanner v = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int n = v.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the array :");
		
		for(int i=0;i<n;i++) {
			a[i] = v.nextInt();
		}
		
		int t1 = n-1;
		while(t1 != 0) {
			int temp;
			for(int j=0;j<a.length-1;j++) {
				if(a[j] == 0) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
			t1--;
		}
		
		System.out.println("The resultant array is : ");
		for(int m=0;m<a.length;m++) {
			System.out.println(a[m]+" ");
		}
	}

}
