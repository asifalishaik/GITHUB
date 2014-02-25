package writefile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.server.tasktracker.userlogs.DeleteJobEvent;

public class writefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		Path pt = new Path("/user/asif/file.txt");
		Path opt = new Path("/asif/fileout.txt");
		//Path dpt = new Path(args[0]);
		InputStreamReader input = new InputStreamReader(fs.open(pt));
		OutputStreamWriter output = new OutputStreamWriter(fs.create(opt));
		BufferedReader br = new BufferedReader(input);
		String line;
		while((line = br.readLine())!=null)
		{
		//br.readLine();
		System.out.println(line);
		output.write(line);
		
	}
		
		System.out.println("file written");
		System.out.println("deleting file");
		//fs.delete(dpt);
		System.out.println("file deleted");
		input.close();
		output.close();

	}
	

}
