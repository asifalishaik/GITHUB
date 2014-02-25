package strings;


public class stringcmp {
	String s="hello, how r, u?";
	String s1="hi good.";
	public void compare()
	{
		if(s.equals(s1))
		{
			System.out.println("equal");
		}
	}
	public void searchindx()
	{
		System.out.println("index is at"+ s.indexOf("ello"));
		
	}
	public void replace()
	{
		//s.replace('e', 'r');
		System.out.println(s.replace('l','r'));
		System.out.println(s1.replaceAll("hi", "hellonew"));
		
	}
	public void substr()
	{
		System.out.println(s.substring(2, 7));
		System.out.println(s.trim());
		System.out.println(s.charAt(2));
		System.out.println(s.compareTo(s1));
		String[] split= s.split(",");
		System.out.println(split);
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
			
		}
		System.out.print(s.contains("how"));
		float a=(float) 3.5;
		int d= (int)a;
		String s3="1432";
		char[] charArray = s3.toCharArray();
		
		StringBuilder builder = new StringBuilder();
		Integer in = new Integer(10);
		
		
//		int d= Integer.valueOf(s3);
//    	System.out.print(d);
//    	System.out.println(d+1);
//        String s4=Integer.toString(d);
//		System.out.println(s4);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringcmp scmp=new stringcmp();
		scmp.compare();
		scmp.searchindx();
		scmp.replace();
		scmp.substr();
	}

}
