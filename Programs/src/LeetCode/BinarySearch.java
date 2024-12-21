package LeetCode;
import java.util.Scanner;

class BinarySerachAlgorithm{

	public int searchTarget(int a[],int target) {
		int start = 0;
		int end = a.length-1;
		
		int mid = (start + end) / 2;
		
		while(start <= end) {
			if(a[mid] == target) {
				return mid;
				
			}else if(a[mid] < target) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}
		
		if(start > end) {
			return -1;
		}else {
			return mid;
		}
	}
	
}

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner v = new Scanner(System.in);
	
    System.out.println("Enter the size of array : ");
    int n = v.nextInt();
    
    int a[] = new int[n];
    System.out.print("Enter the array : ");
    for(int i=0;i<a.length;i++) {
    	a[i] = v.nextInt();
    }
    
    System.out.println("Enter the target : ");
    int target = v.nextInt();
    
    BinarySerachAlgorithm b = new BinarySerachAlgorithm();
    
    System.out.println(b.searchTarget(a, target));
    
	}

}
