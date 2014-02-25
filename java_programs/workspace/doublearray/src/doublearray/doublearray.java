package doublearray;

public class doublearray {
int[][] a=new int[][] { {1,2,3},{4,5,6},{7,8,9} };
//{1,2,3,4,5,6,7,8,9};
int[][] b=new int[][] { {1,2,1},{3,4,2},{4,5,7} };
//int count=0;

public void search()
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			int count=0;
			for(int m=0;m<b.length;m++)
			{
				for(int n=0;n<b[m].length;n++)
				{
					//int count=0;
					if(a[i][j]==b[m][n])
						count=count+1;
					//System.out.println("for"+a[i][j]+"it has"+count);
				}
			}
			System.out.println("for"+a[i][j]+"it has"+count);
		}
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	doublearray d=new doublearray();
	d.search();
	}

}
