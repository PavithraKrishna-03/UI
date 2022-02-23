package Coding;

import java.util.ArrayList;
import java.util.Iterator;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> l = new ArrayList<String>();
		l.add("Hi");
		l.add("Hello");
		l.add("Happy");
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
