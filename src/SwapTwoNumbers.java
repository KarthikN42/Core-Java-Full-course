
public class SwapTwoNumbers {
	
	public void withUsingThirdVariable() {
		int mySalary=20;
		int seniorSalary=50;
		
		System.out.println("Before Swapping mysalary "+mySalary +" Before Swapping Senior salary " +seniorSalary  );
		
		int temp=mySalary;
		mySalary=seniorSalary;
		seniorSalary=temp;
		
		System.out.println("My Salaray " + mySalary   );
		System.out.println("Senior Salaray " + seniorSalary   );
	}
	
	
	public void withoutUsingThirdVariable() {
		int first=20;
		int second=50;
		
		System.out.println("Before Swapping "+first +" Before Swapping " +second );
		
		first = first-second;
		second= second+first;
		first = second-first;
		
		System.out.println("After Swapping "+first +" After Swapping " +second );
		
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapTwoNumbers obj = new SwapTwoNumbers();
		obj.withUsingThirdVariable();
		obj.withoutUsingThirdVariable();

	}

}
