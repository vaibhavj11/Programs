package Basics;

public class sumOfEven1To50 {

	public static void main(String[] args) {

     int sum = 0;
     
		for(int i=1;i<=50;i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
   System.out.println("Sum of even numbers between 1 to 50 :"+sum);
	}

}
