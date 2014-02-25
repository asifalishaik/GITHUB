package randomfile;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File iofile=new File("C:/Users/ASIF/Desktop/files/iofile.txt");
		File opfile=new File("C:/Users/ASIF/Desktop/files/opfile.txt");
		char count= '0';
		System.out.println(iofile.length());
		long length=iofile.length();
		System.out.println("length"+length);
		if(iofile.exists())
		{
			RandomAccessFile ramfile = new RandomAccessFile(iofile, "rw");
			RandomAccessFile dispfile = new RandomAccessFile(opfile,"rw");
			byte[] b = new byte[(int)iofile.length()];
			int i= ramfile.read(b);
			if(i!=-1)
			{
			//System.out.println(i);
				for(int j=0;j<b.length;j++)
				{
				if(b[j]==13)
				{
					count++;
				}
				}
				ramfile.seek(0);
//				ramfile.write((char)13);
//				ramfile.write((char)10);
				ramfile.seek(0);
				String s = "No of lines";
				System.out.println(s.length());
				for(int sb=0;sb<=s.length();sb++)
				{
					ramfile.write((char)32);
				}
				ramfile.write((char)13);
				ramfile.write((char)10);
				ramfile.seek(0);
				ramfile.write(s.getBytes());
				ramfile.write(count);
				System.out.println(count);
//				ramfile.write((char)13);
//				ramfile.write((char)10);
				// writing last line of file to new file
				int lastpos=(int) iofile.length();
				System.out.println(lastpos);
				int presnt = lastpos-12;
				ramfile.seek(presnt);
//				//System.out.println((char)presnt);
				byte[] a = new byte[(int) iofile.length()];
				ramfile.read(a,presnt,12);
				for(int m=presnt;m<iofile.length();m++)
				{
					//int k = ramfile.read();
				System.out.print((char)a[m]);
				dispfile.write((char)a[m]);
				
				}
		
//				while((char)lastpos!=10)
//				{
//					lastpos--;
//					System.out.println("lastpos at present"+lastpos);
//					System.out.println((char)lastpos);
//				}
//				System.out.println("new lastpos"+lastpos);
//				System.out.println((char)lastpos);
//				ramfile.seek(lastpos);
				//if(ramfile.seek(iofile.length())-1 == )
			}
		}

		
	}

}
