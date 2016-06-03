package session3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		System.out.println(RandomGenerator(num1));
		sc.close();
	}
	static int RandomGenerator(int number)
	{
		int n=0;
		DateFormat dateFormat = new SimpleDateFormat("ms");
		Date d1 = new Date();
		int seconds = Integer.parseInt(dateFormat.format(d1));
		if(number>seconds)
		{
			n=seconds;
		}
		else
		{
			if(number==1)
				{
					n=0;
				}
			else if(number==0)
				{
					n=0;
				}
			else 
				{
					n=seconds%number;
				}
		}
		return n;
	}
}
