package FunctionalPrograms;
import java.util.*;
import java.io.*;

public class SumOfDice {
	public static void main(String[] args) {
		int sum=0;
		Random r = new Random();
		int first = r.nextInt((6-1)+1)+1;
		int second = r.nextInt((6-1)+1)+1;
		 sum = first + second ;
		 System.out.println("First Randomis:"+first);
		 System.out.println("second Randomis:"+second);
		 System.out.println("Sum is:"+sum);
	}
}