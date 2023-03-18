import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class smallestNumber {
	
	public void smallestNo() {
		int givenno[]= {34,55,2,54,59,1,56};
		int smallestno=Integer.MAX_VALUE;
		//System.out.println(smallestno);
		
		for(int i=0;i<givenno.length;i++ ) {
			if(givenno[i]<smallestno) {
				smallestno=givenno[i];
			}
			
			
		}
		System.out.println(smallestno);
	}
	
	
	public void usingArray(){
		int givenno[]= {34,55,2,54,59,5,7};
		Arrays.sort(givenno);
		System.out.println(givenno[0]);
	}
	
	
	public void usingCollections() {
		Integer givenno[]= {34,55,2,54,59,5,7};
		
		List<Integer> list =Arrays.asList(givenno);
		Collections.sort(list);
		int smallestNo = list.get(0);
		System.out.println(smallestNo);
		}
	
	public void usingtwoforloops() {
		
		int givenno[]= {34,55,0,2,54,59};
		int smallest=0;
		
		for (int i=0;i<givenno.length;i++) {
			 for(int j=0;j<=i;j++) {
				 smallest=givenno[i];
				 
			 }
			// System.out.println(smallest);
			
		}
		System.out.println(smallest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smallestNumber no = new smallestNumber();
		no.smallestNo();
		//no.usingArray();
		//no.usingCollections();
		//no.usingtwoforloops();
	}

}
