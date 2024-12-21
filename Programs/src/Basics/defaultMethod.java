package Basics;


interface First{
	
	void something();
	default void function() {
		System.out.println("Sanket Jagtap");
	}
}

class Second implements First{
	
	public void something() {
		System.out.println("Vaibhav Jagtap");
	}

	
}

public class defaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First a1 = new Second();
		
		a1.something();
		a1.function();
	}

}
