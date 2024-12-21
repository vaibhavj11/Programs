package Basics;
import java.util.*;
public class uniqueElement {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);
	
	System.out.println("Enter the size of array :");
	int size = v.nextInt();
	
    int a[] = new int[size];
    System.out.println("Enter the array :");
   
    
    for(int i=0;i<size;i++) {
    	a[i] = v.nextInt();
    }
    
    System.out.println("Enter the key :");
    int key = v.nextInt();
    
    for(int j=0;j<a.length;j++){
         if(a[j] == key) {
        	 System.out.println(j);
         }
         
    }
    
	}

}
