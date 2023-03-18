package Collections;

import java.util.Iterator;

public class Hashset {
	
	public void HashSet() {
	   java.util.HashSet<String> obj = new java.util.HashSet<String>();
	   
	   obj.add("a");
	   obj.add("b");
	   obj.add("b");
	   obj.add("c");
	   obj.add("d");
	   obj.add("e");
	   obj.add(null);
	   
	   System.out.println("1) HashSets inseratiopn order will not maintain And duplicate will not alllowed"+obj);

	   System.out.println("2) HashSets is empty "+ obj.isEmpty());
	   
	   java.util.HashSet<String> anotherHasSet = new  java.util.HashSet<String>();
	   anotherHasSet.addAll(obj);
	   
	   System.out.println("3) another hashSet"+anotherHasSet  );
	   
	   System.out.println("4) size of hashSet "+anotherHasSet.size()  );
	   
	   System.out.println("5) array "+anotherHasSet.toArray()  );
	   
	   
	   Iterator<String> iterator =  obj.iterator();
	   {
		   while(iterator.hasNext()) {
			   System.out.println("HashSet iterator is only have iterator " + iterator.next());
		   }
	   }
	   
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashset obj = new Hashset();
		obj.HashSet();

	}

}
