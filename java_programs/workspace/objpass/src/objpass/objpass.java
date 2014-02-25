package objpass;

public class objpass {
	int a;
	objpass(int i)
	{
		a=i;
	}
	public objpass incbyten()
	{
		objpass temp=new objpass(a+10);
		System.out.println("for temp"+temp.a);
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objpass ob1=new objpass(2);
		objpass ob2;
		ob2=ob1.incbyten();
		System.out.println(ob1.a);
		System.out.println(ob2.a);
		ob2=ob2.incbyten();
		System.out.println(ob2.a);
		//System.out.println(temp.a);

	}

}
