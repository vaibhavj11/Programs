package Basics;

import java.util.Arrays;

public class PredefinedSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,5,1,4,10,15,9,6,7,8};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
