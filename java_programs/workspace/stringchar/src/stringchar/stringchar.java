package stringchar;

public class stringchar {
	char[] a= { 'a','b','h','i','s','h','e','i','k',' ',' '};
	char[] b= new char[14];
	int count=0;
	public void printback()
	{
		//b=a.length;
		//System.out.println(b);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='h' && a[i+1]=='e')
			{
				
				b[i]='s';
				b[i+1]='h';
				b[i+2]='e';
				i=i+2;
				System.out.println("i="+i);
				count=count+2;
			}
			else 
			{
				//System.out.println("count="+count);
				b[i]=a[count];
				count++;
				System.out.println(count);
			}
			
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringchar ch=new stringchar();
		ch.printback();

	}

}
