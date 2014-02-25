package sort;


public class sort {
	int[] a=new int[5];
	int i;
		public void aryy()
		{
			a[0]=9;
			a[1]=3;
			a[2]=4;
			a[3]=2;
			a[4]=1;
			
			


			/*for(i=2;i<a.length;i++)
			{
				a[i]=i;
				System.out.println(a[i]);
			}*/
		}
		
		public void abc ()
		{
			int low,high,temp = 0;
			low=0;
			high=a.length-1;
			System.out.println("low"+low);
			System.out.println("high"+high);
			int pivote=(low+high/2);
			System.out.println("pivote"+ a[pivote]);
		while(low<high)
		{
			while (a[low] < a[pivote])
			{
				low++;
			}
			while(a[high]>a[pivote])
			{
				high--;
			}
			if(low<high)
			{
			temp = a[low];
			a[low]=a[high];
			a[high]=temp;
			}
		}
			/*System.out.println(a[low]);
			System.out.println(a[high]);
			low++;
			high--;
			System.out.println("low++"+low);
			System.out.println("high--"+high);
			if(a[low] >a[pivote])
				if(a[high]<a[pivote])
					 temp = a[low];
				a[low]=a[high];
				a[high]=temp;
				System.out.println(a[low]);
				System.out.println(a[high]);*/
				System.out.println(a[0]+","+a[1]+","+a[2]+a[3]+a[4]);
				System.out.println(a[high]);
				/*if(high<=low)
					temp = a[low];
				a[low]=a[high];
				a[high]=temp;	*/
				int lo=0,hi=low;
				int piv=(lo+hi/2);
				while(lo<hi)
				{
					while (a[lo] < a[piv])
					{
						lo++;
					}
					while(a[hi]>a[piv])
					{
						hi--;
					}
					if(lo<hi)
					{
					temp = a[lo];
					a[lo]=a[hi];
					a[hi]=temp;
					}
				}
				System.out.println(a[0]+","+a[1]+","+a[2]+a[3]+a[4]);
				System.out.println(a[low]);
				int l=low+1,h=high;
				int pi=(l+h/2);
				System.out.println("pi"+pi);
				System.out.println("l"+a[l]+l);
				while(l<h)
				{
					while (a[l] < a[pi])
					{
						l++;
					}
					while(a[h]>a[pi])
					{
						h--;
					}
					System.out.println("a[l]"+a[l]);
					if(l<h)
					{
					temp = a[l];
					a[l]=a[h];
					a[h]=temp;
					}
				}
				
				System.out.println(a[0]+","+a[1]+","+a[2]+a[3]+a[4]);
				
		}
	//}

	
			
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort ac=new sort();
		ac.aryy();
		ac.abc();
		
	}

}

