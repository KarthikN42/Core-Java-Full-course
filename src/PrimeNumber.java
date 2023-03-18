import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min,max,flag=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Minimum value");
		 min = obj.nextInt();
		System.out.println("Enter the maximum value");
		 max = obj.nextInt(); 
		 for(int n=min;n<=max;n++) {
			
			 for (int i=2;i<n;i++){
				 if (n%i == 0) {
					 flag =1;
					 break;
				 }
			 }
		 
			 if(flag == 0) {
				 System.out.println("prime numbers are " + n +" ");
			 } 
		 
		 }
		 
		 flag=0;

	}
}

