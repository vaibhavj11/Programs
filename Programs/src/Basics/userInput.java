package Basics;
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
    Scanner v = new Scanner(System.in);

    int n = v.nextInt();
    
    int a[] = new int[n];
    
    for(int i=0;i<n;i++) {
    	a[i]  = v.nextInt();
    	}
    
    for(int i=0;i<n;i++) {
    	if(a[i] % 2 == 0) {
    		System.out.println(a[i]+" ");
    	}
    }
	}

}
