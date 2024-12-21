package Basics;
import java.util.Scanner;
public class switchCaseForStringMethods {

	public static void main(String[] args) {
	Scanner v = new Scanner(System.in);

	String b = "Vaibhavvv";
	
	System.out.println("Enter the first string :");
	String name = v.nextLine();
	
	System.out.println("Enter second string :");
	String name1 = v.nextLine();
	
	System.out.println("Enter the choice :");
	int choice = v.nextInt();
	
	switch(choice) {
	
	case 1:System.out.println(name.toUpperCase());
	       break;
	       
	case 2:System.out.println(name.toLowerCase());
           break;
           
	case 3:System.out.println(name.equalsIgnoreCase(name1));
    break;
    
	case 4:System.out.println(name.length());
    break;
    
	case 5:System.out.println(name.trim());
    break;
    
	case 6:System.out.println(name.equals(name1));
    break;
    
	case 7:System.out.println(name.charAt(0));
    break;
    
	case 8:System.out.println(b.indexOf('v'));
    break;
    
	case 9:System.out.println(b.lastIndexOf('v'));
    break;
    
	case 10:System.out.println(name1.replace('v', 'w'));
    break;
    
    default :
    	System.out.println("This method is not present in string class :");
    	break;
	}
	
	}

}
