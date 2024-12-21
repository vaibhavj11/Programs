package ObjectOriented;

abstract class hospital{
	
	abstract void checkup();
	
	abstract void medication();
	
	 void admit() {
		System.out.println("The patient is admitted .");
	}
}

class patient extends hospital{
	void checkup() {
		System.out.println("The patient is udergoing checkup.");
		}
	void medication() {
		System.out.println("The patient is on medication .");
	}
}

class clinic {

	public static void main(String[] args) {
	
		patient p = new patient();
		p.checkup();
		p.medication();
		p.admit();

	}

}
