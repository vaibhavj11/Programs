package LeetCode;

import java.util.Scanner;

public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner v = new Scanner(System.in);
	
	System.out.println("Enter the String : ");
	
	String s = v.nextLine();
	
	System.out.println(s);
	String m = s.trim();
	System.out.println(m);
	
    char a[] = m.toCharArray();
    int length = 0;
    for(int i=a.length-1;i>=0;i--) {
    	length++;
    	if(a[i] == ' ') {
    		length -= 1;
    		break;
    	}
    }
	System.out.println(length);
	}

}
