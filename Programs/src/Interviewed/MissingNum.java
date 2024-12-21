package Interviewed;
import java.util.Scanner;
public class MissingNum {

	public static void main(String[] args) {
		
		Scanner v = new Scanner(System.in);
		
		System.out.println("Enetr the size of array :");
		int n = v.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the array :");
		
		for(int i=0;i<n;i++) {
			a[i] = v.nextInt();
		}
		
		int z=1;
		
		for(int j=0;j<a.length;j++) {
			if(z != a[j]) {
				System.out.println(z);
              break;
			}
			z++;
		}

	}

}
