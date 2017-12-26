import java.util.*;
public class Collection
{
	public static void main(String args[])
	{
		System.out.println("Array List ");
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(3);
		Iterator<Integer> it=a.iterator();
		while(it.hasNext())
		{
			int val=it.next();
			System.out.println(val);	
		}


		System.out.println("Linked List ");  
		LinkedList<String> l=new LinkedList<String>();
		l.add("ABC");
		l.add("T");
		l.add(1,"G");
		Iterator<String> it1=l.iterator();
		while(it1.hasNext())
		{
		 	String val=it1.next();
			System.out.println(val);
		}
		
		System.out.println("Hash Map "); 
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(1,"B");
		h1.put(2,"A");
		h1.put(3,"C");
		Set set=h1.entrySet();
		Iterator it2=set.iterator();
		while(it2.hasNext())
		{
			Map.Entry me=(Map.Entry)it2.next();
			System.out.print(me.getKey()+" : ");
			System.out.println(me.getValue());  
		}

		
	}
}

********************************OUTPUT***************************

F:\Java>java Collection
Array List
1
5
3
Linked List
ABC
G
T
Hash Map
1 : B
2 : A
3 : C



