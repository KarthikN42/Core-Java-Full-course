package Methods;

public class methodOverloading {
	
	
	
	 int add(int a,int b) {
		return(a+b);
		
	}
	
	 int add(int a ,int b,int c) {
		
		return(a+b-c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodOverloading obj = new methodOverloading();
		System.out.println("my value:"+obj.add(5, 6));
		System.out.println("my value:"+obj.add(67, 67, 6));

	}

}
