package lab3;

import java.util.HashMap;
import java.util.Map;

public class Lab3_4 {
/**
 * @author Saksham
 */
	void countChar(char[]ch)
	{
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			if(m.containsKey(ch[i]))
			{
				int a=m.get(ch[i]);
				m.put(ch[i], a+1);
			}
			else
			{
				m.put(ch[i], 1);
			}
		}
		System.out.println(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] ch= {'a','b','c','a','b','x'};
		Lab3_4 f=new Lab3_4();
		f.countChar(ch);
	}

}
