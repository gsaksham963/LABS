package lab3;

public class Lab3_3 {
/**
 *@author Saksham
 */
	
	int reverse(int num)
	{
		int remainder,rev=0;
		while (num > 0)
	    {
	        remainder = num % 10;
	        rev = rev * 10 + remainder;
	        num /= 10;
	    }
		return rev;
	}
	void getSorted(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=reverse(arr[i]);
		}
		int temp;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i:arr)
		{
			System.out.println(i+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3_3 s=new Lab3_3();
		int []arr= {22,54,33,11,42};
		s.getSorted(arr);
	}
}
