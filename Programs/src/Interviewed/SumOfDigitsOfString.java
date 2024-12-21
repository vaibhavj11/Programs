package Interviewed;
import java.util.*;
public class SumOfDigitsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner v = new Scanner(System.in);
		
		String s = "1f3fsj9m60";
		
		char ch[] = s.toCharArray();
		
		int total = 0;
		for(int i=0;i<ch.length;i++) {
		     switch(ch[i]){
		     
		     case '1' : total += 1;
		                break;
		                
		     case '2' : total += 2;
             break;

		     case '3' : total += 3;
             break;

		     case '4' : total += 4;
             break;
             
		     case '5' : total += 5;
             break;
             
		     case '6' : total += 6;
             break;
             
		     case '7' : total += 7;
             break;
             
		     case '8' : total += 8;
             break;
             
		     case '9' : total += 9;
             break;
             
		                
		     }
		}
		System.out.println(total);
	}

}
