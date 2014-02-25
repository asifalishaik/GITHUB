package tryandcatch;


public class tryandcatch {
	static void method()
	{
		try
		{
		System.out.println("inside method");
		return;
		}
		finally
		{
			System.out.println("in method finally");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		int a=0, c=0;
		//Random r=new Random();
//		for(int i=5;i>-2;i--)
//		{
//			try
//			{
//				c=a/i;
//				System.out.println("value of c in try :"+c+"for i"+i);
//			}
//			catch(Exception e)
//			{
//				System.out.println("message"+e);//e.getMessage());
//			}
//			System.out.println("value of c in for:"+c);
//		}
		try
		{
			c=100/a;
			System.out.println("value of c in first try block"+c);
			try
			{
				c=100/(a-1);
				System.out.println("in 2nd try block"+a);
				if(a==2)
				{
					int b[]={1};
					c=100/a;
					b[42]=c;
				}
			}
			catch(ArrayIndexOutOfBoundsException e)//ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("in final block");
		}

	}

}
