package Basics;
import java.util.*;
public class arrayAdditionUsingMultDArray {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);
		
	System.out.println("Enter the dimensions of 3D array :");
	int m = v.nextInt();
	int n = v.nextInt();
	int p = v.nextInt();
	
		int a[][][] = new int[m][n][p];
		
		int i,j,k;
		
		for(k=0;k<m;k++) {
			System.out.println("Enter array at "+k+" position :");
			for(i=0;i<n;i++) {
				for(j=0;j<p;j++) {
					a[k][i][j] = v.nextInt();
				}
			}
			
		}
	
		for(k=0;k<m;k++) {
			System.out.println("Addition of array is :");
			for(i=0;i<n;i++) {
				for(j=0;j<p;j++) {
					a[k][i][j] = a[0][i][j]+a[1][i][j];
					System.out.print(a[k][i][j]+" ");
				}
				System.out.println();
			}
			break;
		}
		
	}

}
