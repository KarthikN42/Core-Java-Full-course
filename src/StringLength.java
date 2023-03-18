
public class StringLength {
	String name ="Karthik";
	public void usingLengthFunction() {
		
		System.out.println(name.length());
		
	}
	
	public void WithoutusingLengthFunction() {
		
		
		char[] na = name.toCharArray();
		
		int length =0;
		
		for (char c : na) {
			length++;
		}
		System.out.println(length);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringLength obj = new StringLength();
				obj.usingLengthFunction();
				obj.WithoutusingLengthFunction();

	}

}
