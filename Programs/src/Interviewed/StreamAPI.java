package Interviewed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      List<Integer> nums = new ArrayList<>();
		
      nums.add(10);
      nums.add(5);
      
      System.out.println(nums);
      
      Stream<Integer> data = nums.stream();
      
       for(int i=0;i<data.count();i++) {
    	   System.out.println(i);
       }
      
	}
	

}
