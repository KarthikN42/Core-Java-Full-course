
public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenNumber =768;
		int reversedNumber =0;
		
		while(givenNumber !=0) {
			
			reversedNumber = reversedNumber*10;
			reversedNumber = reversedNumber+givenNumber%10;
			givenNumber =givenNumber/10;
			
		}
		
		System.out.println(reversedNumber);

	}

}
