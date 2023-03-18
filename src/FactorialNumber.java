import java.util.Scanner;

public class FactorialNumber {
	
	public void number() {
		Scanner obj = new Scanner(System.in);
			System.out.println("Enter the number of factorial: ");
			int number = obj.nextInt();
			
			int fact= number;
			
			for(int i=(number-1); i>=1;i--){
				fact= fact*i;
			}
					
			System.out.println(fact);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
		FactorialNumber obj = new FactorialNumber();
		obj.number();

	}

}
