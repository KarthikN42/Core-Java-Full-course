package MethodsOverRiding;

public class ChildClass extends ParentClass{
	
	@Override
	public void amount1() {
		
		System.out.println("this is parent amount1 changed to  CHILD amount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		ParentClass obj = new ChildClass();
		obj.amount();
		obj.amount1();
	}

}
