package inherit;

public class inherit {

	public void empsal() {
		//if(ih instanceof teacher)
		System.out.println("in main class");

	}

	public void test(inherit ih){
		if (ih instanceof teacher){
			ih.empsal();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int today=30;
		inherit ih = new teacher();
		HeadMaster hm = new HeadMaster();

		((teacher)ih).empName();
		
		ih.test(ih);
		ih.test(hm);

		//ih.empsal();
		//inherit ih=(new teacher());

	}

}
