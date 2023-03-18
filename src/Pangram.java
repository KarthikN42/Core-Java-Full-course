import java.util.Arrays;
import java.util.HashSet;

import Collections.Hashset;

public class Pangram {
	
	public void string() {
		String given ="a,b,c";
		given.toLowerCase();
		String[] givenStringarray = given.split("");
		String compare="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,q";
		String[] CompareStringarray= compare.split("");
		
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(givenStringarray));
		
		
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(CompareStringarray));
		
		set2.removeAll(set1);
		System.out.println(set2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pangram obj = new Pangram();
		obj.string();

	}

}
