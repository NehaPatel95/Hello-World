package FunctionalPrograms;
import java.util.Scanner;
//import java.Utility;

public class Sine {
      	//private static final String //Utility = null;

		public static void main(String[] args) {
				// TODO Auto-generated method stub
		             double x;
				System.out.println("Enter number in degree:");
				Scanner sc=new Scanner(System.in);
				x=sc.nextDouble();
		//Utility.sinTaylor(num);
				x=(x%(2*Math.PI));//Convert angle x to an angle between ­2 PI and 2 PI using following logic
				double sinx=0;
				int n=1;
				
					int	N=sc.nextInt();

				int count=0;
				while(count!=N)
				{
				
				
				if(count%2==0)
				{
					sinx=sinx+(Math.pow(x,n)/fact(n));// if my position at even position then add term else subs term
				}
				else {
				sinx=sinx-(Math.pow(x, n)/fact(n));
				}
			
				
				n=n+2;
				count++;}
			
				
		System.out.println(""+sinx);
		}
		 
	      private static double fact(int n) {
			double f=1;
			for(int i=0 ; i<n ; i++ )
				f=f*i;
			{
		return n;
		}
		
		}
	}


