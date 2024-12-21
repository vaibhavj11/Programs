package LeetCode;

public class LargestOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6582148 ;
		
		while(n != 0) {
			int dig = n % 10;
			if(dig % 2 == 1) {
				System.out.println("The largest odd number is : "+n);
				break;
			}
			n /= 10;
		}
	
	}
}
