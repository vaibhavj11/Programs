package Basics;

public class even1To100 {

	public static void main(String[] args) {
		
		System.out.println("Even numbers between 1 to 100 :");
		for(int i=1;i<=100;i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
