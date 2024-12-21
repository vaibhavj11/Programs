package ObjectOriented;
import java.util.Scanner;
public class vrj {

	vrj(int n){
		
		int fact = 1;
		
		int i=n;
		while(i > 0) {
			fact *= i;
			i--;
		}
		
		System.out.println(fact);
	}
	
	public static void main(String[]gs) {
		
		new vrj(6);
	}
	
}
