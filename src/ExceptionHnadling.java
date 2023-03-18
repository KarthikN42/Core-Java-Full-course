  
public class ExceptionHnadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int no1=0;
		int no2=4;
		int result =no2/no1;
		System.out.println(result);
	
	}catch(Exception e ){
		
		e.printStackTrace();
		System.out.println("dont divide no by zero ");
		
	}finally{
		System.out.println("finally block will always execute ");
	}

}
}
