import java.util.Scanner;

public class OddOrEvenNumber {

	public void number() {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = obj.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddOrEvenNumber obj = new OddOrEvenNumber();
		obj.number();

	}

}
