import java.util.Scanner;

public class PatterProgram {
	
	public void starPatter() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number Of Lines:");
		
		int numberoflines = obj.nextInt();
		
	   int row,coloum=0;
	   
	   for(row=0;row<numberoflines;row++) {
		   
		   for(coloum=0;coloum<=row;coloum++) {
			   System.out.print("*");
		   }
	   
	   System.out.println();

	   }
		}
	
	public void numberPattern() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number Of Lines:");
		
		int startingOfnumbers =1;
		int limit =obj.nextInt();
		
		 int row,coloum=0;
		 
		 for(row=0;row<limit;row++) {
			 
			 for(coloum=0;coloum<=row;coloum++) {
				 System.out.print(startingOfnumbers+" ");
				 startingOfnumbers=startingOfnumbers+1;
				 
			 }
			 System.out.println();
		 }
		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PatterProgram obj = new PatterProgram();
		obj.starPatter();
		obj.numberPattern();
	
	}
}
