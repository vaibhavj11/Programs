package ObjectOriented;

public class copyConstructor {
	int a ;
	int b ;
	copyConstructor(int x,int y){
		x = a;
		y = b;
		
	}
	
	copyConstructor(copyConstructor s){
		a = s.a;
		b = s.b;
		System.out.println("Addition :"+ (a+b));
	}

	public static void main(String[] args) {
		
		copyConstructor s1 = new copyConstructor(5,10);
		copyConstructor s2 = new copyConstructor(s1);
	}

}
