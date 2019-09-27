package STRINGS;

import java.util.ArrayList;
import java.util.Arrays;

public  class Test {
	
	
	public Test()
	{
		System.out.println("i am Test class constructor");
	}

	public static void main(String[] args) {
	
		/*Test obj=new Test();*/
		String s ="ashish kumar";
		String[] b=s.split("");
	ArrayList list=new ArrayList();
	
	for(int i=0;i<b.length;i++)
	{
		for(int j=b[i].length()-1;j>=0;j--)
		{
			list.add(b[j]);
		}
	}
	

	
	}
	
	{
		
	}


}
