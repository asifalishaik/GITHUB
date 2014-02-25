package fact;

public class fact {

	int a=100,b=0;
	
	public void sri()
	{
		for(int i=1;i<=a;i++)
			
		{
			for(int j=1; j<=i;j++)
			{
				b=i%j;
				if(b==0)
				{
					System.out.print(" " +j); 
				}
			}
			System.out.println(" " + " for " +i);	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fact f1 = new fact();
		f1.sri();
		
			}

}
