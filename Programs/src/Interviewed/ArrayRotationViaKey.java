package Interviewed;
import java.util.Scanner;
public class ArrayRotationViaKey {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	System.out.println("Enter the size of array :");
	int n = v.nextInt();
	
	System.out.println("Enter the key :");
	int k = v.nextInt();
	
	int a[] = new int[n];
	System.out.print("Enter the array :");
	
	for(int i=0;i<n;i++) {
		a[i] = v.nextInt();
	}
	
	for(int j=0;j<k+1;j++) {
		int first = a[0];
		int l;
		for(l=0;l<a.length-1;l++) {
			a[l] = a[l+1];
		}
		a[l] = first;
	}

	System.out.println("The resultant array is : ");
	for(int y=0;y<a.length;y++) {
		System.out.println(a[y]+" ");
	}
	
	}

}
