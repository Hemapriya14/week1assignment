package week1.day1;

public class Calculator {

	
		public int c;
		
        public void addTwoNumber()
		{
			int a=10;
			int b=42;
			c=a+b;
			System.out.println(c);
		}
		public void SubTwoNumber()
		{
			//local variable
			int l=23;
			int m=12;
			c=l-m;
			System.out.println(c);
		}
		//argument pass
		public void mulTwoNumber(double a,double b)
		{
			double d=a*b;
	System.out.println(d);
		}
		public void divTwoNumber(float e,float f)
		{
			float s=e/f;
	System.out.println(s);
		}
		
		
		
		public static void main(String[] args)
		{
			Calculator calc=new Calculator();
			calc.addTwoNumber();
			calc.SubTwoNumber();
			calc.mulTwoNumber(20,654);
			calc.divTwoNumber(78.95f, 98.44f);

	}

}
