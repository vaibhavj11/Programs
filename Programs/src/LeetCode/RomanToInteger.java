package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Roman {
    public static int romanToInt(String s) {

    	Map<Character,Integer> map = new HashMap<>();
    	map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    	
        int total = map.get(s.charAt(s.length()-1));
        
        for(int i=s.length()-2;i>=0;i--) {
        	if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
        		total -= map.get(s.charAt(i));
        	}
        	else {
        		total += map.get(s.charAt(i));
        	}
        }
        return total;
    }
    }  

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner v = new Scanner(System.in);
     System.out.println("Enter the String : ");
     
     String s = v.next();
     
     Roman r = new Roman();
     
     System.out.println(r.romanToInt(s));
     
	}

}
