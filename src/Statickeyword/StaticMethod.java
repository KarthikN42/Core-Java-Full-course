package Statickeyword;

public class StaticMethod {
	
	public static  void method1()
	{
		System.out.println("this is statickeyord");
	}
 public void method2()
 
 {
	 method1();   //we can call static method from non-static method otherwise not
	 System.out.println("this is non staic");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       method1();
       StaticMethod obj = new StaticMethod();
       obj.method2();
       
	}

}
