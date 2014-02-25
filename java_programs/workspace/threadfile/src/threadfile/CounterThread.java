package threadfile;

public class CounterThread extends Thread{

	protected Counter counter = null;

	public CounterThread(Counter counter){
		this.counter = counter;
	}

	public void run() {
		try {
			for(int i=0; i<10; i++){
				counter.add(i);
//				sleep(50);
			}
		} catch (Exception exception){
			
		}

		}
	}