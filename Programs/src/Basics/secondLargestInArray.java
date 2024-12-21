package Basics;
import java.util.*;
public class secondLargestInArray {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);
    
	System.out.println("Enter size :");
	int size = v.nextInt();
	System.out.println("Enter array :");
	int a[] = new int[size];
	for(int k=0;k<size;k++) {
		a[k] = v.nextInt();
	}
	
	int temp;
	int i;
	for(i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i] < a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
	}
	System.out.println("The second largest number is :"+a[1]);
	}

}
