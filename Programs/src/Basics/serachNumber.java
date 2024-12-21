package Basics;
import java.util.*;
public class serachNumber {
    
	public static void printArray() {
	
	
	}
	
	public static void main(String[]args) {
		Scanner v = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int size = v.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the array :");
		int i=0;
		while(i < size) {
			a[i] = v.nextInt();
			i++;
		}
	
    
    
    System.out.println("Enter the key :");
    int key = v.nextInt();
    
    for(int j=0;j< a.length;j++) {
		if(a[j] == key) {
			System.out.println(key+" is present at postion "+jclas);
		}
	}
	}
	 
}
