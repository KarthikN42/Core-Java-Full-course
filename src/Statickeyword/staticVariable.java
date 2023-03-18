package Statickeyword;

public class staticVariable {
  static int amount =0 ;
  String deposit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 staticVariable obj = new  staticVariable();
		 obj.deposit="karthik";
		 obj.amount=100;
		
		 
		 staticVariable obj1 = new  staticVariable();
		 obj1.deposit="kiran";
		 obj1.amount=200;
		 
		 //static variable is common for all objects  of the class it will over write the last created objects
		 
		 
		 
		 System.out.println("this is for amount"+amount);
		 System.out.println("this is for kiran"+obj.deposit);
		 System.out.println("this is the amount"+amount);
		 System.out.println("this is for karthik"+obj1.deposit);

	}

}
