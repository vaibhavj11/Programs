package Basics;


abstract class Vaibhav{
	
	void show()
	{
		System.out.println("Vaibhav Jagtap !");
	}
}
class Sanket extends Vaibhav {
	
}

public class try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vaibhav v = new Vaibhav() {
			void show() {
				System.out.println("Sanket Jagtap !");
			}
		};
		
		v.show();
	}

}
