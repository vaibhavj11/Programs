package Interviewed;
import java.util.*;
public class IntArrayExceptElementMultiplication {

	public static void MultiplicationExcepEle(int a[]) {
		
		int mult = 1;
			
		for(int i=0;i<a.length;i++) {
			mult *= a[i];
			
		}
		
		int k[] = new int[a.length];
		
		int dig ;
		for(int j=0;j<a.length;j++) {
			dig = mult / a[j];
			System.out.println("Digit : "+dig);
			k[j] = dig;
			int mul = mult * a[j];
			System.out.println(k[j]);
			mul = mult;
			System.out.println("mult "+mult);
		}
	}
	
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
    
    MultiplicationExcepEle(a);
    
	}

}
