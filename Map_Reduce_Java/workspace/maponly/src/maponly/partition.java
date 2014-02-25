package maponly;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

//public class partition {
	public class partition extends Partitioner<Text, IntWritable>
	{
public int getPartition(Text key, IntWritable value, int numReduceTask)
{
	String year = key.toString();
	String yer = year;
	int yearint = Integer.parseInt(yer);
	if(yearint <= 1988)
	{
		return 0;
	}
	else
	{
		return 1 % numReduceTask;
	}
}
}
