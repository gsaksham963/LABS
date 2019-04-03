package lab1;
import java.util.*;
class Lab1_4{
	/**
 * @author Saksham
 */
   boolean b=true;
  public boolean checkNumber(int n){
     while(n!=1){
		 if(n%2!=0)
		  { 
	      b=false;
	      break;
		  }
		   n=n/2;
	    }
		return b;
  }
}
public class Ass4{
	 public static void main(String st[]){
	  Lab1_4 a=new Lab1_4();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.checkNumber(n));
	  
  }
	
}