package addarray;

public class addarray {
	static int[] a={0,1,2,3,4,5,6,7,8,9};
	static int sum=0,i;
	static void add()
	{
		for(i=0; i<=a.length-3;i++)
		{
			sum=a[i]+a[i+1]+a[i+2];
			System.out.println(a[i]+"+"+a[i+1]+"+"+a[i+2]+"="+sum);
		}
		if(i==a.length-2)
		{
			sum=a[i]+a[i+1];
			System.out.println(a[i]+"+"+a[i+1]+"="+sum);
			System.out.println(a[i+1]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//addarray ad=new addarray();
     add();
	}

}
