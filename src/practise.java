import java.util.Scanner;

public class practise {
	
	public void practise() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of fibo: ");
		int lengthofNo = obj.nextInt();
		
		int num1=0;
		int num2=1;
		int fibo ;
	 lengthofNo;
		
		for(int i=0;i<lengthofNo;i++)
	
			System.out.println(num1+" ");
		
			fibo=num1+num2;
			num1=num2;
			num2=fibo;
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		practise obj = new practise();
		obj.practise();
				

	}

}
