import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	String name = "KarthiK";

	public void UsingStringBuilder() {

		StringBuilder name1 = new StringBuilder(name);
		System.out.println("Using String Builder " + name1.reverse());
	}

	public void UsingLogic() {
		char[] logic = name.toCharArray();
		String Reversed = "";

		for (int i = logic.length - 1; i >= 0; i--) {

			Reversed = Reversed + logic[i];

		}

		System.out.println("Using Logic " + Reversed);

	}
	
	public void collections() {
		
		char[] logic = name.toCharArray();
		
		List<Character> list = new ArrayList<Character>(); 
		
		for (char c : logic) {
			list.add(c);
		}
			Collections.reverse(list);
			ListIterator obj = list.listIterator();
			
			while(obj.hasNext()) {
				System.out.println("Using Collectionss "+obj.next());	
		}
		
		
		
		
	}

	public static void main(String[] args) {

		ReverseString obj = new ReverseString();
		obj.UsingStringBuilder();
		obj.UsingLogic();
		obj.collections();

	}
}
