package nestedclass;

public class outerclass {
	static int n=5;
	//private static inner inner;
	outerclass.inner in =new inner();
	//System.out.println(in.n);
	public void methd()
	{
		inner inn =new inner();
		System.out.println(inn.n);
	}
	public  class inner
	{
		 int n=3;
		
	}
	public static void main(String[] args) {
		System.out.println("starts");
		outerclass ot=new outerclass();
		System.out.println(ot.n);
		ot.methd();

				outerclass.inner in = ot.new inner();
//		outerclass.inner inn =outerclass.new inner();
		System.out.println(in.n);	
	}
	}

