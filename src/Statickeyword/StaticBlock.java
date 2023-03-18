package Statickeyword;

public class StaticBlock {
	
	static {
		System.out.println("thsi is static 1");
	}

	
	static {
		System.out.println("thsi is static 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is main block");
		//excuted in static written order can have multiple static block

	}

}
