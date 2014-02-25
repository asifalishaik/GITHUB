package greater;


public class greater {
//public void bigger()
	//{
	
	//}

	public static void main(String[] args) {
		int multiple=0;
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{
					multiple=i*j;
					System.out.println(i+ "*"+ +j +"="+multiple);
				}
			}
		}
		big b=new big();
		b.inbig();
		
	}

}
	
