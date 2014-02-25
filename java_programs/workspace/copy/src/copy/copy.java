package copy;

public class copy {
	int[] a={1,6,9,5,4};
	int[] b=new int [a.length];
	
	public void cyping()
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.println("elements in b are :"+b[i]);
		}
	}
	public void cloning()
	{
		int[] c= a.clone();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(c[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		copy cp=new copy();
		cp.cyping();
		cp.cloning();

	}

}
