package wordcount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class wordmap extends Mapper<LongWritable, Text, Text, IntWritable> {

	@Override
	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		IntWritable one = new IntWritable(1);
		String line = value.toString();
		String[] arrline = line.split(" ");
		for (int i = 0; i < arrline.length; i++) {

			Text word = new Text((arrline[i]));
			context.write(word, one);
		}
	}

}
