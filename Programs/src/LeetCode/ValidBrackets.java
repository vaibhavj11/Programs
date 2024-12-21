package LeetCode;

import java.util.*;

public class ValidBrackets {

	 static boolean validBrackets(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			
			if(c == '(') {
				stack.push(')');
			}else if(c=='{') {
				stack.push('}');
			}else if(c=='[') {
				stack.push(']');
			}else if(stack.empty() || stack.pop() != c) {
				return false;
			}
		}
		
		return stack.empty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner v = new Scanner(System.in);

	System.out.println("Enter the bracket string : ");
	String s = v.next();
	
	System.out.println(validBrackets(s));
	
	}

	

}
