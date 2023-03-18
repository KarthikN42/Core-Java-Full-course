package ConditionalStatements;

public class elseif {
	String mybike="hjvh";
	public void bike()
	{
		if (mybike.equals("hero"))
				{
			System.out.println("your are worng this hero");
		}
		else if (mybike.equals("honda"))
		{
			System.out.println("your are worng this honda ");
		}
		else if (mybike.equals("yamaha"))
		{
			System.out.println("your are worng");
		}
		else if (mybike.equals("Bajaj"))
		{
			System.out.println("your are Right ");
		}
		else 
		{
			System.out.println("tottaly wrong ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elseif obj = new elseif();
		obj.bike();

	}

}
