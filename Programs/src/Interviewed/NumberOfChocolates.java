package Interviewed;
import java.util.*;
public class NumberOfChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v = new Scanner(System.in);
		
		System.out.println("Enter the number of chocolates :");
		int n = v.nextInt();
		int t = n;
		//every 7 chocoWrap = 1 choco

		int extra = 0;
		while(t != 0) {
			t = t - 7;
			n += 1;
			
			extra++;
			
		}
		
		int ch = extra / 7;
		
		n =  n + ch;
		System.out.println(n);
	}

}
