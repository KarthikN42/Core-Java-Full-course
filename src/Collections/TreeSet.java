package Collections;

import java.util.Iterator;

public class TreeSet {
	
	public void tS() {


			java.util.TreeSet<Integer> ts= new java.util.TreeSet<Integer>();
			ts.add(10);
			ts.add(9);
			ts.add(9);
			ts.add(8);
			ts.add(7);
			ts.add(6);
			
			System.out.println("Sorted in natural order "+ts);
			
			System.out.println("1) first will return 1st value of order "+ts.first());
			
			System.out.println("2) first will return last value of order "+ts.last());
			
			System.out.println("3) Headset will show  all the the lesser of 8 "+ts.headSet(8));
			
			System.out.println("4) tailset will show  all the the higher value of 7 "+ts.tailSet(7));
			
			System.out.println("5) subset will show  inbetween value  "+ts.subSet(7, 10));
			
			System.out.println("6) comparator will show the sorting order name "+ts.comparator());
			
			System.out.println("7) higher will show the higher value of 7  "+ts.higher(7));
			
			System.out.println("8) lower will show the higher value of 7  "+ts.lower(7));
			
			System.out.println("9) pollfirts will retrive and delete the value of first "+ts.pollFirst());
			
			System.out.println("9) after pollfirst "+ts.pollFirst());
			
			System.out.println("10) polllast will retrive and delete the value of last "+ts.pollLast());
			
			System.out.println("10) after polllast "+ts.pollLast());
			
			java.util.TreeSet<Integer> ts1= new java.util.TreeSet<Integer>();
			ts1.add(10);
			ts1.add(9);
			ts1.add(9);
			ts1.add(8);
			ts1.add(7);
			ts1.add(6);
			
			
			Iterator<Integer>  iter = ts1.iterator();
					while(iter.hasNext()) {
						System.out.println("Normal Iterator "+iter.next());
					}
					
					Iterator<Integer>  desc = ts1.descendingIterator();
					while(desc.hasNext()) {
						System.out.println("descending Iterator "+desc.next());
					}
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet obj = new TreeSet();
		obj.tS();

	}

}
