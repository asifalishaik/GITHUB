package sum;

public class sum {
	int[] a={1,2,3,4,5,6,7,8,9,10};
	int hi=a.length;
	int low=0;
	int n=0;
public void swap()
{
	if(a.length%2!=0)
	{
	int mid=a.length/2;
	System.out.println("mid is"+mid);
	int mid1=(low+(mid-1))/2;
	System.out.println("mid1 is"+mid1);
	int mid2=((mid+1)+hi)/2;
	System.out.println("mid2 is"+mid2);
	System.out.println("a[mid]"+a[mid]);
	System.out.println("a[mid1]"+a[mid1]);
	System.out.println("a[mid2]"+a[mid2]);
	for(int i=0;i<=mid1;i++)
	{
		int temp=a[i];
		a[i]=a[(mid-1)-i];
		a[(mid-1)-i]=temp;
		//System.out.println("array"+a[i]);
	}
	/*for(int i=0;i<=mid;i++)
	{
		System.out.println(a[i]);
	}*/
	for(int j=(mid+1);j<mid2;j++)
	{
		int temp1=a[j];
		a[j]=a[(a.length-1)-n];
		a[(a.length-1)-n]=temp1;
		n++;
		//System.out.println(a[(a.length-1)]);
	}
	/*for(int m=mid+1;m<a.length;m++)
	{
		System.out.println("after mid"+a[m]+"at index"+m);
	}*/
	}
	else
	{
		System.out.println("in else");
		int mid=a.length/2;
		System.out.println("mid is"+mid);
		int mid1=(low+(mid-1))/2;
		System.out.println("mid1 is"+mid1);
		int mid2=((mid+1)+hi)/2;
		System.out.println("mid2 is"+mid2);
		System.out.println("a[mid]"+a[mid]);
		System.out.println("a[mid1]"+a[mid1]);
		System.out.println("a[mid2]"+a[mid2]);
		for(int i=0;i<=mid1;i++)
		{
			int temp=a[i];
			a[i]=a[(mid-1)-i];
			a[(mid-1)-i]=temp;
			//System.out.println("array"+a[i]);
		}
		/*for(int i=0;i<=mid;i++)
		{
			System.out.println(a[i]);
		}*/
		for(int j=(mid+1);j<mid2;j++)
		{
			int temp1=a[j];
			a[j]=a[(a.length-1)-n];
			a[(a.length-1)-n]=temp1;
			n++;
			//System.out.println(a[(a.length-1)]);
		}
	}
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a=100,sum=0;
		for(int i=0;i<=a;i++)
		{
			sum=sum+i;
			System.out.println("sum=" +sum ); 
		}*/
		sum s=new sum();
		s.swap();

	}

}
