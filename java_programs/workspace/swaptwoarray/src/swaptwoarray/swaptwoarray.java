package swaptwoarray;

public class swaptwoarray {
	int[] a={1,2,3,4,5};
	int[] b={6,7,8,9,10};
	int temp=0;
	public void swaparray()
	{
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			a[i]=b[(b.length-1)-i];
			b[(b.length-1)-i]=temp;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println("array a"+a[j]);
			System.out.println("array b"+b[j]);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swaptwoarray swp= new swaptwoarray();
		swp.swaparray();

	}

}
