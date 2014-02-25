package serial;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class serial {
	ArrayList a1;
	public serial(ArrayList a1) {
		// TODO Auto-generated constructor stub
		this.a1=a1;
	}

	public void seriallize() throws IOException
	{
		
		File file=new File("C:/Users/ASIF/Desktop/linux/1.txt");
		File objfile = new File("C:/Users/ASIF/Desktop/linux/object.txt");
		FileOutputStream objser = new FileOutputStream(objfile);
		ObjectOutputStream objstream = new ObjectOutputStream(objser);
		FileInputStream input= new FileInputStream(file);
		DataInputStream dt=new DataInputStream(new FileInputStream(file));
		//char[] b =new char[(int)file.length()];
		byte[] a =new byte[(int)file.length()];
		//dt.read(b);
		int count=0;
		input.read(a);
		for(int n=0;n<a.length;n++)
		{
			if(a[n]==13)
			{
				count++;
			}
		}
		//System.out.println("no of lines"+count);
		for(int i=0;i<count+1;i++)
		{
//			while(dt.readLine()!=null)
//			{
		String readline=dt.readLine();
		System.out.println(readline);
		String[] parts=readline.split("\\|");
//		String name=parts[1];
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);
		System.out.println(parts[3]);
		employee emp=new employee();
		emp.setEmpname(parts[0]);
		emp.setEmpsal(Integer.parseInt(parts[1]));
		emp.setEmpno(Integer.parseInt(parts[2]));
		emp.setEmpbranch(parts[3]);
		objstream.writeObject(emp);
		a1.add(emp);
		}
		objstream.close();
		input.close();
		dt.close();
		System.out.println("no of lines in file:"+count);
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList a1= new ArrayList(); //to store objects collections (lists are used )
		serial sz=new serial(a1);
		sz.seriallize();
		System.out.println("completed");
		System.out.println("elements in list a1 is :"+a1);
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			//itr.next();
			System.out.println(itr.next());
		}
		System.out.println(a1.size());
		System.out.println(a1.get(4));
		for (Object object : a1) {
			System.out.println(object);
		} 
		
	}

}
