package kannadiga;
import java.util.Scanner;

import java.util.Scanner;

public class leafyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any year:");
		int year  = s.nextInt();
		boolean flag=false;
		if(year % 400 == 0)
		{
			flag = true;
		}
		else if (year % 100 == 0)
		{
			flag = false;
		}
		else if(year % 4 == 0)
		{
			flag = true;
		}
		else
		{
			flag = false;
		}
		if(flag)
		{
			System.out.println("Year "+year+" is a leap Year");
			
		}
		else
		{
			System.out.println("Year "+year+" ir not a leap Year");
			
			
		}

		
			

	




	}

}
