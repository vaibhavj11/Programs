package Basics;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	System.out.println("Enter the number which you want to check it is armsrtrong number :");
	int n = v.nextInt();
	
	int t1 = n;
	int temp = 0;
	while(t1 != 0) {
		int d = t1 % 10;
		temp += 1;
		t1 /= 10;
	}
	
	
	int t2 = n;
	int arm = 0;
	while(t2 != 0) {
		int digit = t2 % 10;
		int mul = 1;
		for(int i=1;i<=temp;i++) {
			mul *= digit;
			
		}
		t2 /= 10;
		arm += mul;
		
	}
	 if(arm == n) {
		 System.out.println("Armstrong !");
	 }else {
		 System.out.println("Not Armstrong !");
	 }
	}

}
