package lab3;

public class Lab3_1 {
/**
 * @author Saksham
 */
	void getSecondSmallest(int arr[])
	{
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
		System.out.println(arr[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3_1 s=new Lab3_1();
		int []arr= {2,5,3,1,4};
		s.getSecondSmallest(arr);
	}
}
