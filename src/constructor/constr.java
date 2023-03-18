package constructor;

public class constr {
	
	String name;
	int no;
	
	constr(String cname,int cno) {
		name =cname;
		no=cno;
		System.out.println(name);
		System.out.println(no);
	}
	
	constr(){
		
		System.out.println(name);
	}
	
	constr(int no ,String name){
		
		
		System.out.println(no);
		System.out.println(name);
	}
	 public void constr1() {
		 System.out.println("name is "+ name + "The no is "+ no);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constr cwb = new constr();
		constr cwb1 = new constr("kar", 7);
		constr cwb3 = new constr(45,"Ns200");
		cwb3.constr1();

	}

}
