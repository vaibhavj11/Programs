package LeetCode;
import java.util.*;
class Solution {
    public void removeDuplicates(int[] nums) {
    	
    	Set set = new HashSet();
    	
    	for(int i=0;i<nums.length;i++) {
    	   set.add(nums[i]);
    	}
    	
         System.out.println(set);
     
    }
}

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner v = new Scanner(System.in);
    
    System.out.println("Enter the size of Array : ");
    int size = v.nextInt();
    
    int a[] = new int[size];
    
    for(int i=0;i<a.length;i++) {
    	a[i] = v.nextInt();
    }
    
    Solution s = new Solution();
    
 s.removeDuplicates(a);
    
	}

}
