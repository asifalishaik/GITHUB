package streams;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
import java.io.FileInputStream;

public class filestream{
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0;
		File file = new File("C:/Users/ASIF/Desktop/linux/text.txt");
		File file1 = new File("C:/Users/ASIF/Desktop/linux/text1.txt");
		byte[] array = new byte[665];
		if(file.exists())
		{
		FileInputStream fileinput = new FileInputStream(file);
		//for(int i=0;i<12;i++)
		//{
		try{
        int iread= fileinput.read(array);
        System.out.println(iread);
        if(iread !=-1)
        {
//        	if(iread==10)
//        	{
//        		count++;
//        	}
        for(int i=0;i<array.length;i++)
        {
        	if(array[i]=='\n')
        	{
        		count++;
        	}
        	System.out.print(array[i]);
        	//System.out.println((char)13);
        	System.out.println("char of+ array[i]+ : "+(char)array[i]);
        	//System.out.println("count is: "+count);
        }
		//System.out.print((char)iread);
		//}
FileOutputStream fileoutput = new FileOutputStream(file1);
		//System.out.println("in out file"+count);
		
		fileoutput.write("count :".getBytes());
		fileoutput.write((char)count);
		fileoutput.write((char)13);
		//int iwrite = fileoutput.write(array);
		for(int j=0;j<array.length;j++)
		{
			fileoutput.write(array[j]);
		}
		fileoutput.close();
fileinput.close();
		}
		}
		catch( Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			//System.out.println((char)45);
			//fileoutput.close();
			fileinput.close();
			System.out.println("count is:" +count);
			
		}
		
		}
		else
		{
			System.out.println("file not found");
		}
//  	byte[] barray =new byte[655];
//		FileOutputStream fileoutput = new FileOutputStream(file1);
//		
//		fileoutput.write((int)count);
//		int iwrite = fileoutput.write(barray);
//		DataInputStream dt = new DataInputStream(new FileInputStream(file));		
//		String readline= dt.readLine();
//		String[] parts=readline.split(",");
//		String name=parts[0];
//		System.out.println(name);
		}

}
