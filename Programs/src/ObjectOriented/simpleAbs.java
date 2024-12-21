interface vaibhav{
	abstract class jadu{
		abstract void print();
	}
	class show extends jadu {
		void print() {
			System.out.println("Jadu method !");
		}
	}
}
public class simpleAbs implements vaibhav{

	public static void main(String[] args) {
	
		simpleAbs s = new simpleAbs();
		
		show n = new show();
		n.print();
	}

}
