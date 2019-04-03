package lab7;

import java.util.*;

public class Lab7_3 {
		
	/**
	 * @author Saksham
	 */

	void square(int[]ch)
	{
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<ch.length;i++)
		{
				m.put(ch[i], ch[i]*ch[i]);			
		}
		System.out.println(m);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,5,4};
		Lab7_3 f=new Lab7_3();
		f.square(a);
	}
}
