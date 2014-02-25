package executorsthread;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class testconcurrency {

	public static void main(String[] args) throws Exception, ExecutionException {
		// TODO Auto-generated method stub
		int n=2;
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		List<test> list = new ArrayList<test>();
		for (int i = 0; i <n; i++) {
		test testcallable=new test(i);
		list.add(testcallable);
		}
List<Future<Boolean>> invokeAll =executorService.invokeAll(list);
for (int i = 0; i <n; i++) {
	Future<Boolean> future = invokeAll.get(i);
	if(future.get())
	{
		System.out.println("success");
	}
	else
	{
		System.out.println("failure");
	}
	executorService.shutdown();
}
	}

}
