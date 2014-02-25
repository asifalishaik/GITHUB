package threadfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class threadfile extends Thread {
	BufferedReader buffread=null;
		//BufferedWriter buffwrite=null;
	
//	public void here() throws IOException
//	{
//		File file = new File("C:/Users/ASIF/Desktop/linux/1.txt");
//		FileReader filein = new FileReader(file);
//		BufferedReader buffread = new BufferedReader(filein);
//		File file1 = new File("C:/Users/ASIF/Desktop/linux/buff.txt");
//		FileWriter fileout = new FileWriter(file1);
//	    BufferedWriter buffwrite = new BufferedWriter(fileout);
//	    
//	}
	public threadfile(BufferedReader buffread) {
		// TODO Auto-generated constructor stub
	this.buffread=buffread;
	}
	public synchronized void start()
	{
		super.start();
	}
	public synchronized void run()
	{
//	int count=0;
//	while(true)
//	{
//		if(count==100)
//		{
//		break;
//		}
//		count++;
//		System.out.println("Thread"+ thread +"count"+count);
//	}
		
		System.out.println("new thread started" );
		try
		{
		File file1 = new  File("C:/Users/ASIF/Desktop/linux/buff.txt");
		FileWriter fileout = new FileWriter(file1);
		BufferedWriter buffwrite = new BufferedWriter(fileout);
//		for(int i=0;i<5;i++)
//		sleep(500);
		while(buffread.readLine()!=null)
		
		{
			
				//sleep(100);
				String line = buffread.readLine();
				System.out.println("line:"+line);
				buffwrite.write(line);
				buffwrite.newLine();
//				buffwrite.write((char)13);
//				buffwrite.write((char)10);
//				sleep(200);
				System.out.println(" new line after :"+line);
				//buffwrite.flush();
				//sleep(500);
				//System.out.println("Thread"+ thread);	
			
			
			
		}
			
		
		buffwrite.close();
		buffread.close();
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:/Users/ASIF/Desktop/linux/1.txt");
		FileReader filein = new FileReader(file);
		BufferedReader buffread = new BufferedReader(filein);
//		File file1 = new File("C:/Users/ASIF/Desktop/linux/buff.txt");
//		FileWriter fileout = new FileWriter(file1);
//		BufferedWriter buffwrite = new BufferedWriter(fileout);
//	String s = buffread.readLine();
//	while(s!=null)
//	{
	threadfile thread=new threadfile(buffread);
	thread.start();
	
//	threadfile thread1 = new threadfile(buffread);
//	thread1.start();
//	buffread.close();
//	 s = buffread.readLine();
//	}
	System.out.println("completed");
	
	}

}
