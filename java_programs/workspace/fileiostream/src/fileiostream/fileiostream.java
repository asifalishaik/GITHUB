package fileiostream;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileiostream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:/Users/ASIF/Desktop/linux/text.txt");
		File file1 = new File("C:/Users/ASIF/Desktop/linux/output.txt");
		FileInputStream input = new FileInputStream(file);
		FileOutputStream output = new FileOutputStream(file1);
		byte[] b=new byte[(int) file.length()];
		long length=file.length();
		System.out.println("length"+length);
		char count=48;
		if(file.exists())
		{
			try
			{
			int inread=input.read(b);
			if(inread!=-1)
			{
				for(int i=0;i<b.length;i++)
				{
					if(b[i]==13)
					{
						count++;
					}
					//output.write((char)b[i]);
				}
				System.out.println("no of lines :"+count);
				output.write("no of lines:".getBytes());
				output.write((char)count);
				output.write((char)13);
				output.write((char)10);
				for(int i=0;i<b.length;i++)
				{
					output.write((char)b[i]);
				}
			}
		}
		//output.write(count);
	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			//System.out.println(file1.length());
		output.close();
		input.close();
		}
		}// end of file exits();
		else
		{
			System.out.println("file not found");
		}
	}

}
