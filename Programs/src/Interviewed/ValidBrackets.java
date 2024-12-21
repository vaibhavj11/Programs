package Interviewed;
import java.util.Stack;

public class ValidBrackets {
    public static void checkValidBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        char a[] = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            char ch = a[i];

            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Check for closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Invalid Bracketing!");
                    return;
                }
                // Check if the top of the stack matches the current closing bracket
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    System.out.println("Invalid Bracketing!");
                    return;
                }
            }
        }

        // If stack is empty, all brackets matched; otherwise, it's invalid
        if (stack.isEmpty()) {
            System.out.println("Valid Bracketing!");
        } else {
            System.out.println("Invalid Bracketing!");
        }
    }

    public static void main(String[] args) {
        checkValidBrackets("(){}[]"); // Valid
        checkValidBrackets("({[)]}"); // Invalid
        checkValidBrackets("((()))"); // Valid
    }
}
