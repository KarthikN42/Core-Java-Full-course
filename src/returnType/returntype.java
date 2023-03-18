package returnType;

public class returntype {
	
	public Integer collectedamountt =1000;
	public Integer collectedamounttome() {
		System.out.println("amount is collected "+collectedamountt);
		return collectedamountt;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returntype call = new returntype();
		Integer amount = call.collectedamounttome();
		System.out.println("got the amount"+amount);
     
	}

}
