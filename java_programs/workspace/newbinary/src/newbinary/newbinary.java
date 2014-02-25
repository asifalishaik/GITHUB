package newbinary;

public class newbinary {
	int[] a={5,8,10,15,20};
	int key=20;
	public void sear()
	{
		int lo=0,hi=a.length-1;
		while(lo<=hi)
		{
			int mid=((lo+hi)/2);
			if(key==a[mid])
			{
				System.out.println(a[mid]+",key found");
				break;
			}
				else if(a[mid]<key)
				lo=mid+1;
			else
				hi=mid-1;
			
		}
		
		//System.out.println("key not found");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newbinary bin=new newbinary();
		bin.sear();

	}

}
