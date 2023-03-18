
public class ExtractNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="karthik127";
		int digit=0;
		for(int i=0;i<name.length();i++) {
			char chart = name.charAt(i);
			
			if(Character.isDigit(chart)) {
				digit = digit+Character.getNumericValue(chart);
			}
		}
     System.out.println(digit);
	}

}
