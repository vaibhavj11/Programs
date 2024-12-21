package Basics;

interface KuchhBhi{
	
	void show();
}


public class LambdaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KuchhBhi k = () -> System.out.println("My Name Is Vaibhav !");
		
		k.show();
		
		KuchhBhi k1 = () -> {
				System.out.println("Vaibhav Jagtap");
			}
		;
		k1.show();
		
	}

}
