package LeetCode;
import java.util.*;
class LongPref{
	public String  prefix(String[] strs) {
		
		String pref = "";
		
		Arrays.sort(strs);
		
		char a[] = strs[0].toCharArray();
		char b[] = strs[strs.length-1].toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != b[i]) {
				break;
			}
			else {
				pref += a[i];
			}
		}
		
		return pref;
		
	}
}
public class LongestPrefix {

	public static void main(String[] args) {
    Scanner v = new Scanner(System.in);

    System.out.println("Enter the size of array : ");
    int n = v.nextInt();
    
    String strs[] = new String[n];
    
    for(int i=0;i<strs.length;i++) {
    	strs[i] = v.next();
    }
  
    LongPref l = new LongPref();
    		System.out.println(l.prefix(strs));
    
	}

}
