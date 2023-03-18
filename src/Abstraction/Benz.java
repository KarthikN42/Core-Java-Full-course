package Abstraction;

public abstract class Benz  extends car implements upComingProjects {
	
	public void engine() {
		
	}
	
	
	public void carValut() {
		System.out.println("this is override by benz");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car obj = new Benz();
		obj.carValut();
		obj.engine();
		

	}

}
