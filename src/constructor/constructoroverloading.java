package constructor;

public class constructoroverloading {
	
	String name;
	String no;
	
	constructoroverloading(String name , int no ){
		
		System.out.println(name);
		System.out.println(no);
	}
	constructoroverloading()
	{
		System.out.println("this is just print ");
	}
	constructoroverloading(int name , int no ){
		System.out.println(name);
		System.out.println(no);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructoroverloading obj = new constructoroverloading("karthik",12);
		constructoroverloading obj1 = new constructoroverloading();
		constructoroverloading obj2 = new constructoroverloading(12,12);
	}

}
