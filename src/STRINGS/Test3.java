package STRINGS;

import java.util.ArrayList;
import java.util.HashSet;

public class Test3  {

	public static void main(String[] args) {
		String s="way to automation";
		
		HashSet set=new HashSet();
		
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
System.out.println(set);
	}

}
