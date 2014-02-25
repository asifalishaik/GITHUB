package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class listarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a1 = new ArrayList<String>();
ArrayList a2 = new ArrayList();
a1.add("A");
a1.add("B");
a1.add("C");
a1.add("E");
a1.add("D");
a1.add("F");
System.out.println("size of list a1 is :"+a1.size());
a1.add(5,"q");
System.out.println("elements in list"+a1);
a2.addAll(a1);
System.out.println("elements in a2 is "+a2);
a2.addAll(3,a1);
System.out.println("elements in a2 after index 3"+a2);
a2.clear();
System.out.println("elements in a2 after clear() is "+a2);
System.out.println(a1.clone());
if(a2.contains("A"))
{
	System.out.println("element found");
}
else if(a1.contains("A"))
{
	System.out.println("element found in a1 list : "+a1.contains("A"));
}
//a2.ensureCapacity(10);
//System.out.println(a2.size());
//a2.addAll(3,a1);
//System.out.println("elements in a2 after index 3"+a2);
System.out.println(a1.get(4));
System.out.println(a1.indexOf("D"));
a1.remove("q");
System.out.println("new elements in a1 :"+a1);
System.out.println(a1.set(2, "element"));
System.out.println("new elements in a1 :"+a1);
String[] emp = a1.toArray(new String[a1.size()]);
for (int i = 0; i < emp.length; i++) {
System.out.println(emp[i]);	
}
List a3=Arrays.asList(emp);
System.out.println(a3);
//(Object[]) a2.toArray(new Object[a2.size()])
Iterator itr = a1.iterator();
while(itr.hasNext())
{
	String str = (String)itr.next();
	System.out.println("itr elements"+str);
}

	}

}
