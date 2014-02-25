package wordcount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class wordreduce extends Reducer<Text, IntWritable, Text, IntWritable> {

	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Context context) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		int sum = 0;
		for (IntWritable value : values) {
			// maxValue = Math.max(maxValue, value.get());
			sum = sum + value.get();
		}
		context.write(key, new IntWritable(sum));
	}

}
