package onegbfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class onegbfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:/Users/ASIF/Desktop/linux/file1gb.txt");
//		long length=10485760;
//		FileOutputStream filegb = new FileOutputStream(file);
//		while(file.length()<=length)
//		{
//		filegb.write("swaroop|5000|003|IT".getBytes());
//		filegb.write((char)13);
//		filegb.write((char)10);
//		filegb.write("abc|2000|005|IT".getBytes());
//		filegb.write((char)13);
//		filegb.write((char)10);
//		//System.out.println("file size"+file.length());
//		}
//System.out.println(file.length());
int j=1,i=0,div=4;
byte b[]=new byte[((int)file.length())];
FileInputStream inputgb=new FileInputStream(file);
inputgb.read(b);
for(int m=0;m<div;m++)
{
File file1 =new File("C:/Users/ASIF/Desktop/linux/"+j+".txt");
FileOutputStream out1 = new FileOutputStream(file1);
//long filepointer= out1.getFilePointer();
for(int n=0;n<b.length/div;n++)
{
	out1.write((char)b[i]);
	i++;
}
System.out.println(file1.length());
j++;
}	
		}

}
