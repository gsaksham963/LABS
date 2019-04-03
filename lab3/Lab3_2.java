package lab3;

public class Lab3_2 {
/**
 * @author Saksham
 */

	void getSorted(String arr[])
	{
		String temp;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		String [] s=new String[n];
		for(int i=0;i<n;i++)
		{
			if(i<((n+1)/2))
			{
				s[i]=arr[i].toUpperCase();
				//System.out.println(arr[i]);
			}
			else
			{
				s[i]=arr[i];
			}
		}
		for(String s1:s)
		{
			System.out.print(s1+"\t");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"aaa","ggg","ddd","bbb","ccc"};
		Lab3_2 ss=new Lab3_2();
		ss.getSorted(s);
	}

}
