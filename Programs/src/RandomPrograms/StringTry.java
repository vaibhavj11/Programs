package RandomPrograms;
import java.util.*;
public class StringTry {

	public static void main(String[] args) {
		Scanner v =new Scanner(System.in);
		// TODO Auto-generated method stub
  int n = v.nextInt();
		String strs[] = new String[n];
		
		for(int i=0;i<strs.length;i++) {
			strs[i] = v.next();
		}
		System.out.println(strs[0][2]);
	}

}
