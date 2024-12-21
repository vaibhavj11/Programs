package Interviewed;
import java.util.*;
public class SquaredAdditionOFArrEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner v = new Scanner(System.in);
    
    System.out.println("Enter the size of an array : ");
		int size = v.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the array : ");
		for(int i=0;i<size;i++) {
			a[i] = v.nextInt();
		}
		
		int total = 0;
		
		for(int i=0;i<a.length;i++) {
			total += a[i] * a[i];
		}
		
		System.out.println(total);
		
	}

}
