package numlength;

public class Numlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,count=0;
		while(a>0)
		{
			count=count+1;
			a=a/10;
		}
		System.out.println(count);
	}
}
