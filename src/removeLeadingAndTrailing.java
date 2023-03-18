
public class removeLeadingAndTrailing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="   HelloWorld   ";
		System.out.println(str.trim());
		
		System.out.println(str.replaceAll("^[ /t]+ | [ /t]+&", ""));
		
		System.out.println(str.replaceAll("^[ /t]", ""));
	}

}
