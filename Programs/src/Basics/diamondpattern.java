package Basics;

public class diamondpattern {

	public static void main(String[] args) {

     int n = 8;
     int t = n-1;
     
     for(int i=1;i<=n;i++) {
    	 for(int sp=n;sp>=i;sp--) {
    		 System.out.print(" ");   
    		 }
    	 for(int j=1;j<=i;j++){
        	 System.out.print("* ");
         }
    	 System.out.println();
     }
     for(int i=1;i<=t;i++) {
    	 for(int sp=1;sp<=i;sp++) {
    		 System.out.print(" ");
    	 }
    	 for(int j=t;j>=i;j--) {
    		 System.out.print(" *");
    	 }
    	 System.out.println();
     }

	}

}
