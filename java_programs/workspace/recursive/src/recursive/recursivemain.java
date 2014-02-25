package recursive;

public class recursivemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursive re=new recursive(10);
		for(int i=0;i<10;i++)
		{
			re.value[i]=i;
			
		}
		re.printarry(10);

	}

}
