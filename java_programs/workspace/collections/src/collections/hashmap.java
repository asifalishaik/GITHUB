package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {
	//ArrayList<employee> al3 = new ArrayList<>();
	public void hashsdd()
	{
		ArrayList<employee> al = new ArrayList<employee>();
		for (int j = 0; j <3; j++) {
			employee emp = new employee();
			emp.setEmpno(j);
			al.add(emp);
		}
		employee emp = new employee();
		emp.setEmpno(1);
		al.add(emp);
//		emp.setEmpno(2);
//		al.add(emp);
//		emp.setEmpno(1);
//		al.add(emp);
//		emp.setEmpno(3);
//		al.add(emp);
//		System.out.println(al);
		System.out.println(al.size());
//		for (employee employee : al) {
//			System.out.println("elements in list al:"+employee);
//		}
		employee em= al.get(2);
		System.out.println(em);
		System.out.println(em.getEmpno());
		HashMap<Integer, ArrayList<employee>> hashmp =new HashMap<Integer,ArrayList<employee>>();
		for (int i = 0; i < al.size(); i++) 
		{
			 employee e = al.get(i);
			if(hashmp.containsKey(e.getEmpno()))
			{
			ArrayList<employee> al1 = hashmp.get(e.getEmpno());
			al1.add(e);
			}
			else
			{
				ArrayList<employee> al2 = new ArrayList<>();
				al2.add(e);
				hashmp.put(e.getEmpno(), al2);
				System.out.println(al2);
			}
			//System.out.println(al2);
		}
		
		System.out.println("map"+hashmp);
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashmap hm = new hashmap();
		hm.hashsdd();

	}

}
