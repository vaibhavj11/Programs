package Interviewed;
import java.util.Scanner;
public class SecondLargestElement {

	public static void main(String[]gs) {
	Scanner v = new Scanner(System.in);
	
	 System.out.println("Enter the size of an array : ");
		int size = v.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the array : ");
		for(int i=0;i<size;i++) {
			a[i] = v.nextInt();
		}
		
		int temp ;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		for(int k=0;k<a.length-1;k--) {
			System.out.print(a[a.length-2]+" ");
			break;
		}
	}
	
}
