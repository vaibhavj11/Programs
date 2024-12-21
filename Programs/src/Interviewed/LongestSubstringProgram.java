package Interviewed;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		LengthOfLongestSubstring("abbac");
	
	}

     public static void LengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
    	 
    	 String longestSubstring = null;
    	 int longestSubstringLength = 0;
    	 
    	 Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	
    	 char arr[] = s.toCharArray();
    	 
    	 for(int i=0;i<arr.length;i++) {
    		 
    		 char ch = arr[i];
    		 
    		 if(!map.containsKey(ch)) {
    			 map.put(ch, i);
    			 
    		 }else {
    			 i = map.get(ch);
    			 map.clear();
    		 }
    		 
    		 if(map.size() > longestSubstringLength) {
    			  longestSubstringLength = map.size();
    			  longestSubstring = map.keySet().toString();
    		 }
    		  
    	 }
    	 
    	 System.out.println("The Longest Substring is : "+longestSubstring);
    	 System.out.println("The Longest Substring length is : "+longestSubstringLength);
	}

}
