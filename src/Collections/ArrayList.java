package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {
	public void example() {

		List<String> arraylist = new java.util.ArrayList<>();
		arraylist.add("karthik");
		arraylist.add("ferrari");
		arraylist.add("ferrari");
		arraylist.add("virtus");
		arraylist.add("civic");

		System.out.println(arraylist);

		System.out.println("1) index of =" + arraylist.indexOf("ferrari")); // index postion

		System.out.println("2) index of value = " + arraylist.get(0)); // index position value

		List<String> anotherArraylist = new java.util.ArrayList<>();
		anotherArraylist.addAll(arraylist); // add to another list

		System.out.println("3) another List = " + anotherArraylist);
		anotherArraylist.clear(); // clear list

		arraylist.remove(1);
		System.out.println("4) Remove using index =" + arraylist); // remove using index value

		arraylist.remove("ferrari"); // remove using value
		System.out.println("5) Remove Using value = " + arraylist);

		arraylist.add(null);
		System.out.println("6) add null value = " + arraylist); // to add null value

		arraylist.set(0, "car");
		System.out.println("7) update the value using set = " + arraylist); // Set the value using index postion

		System.out.println("8) is Empty = " + arraylist.isEmpty()); // Boolean Value

		for (String string : arraylist) {
			System.out.println("9) iterate values are using for Each = " + string);

		}
       
		//forward traversing using ListIterator
		ListIterator<String> listIterator = arraylist.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("Forward Iteration : " + listIterator.next());

		// reverse Iteration using ListIterator
		while (listIterator.hasPrevious()) {
		System.out.println("Reverse Iteration : " + listIterator.previous());
		
		/*Iteration with Iterator (NOTE: Not ListIterator)
		Iterator can only traverse forward but not on reverse.
		Hence we are using ListIterator for better usages.*/

		Iterator< String> iterator=arraylist.iterator();
		while(iterator.hasNext()){
			System.out.println("Forward Only:"+iterator.next());
		}
		}	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj = new ArrayList();
		obj.example();

	}

}
