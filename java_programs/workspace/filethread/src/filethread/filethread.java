package filethread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filethread extends Thread{
	BufferedReader buffr = null;
	int j;
	int slp;
	int i=0;
	
	
	public filethread(int j,BufferedReader buffr1,int slp) {
		// TODO Auto-generated constructor stub
		this.buffr= buffr1;
		this.j=j;
		this.slp=slp;
	}
	

	
	synchronized public void start()
	{
		super.start();
	}
	 public synchronized void run()
	{
		try
		{
			File file1 = new File("C:/Users/ASIF/Desktop/linux/buff"+i+".txt");
			++i;
			System.out.println("thread started"+j);
			FileWriter fwrite = new FileWriter(file1);
			BufferedWriter buffw= new BufferedWriter(fwrite);
		while(buffr.readLine()!=null)
		{
			//sleep(300);
			String line = buffr.readLine();
			System.out.println("line by thread"+j);
			buffw.write("line by thread"+j);
			buffw.write(line);
			buffw.newLine();
			System.out.println("line written"+line);
			yield();
			sleep(slp);
			
		}
		//th2.join();
		System.out.println("thread"+j +"completed execution");
		System.out.println("completed thread"+j);
		buffr.close();
		buffw.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	 
	
	 
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			Thread t = Thread.currentThread();
			t.setName("my thread");
			System.out.println("thread name after setting"+t);
			System.out.println(t.getName());
		File file = new File("C:/Users/ASIF/Desktop/linux/1.txt");
		FileReader fread = new FileReader(file);
		BufferedReader buffr= new BufferedReader(fread);
		filethread th1 =new filethread(1,buffr,500);
		filethread th2 =new filethread(2,buffr,500);
//		th2.join();
//		th1.join();
		th1.start();
		
		th2.start();
		//th2.join();
//		filethread th3 =new filethread(buffr);
//		th3.start();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
