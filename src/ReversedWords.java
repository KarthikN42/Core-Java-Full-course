
public class ReversedWords {
	
	public void word() {
	
	String given = "Karthik is geneious";
	String reversded="";
	
	String[] tobeReversed= given.split(" ");
	
	for(int i=tobeReversed.length-1;i>=0;i--) {
		reversded=reversded+tobeReversed[i]+" ";
		
	}
	
	System.out.println(reversded);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReversedWords obj = new ReversedWords();
		obj.word();
	}
	

}
