package Activities;

import java.util.Arrays;

public class Activitytwovaluetrue {

	public static void main(String[] args) 
	{
		int[] digits= {10,20,30,10,10,50};
		
			System.out.println("Original Array "+Arrays.toString(digits));
		int sn=10;
		int fn=30;
		System.out.println("Result: "+ result(digits,sn,fn));
	}
	public static boolean result(int[] numbers, int sn, int fn) 
	{
		int temp=0;
		for (int number : numbers)
		{
			if(number==sn)
			{
				temp+=sn;
			}
			if(temp>fn) 
			{
				break;
			}
		}
		
		return temp==fn;
		}
	}


