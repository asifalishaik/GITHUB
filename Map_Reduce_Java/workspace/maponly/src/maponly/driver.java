package maponly;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class driver {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Job job = new Job();
		job.setJarByClass(driver.class);
		job.setJobName("Max temperature");
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		job.setMapperClass(MapperTemp.class);
		job.setPartitionerClass(partition.class);
		job.setNumReduceTasks(2);
		job.setReducerClass(ReducerTemp.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		System.exit(job.waitForCompletion(true) ? 0 : 1);
		}
		

	}


