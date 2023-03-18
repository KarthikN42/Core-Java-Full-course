package constructor;

public class parameterconstruct {
	
	String student_name;
	String student_class;
	int studneno;
	
	parameterconstruct(String name,String type)
	{
		student_name =name;
		student_class = type;
	 
	}
	parameterconstruct(String name,String type, int copy)
	{
		student_name =name;
		student_class = type;
		studneno= copy;
	}
	public void para() {
		System.out.println("studne name is " + student_name + " and he is studying "+ student_class);
	}
	public void para1() {
		System.out.println("studne name is " + student_name + " and he is studying "+ student_class + studneno );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		parameterconstruct obj = new parameterconstruct("karthik", "7th");
		obj.para();
		parameterconstruct obj1 = new parameterconstruct("karthik", "7th", 23);
		obj.para1();
		
		
	}
	
}
