package binary;

public class binary {
int[] a={5,8,10,15,20};
int key=15;
int lo=0,hi=a.length-1;
int mid=(lo+hi/2);
public void search()
{
	int lw=mid-1,lwd=mid+1;
if(key==a[mid])
{
	System.out.println("element found at middle and index at "+mid);
}
if(key<a[mid])
{
	for(int i=lo;i<=lw;i++)
	{
		if(key==a[i])
		{
			System.out.println("element found in first half"+key);
		}
		
	}
}
if(key>a[mid])
{
	for(int i=lwd;i<=hi;i++)
	{
		if(key==a[i])
		{
			System.out.println("element found in second half"+key);
		}
		
	}
}
else
	System.out.println("element not found");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary sr=new binary();
		sr.search();

	}

}
