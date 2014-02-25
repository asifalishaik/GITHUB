package whiletrue;

import java.io.IOException;

public class whiletrue implements Runnable{
	Thread t;
	
	public whiletrue() {
		System.out.println("inside constructor" );
	t=new Thread(this);
	System.out.println("thread name"+t);
	t.start();
	}
	
	public void run() {
		try{
	System.out.println("thread status"+t.isAlive());
	t.setPriority(6);
	System.out.println(t.getPriority());
			for (int i = 0; i <5; i++) {
			System.out.println("thread"+t+"value of i"+i);
			
				Thread.sleep(100);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("completed in run");
		}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		int read;
//		
//		
//		while(true)
//		{			
//			//System.out.println("enter your choice y/n");
//			read= System.in.read();
//			if(read=='y')
//			{
//			System.out.println("do u want to continue y/n");
//			}
//			if(read=='n')
//			{
//				System.out.println("exit");
//				break;
//			}
//				
//			}
		new whiletrue();
		try
		{
		
			System.out.println("back to main");
			Thread.sleep(1000);
		
		}catch(Exception e)
		{
			e.getMessage();
		}
System.out.println("completed in main");
	}
		
	}
	

	

