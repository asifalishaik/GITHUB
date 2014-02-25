package recursive;

public class recursive {
	int value[];
	recursive(int i)
	{
		value=new int[i];
	}
public void printarry(int i)
{
	if(i==0)
		return;
	else printarry(i-1);
	System.out.println("["+(i-1)+"]"+ value[i-1]);
}
}
	
