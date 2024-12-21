package Inheritance;

interface program{
	void show();
}

 class vaibhav implements program{

		public void show() {
			int n = 5;
			int fact =  1;
			
			for(int i=1;i<=5;i++) {
				fact *= i;
			}
			System.out.println(fact);
		}

	
	public static void main(String[] args) {
		
      vaibhav v = new vaibhav();
      
      v.show();
	}

}
