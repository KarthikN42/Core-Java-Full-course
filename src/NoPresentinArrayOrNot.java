
public class NoPresentinArrayOrNot {
	
	
	public void presentOrNot() {
		int[] givenno= {1,2,3,4,5,6,67,8};
		int noToFind=9; 
		
		boolean found= false;		
		for(int no : givenno) {
			if(no==noToFind){
				System.out.println("number  found ");
				found=true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Number is found ");
		}else {
			System.out.println("Number is not found ");
		}
			
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoPresentinArrayOrNot obj = new NoPresentinArrayOrNot();
		obj.presentOrNot();
		

	}

}
