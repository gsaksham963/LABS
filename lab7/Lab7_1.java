package lab7;

import java.util.*;

public class Lab7_1 {
	
	/**
	 * @author Saksham
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		m.put(1, 2);
		m.put(5, 23);
		m.put(3, 2);
		m.put(2, 23);
		Lab7_1 o=new Lab7_1();
		for(Object i : m.entrySet()) {
			System.out.println(i);
		}
	}



}
