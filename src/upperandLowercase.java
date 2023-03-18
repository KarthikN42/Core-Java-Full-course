
public class upperandLowercase {
	
	public void tolowercase() {
		String givenString = "Hello I am Karthik";
		char[]charArray = givenString.toCharArray();
		
		for(int i=0;i<givenString.length();i++) {
			if(charArray[i]>=65 && charArray[i]<=90) {
				charArray[i]= (char) (charArray[i]+32);
			}
		}
		
	   for(int i=0;i<givenString.length();i++) {
		   System.out.print(charArray[i]);
		   
		   
	 
	}
	   System.out.println();
	}
	
	public void upperCase() {
		String givenString = "Hello I am Karthik";
		char[]charArray = givenString.toCharArray();
		
		for(int i=0;i<givenString.length();i++) {
			if(charArray[i]>=95 && charArray[i]<=122) {
				charArray[i] = (char)  (charArray[i]-32);
			}
		}
		
		for(int i=0;i<givenString.length();i++) {
			   System.out.print(charArray[i]);
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		upperandLowercase obj = new upperandLowercase();
		obj.tolowercase();
		obj.upperCase();
	}

}
