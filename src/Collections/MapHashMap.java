package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {
	
	public void hashmap() {
		
		HashMap<Integer, String > hm = new HashMap<Integer, String >();
		hm.put(1, "karthik");
		hm.put(1, "karthik");
		hm.put(4, "vineeth");
		hm.put(3, "bhuvi");
		hm.put(2, "vickey");
		hm.put(5, "karthik");
		
		System.out.println("1) Hm not allowed duplicate keys but allow values "+ hm);
		
		Map<Integer, String> hm1duplicate = new HashMap<Integer, String >();
		hm1duplicate.putAll(hm);
		
		System.out.println("2) another Duplicate map" + hm1duplicate );
		hm1duplicate.clear();
		
		System.out.println("3) after clear all "+hm1duplicate);
		
		System.out.println("4) contains key methods return true or false "+hm.containsKey(1));
		
		System.out.println("5) contains value methods return true or false "+hm.containsValue("bh"));
		
		System.out.println("6) clone methods "+hm.clone());
		
		System.out.println("7) is empty "+ hm1duplicate.isEmpty());
		
		System.out.println("8) keyset is used to get only key "+ hm.keySet());
		
		System.out.println("9) get method return value of 1  "+ hm.get(1));
		
		System.out.println("9) value method return only value  "+ hm.values());
		
		System.out.println("10) Entry set  method return all value and keys "+ hm.entrySet());
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapHashMap obj = new MapHashMap();
		obj.hashmap();

	}

}
