package Enum;


	
	enum values
	{
		SMALL,MEDIUM,LARGE,EXTRALARGE;
		
		values()
		{
			System.out.println("constructor invoked");
		}
		
		static int val=10;
		
		public static void getval()
		{
			
			System.out.println("inside getval()");
			System.out.println("val is:"+val);

		}
	}
	
	public class Enumdemo{
		
		public static void main(String[] args) {
			//values pizzasize= values.SMALL;
			//System.out.println(pizzasize);
			//pizzasize.getval();
			
			values.getval();
			
			
		}

		}
		
	
	


