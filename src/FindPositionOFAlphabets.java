import java.util.Scanner;

public class FindPositionOFAlphabets {
	
	public void findPositions() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the alphabets");
		
		char givenChar = scan.next().charAt(0);
		
		givenChar=Character.toLowerCase(givenChar);
		
		int asccivalue=(int) givenChar;
		System.out.println(givenChar-96);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindPositionOFAlphabets obj = new FindPositionOFAlphabets();
		obj.findPositions();

	}

}
