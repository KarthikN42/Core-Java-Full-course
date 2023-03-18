
public class ReplaceVowles {
	
	public void withoutUsingRegularExpression() {
		
		String givenWord ="My favourate player is Dhoni";
		char[] changedToArray = givenWord.toCharArray();
		
		for(int i=0;i<givenWord.length();i++) {
			if(givenWord.charAt(i) == 'A' || givenWord.charAt(i) == 'E'|| givenWord.charAt(i) == 'I'|| givenWord.charAt(i) == 'O'
			|| givenWord.charAt(i) == 'U' || givenWord.charAt(i) == 'a'|| givenWord.charAt(i) == 'e'|| givenWord.charAt(i) == 'i'
			|| givenWord.charAt(i) == 'o' || givenWord.charAt(i) == 'u' ) 
				changedToArray[i]='*';
		}
		
		System.out.println(changedToArray);
	}
	
	public void UsingRegularExpression() {
		String givenWord ="My favourate player is Dhoni";
		String new1 =givenWord.replaceAll("[aeiouAEIOU]", "*");
		System.out.println(new1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReplaceVowles obj = new ReplaceVowles();
		obj.withoutUsingRegularExpression();
		obj.UsingRegularExpression();

	}

}
