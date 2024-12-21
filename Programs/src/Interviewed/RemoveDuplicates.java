package Interviewed;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  String str = "programming";
	  
	  char ch[] = str.toCharArray();
	  
	  StringBuilder sb = new StringBuilder();
	  
	  for(int i=0;i<ch.length;i++) {
		  boolean isRepeated = false;
		  for(int j=i+1;j<ch.length;j++) {
			  
			  if(ch[i] == ch[j]) {
				  isRepeated = true;
				  break;
			  }
		  }
		  if(!isRepeated) {
			  sb.append(ch[i]);
		  }	 
	  }
		System.out.println(sb);
	}

}
