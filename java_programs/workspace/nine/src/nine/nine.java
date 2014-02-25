package nine;

public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1000,b=0,c=0,d=0,e=0;
		for(int i=1;i<=a;i++)
		{
			b=i%10;
			//System.out.println(b);
			
			c=i%100;
			//System.out.println(c);
			c=c/10;
			//System.out.println(c);
			e=i/100;
			//System.out.println(e);
					d=b+c+e;
			if(d==9)
			{
			System.out.println(i);
			}
			//else
				//System.out.println("not 9");
			//if(i%9==0)
				//System.out.println(i);
			
		}
			
	}
}