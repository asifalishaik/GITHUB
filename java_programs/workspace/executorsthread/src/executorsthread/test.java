package executorsthread;

import java.util.concurrent.Callable;

public class test implements Callable<Boolean>{

	int counter =0;
	public test(int counter)
	{
		this.counter=counter;
	}
	
	@Override
	public Boolean call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside test class"+counter);
		if(counter==1)
		{
		return false;
		}
		return true;
	}
	public void setcounter(int counter)
	{
		this.counter=counter;
		// TODO Auto-generated method stub

	}
	

}
