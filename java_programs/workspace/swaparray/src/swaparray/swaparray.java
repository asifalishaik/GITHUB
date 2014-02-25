package swaparray;

public class swaparray {
	int[] a={1,2,3,4,5};
	int temp;
	public void swap()
	{
		//System.out.println(a[a.length/2]);
		for(int i=0;i<(a.length/2);i++ )
		{
			temp=a[i];
			a[i]=a[(a.length-1)-i];
			a[(a.length-1)-i]=temp;
			//System.out.println(a[i]);
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swaparray sw =new swaparray();
		sw.swap();

	}

}
