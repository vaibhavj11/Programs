package Collection;

import java.util.HashMap;
import java.util.HashSet;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    HashSet<Integer> h1 = new HashSet<>();
		
	    h1.add(10);
	    h1.add(20);
	    h1.add(20);    
	
	    System.out.println(h1);
	    System.out.println(h1.size());
	    
	    System.out.println(h1.hashCode());
	}

}
