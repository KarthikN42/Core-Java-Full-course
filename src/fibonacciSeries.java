
public class fibonacciSeries {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		int n1=0;
		int n2=1;
		int nextNum ;
		int lengthofNumber=10;
		
		for(int i=0;i<lengthofNumber;i++) {
			
			System.out.print(n1 + " ");
			nextNum =n1+n2;
			n1=n2;
			n2=nextNum;
			
			
		}
		
		
		
		}

}
