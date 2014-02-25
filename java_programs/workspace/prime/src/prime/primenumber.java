package prime;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=18,count=0,b=0;
		if(a>2 && a%2==0)			
			System.out.println("not prime");
		else
		{
		for(int i=1;i<a;i++)
		{
			b=a%i;
			if(b==0)
			{
				count=count+1;
			}
				
		}
		if(count==1)
			System.out.println("prime");
			else
				System.out.println("not prime");
		}
	
/*if(count==1)
	System.out.println("prime");
	else
		System.out.println("not prime"); */

	//}
//}

//}*/

int a=1000,b=0;
for(int i=1;i<a;i++)
{
	int count=0;
	for(int j=1;j<i;j++)
	{
		
		b=i%j;
		if(b==0)
		{
			
			count=count+1;
		}
		 
	}
	if(count==1)
		System.out.println("prime no is"+i); 
}


}

}

