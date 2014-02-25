package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sets implements Comparable<sets>{
//	HashSet<String> hs;
//	LinkedHashSet<String> ls;
	TreeSet<String> ts;
	sets(TreeSet<String> ts)
	{
//		this.hs=hs2;
//		this.ls=ls;
		this.ts=ts;
	}
	
	public int compareTo(sets set) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void objhs()
	{
//		hs.add("1");
//		hs.add("2");
//		hs.add("3");
//		hs.add("4");
//		hs.add("5");
//		hs.add("1");
//		int a;
//		//for linked hash set
//		ls.add("5");
//		ls.add("2");
//		ls.add("4");
//		ls.add("3");
//		ls.add("5");
//		ls.add("1");
		ts.add("2");
		ts.add("1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<String> hs = new HashSet<String>();
//		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		TreeSet<String> ts = new TreeSet<String>();
		sets st = new sets(ts);
		st.objhs();
//		System.out.println("elements in hash set"+hs);
//		System.out.println("elements in linked hash set"+ls);
		System.out.println("elements in tree set"+ts);
		
		

	}

	
	

}
