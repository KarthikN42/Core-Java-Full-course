package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapLinkedHashMap {
	public void linkedHM() {
	
	LinkedHashMap<String, String> obj = new LinkedHashMap<String, String>();
	obj.put("Bajaj","Ns200");
	obj.put("KTM","Duke");
	obj.put("TVS","Apache");
	
	System.out.println("linkedHashMap will main insertion Order " + obj);
	
	
	HashMap<String, String > hs = new HashMap<String, String >();
	hs.put("Bajaj","Ns200");
	hs.put("KTM","Duke");
	hs.put("TVS","Apache");
	
	
	System.out.println("HashMap will not main insertion Order " + obj);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapLinkedHashMap obj = new MapLinkedHashMap();
		obj.linkedHM();

	}

}
