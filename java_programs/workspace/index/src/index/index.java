package index;

public class index {
	int finalindex =-1;
	int[] index ={0,30,45,60,90};
	float[] sin={0,(float) 0.5,(float) 0.709,(float) 0.865,1};
	float[] cos={1,(float) 0.865,(float) 0.709,(float) 0.5,0};
	public void indexsearch(int a)
	{
		for(int i=0;i<index.length;i++)
		{
			if(a==index[i])
			{
				finalindex= i;
				value();
			}
			
		}
		if(finalindex==-1) {
			System.out.println("no not found");
		
		 } 
	}
	
	public float value() {
		float tan=sin[finalindex]/cos[finalindex];
		return tan;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		index in=new index();
		in.indexsearch(45);
		//float d=in.value();
		if(in.finalindex != -1){
			System.out.println(in.value());
		}

	}

}
