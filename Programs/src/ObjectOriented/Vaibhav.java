package ObjectOriented;
import java.util.*;
public class Vaibhav {
	
	Vaibhav(){
		Scanner v = new Scanner(System.in);
		
		System.out.println("Enter a :");
		int a = v.nextInt();
		System.out.println("Enter b :");
		int b = v.nextInt();
		
		System.out.println("the multiplication is :"+a*b);
		
	}
	
	Vaibhav(int x){
		System.out.println("The table of "+x+" is :");
		for(int i=1;i<=10;i++) {
			System.out.println(x*i);
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		new Vaibhav();
		new Vaibhav(5);

	}

}
