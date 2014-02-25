package multithread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class multithread extends Thread {
	BufferedReader buffr = null;
	BufferedWriter buffw = null;
	int j;
	int slp;
	int i=0;
	
	
	public multithread(int j,BufferedReader buffr1,int slp,BufferedWriter buffw) {
		// TODO Auto-generated constructor stub
		this.buffr= buffr1;
		this.j=j;
		this.slp=slp;
		this.buffw=buffw;
	}
	
	
	 public synchronized void run()
		{
		 try
		 {
			 String line = null;
		 while( (line = buffr.readLine())!=null)
			{
				//sleep(300);
				System.out.println("line by thread"+j);
				buffw.write("line by thread"+j+"  ");
				buffw.write(line);
				buffw.newLine();
				System.out.println("line written"+line);
				//yield();
				sleep(slp);
				
			}
		 System.out.println("thread"+j +"completed execution");
			//System.out.println("completed thread"+j);
			buffr.close();
			buffw.close();
		 }
		 catch(Exception e)
		 {
			 e.getMessage();
		 }
			}
			

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		File file = new File("C:/Users/ASIF/Desktop/linux/1.txt");
		FileReader fread = new FileReader(file);
		BufferedReader buffr= new BufferedReader(fread);
		File file1 = new File("C:/Users/ASIF/Desktop/linux/buff.txt");
		//System.out.println("thread started"+j);
		FileWriter fwrite = new FileWriter(file1);
		BufferedWriter buffw= new BufferedWriter(fwrite);
		multithread th1 =new multithread(1,buffr,500,buffw);
		multithread th2 =new multithread(2,buffr,500,buffw);
//		th2.join();
//		th1.join();
		th1.start();
		
		th2.start();
		//th2.join();
//		multithread th3 =new multithread(3,buffr,500,buffw);
//		th3.start();
//		multithread th4 =new multithread(4,buffr,500,buffw);
//		th4.start();
		
		System.out.println();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
