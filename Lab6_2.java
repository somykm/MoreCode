
/*
 * date:09/29/22
 * author:sk
 * in this program, you need to implement a class called Time. Class will have hour,minute,second
 * a) it needs to have an input method that receives input from kb and assigns corresponding values to each time obj
 * (EX: obj t1=> hour= 18, minute=14, second= 18)
 * In military format
 * b) add following methods:
 * 		1)PrintStandardtime:
 * 					This method will print to the screen , the time in the standard format
 * 					(Ex:h:m:s AM/PM, 6:14:18)
 * 		2)PrintMilitaryTime: this method will print to the screen , the time in the military format
 * 		(h:m:s  18:14:18)
 * Output ex:
 * 	Based on your entry , the Standard time is 7:25:46 PM
 * 	Based on your entry , the Military time is 19:25:46 PM
 */
import java.util.*;

public class Lab6_2 {
	public int hour;
	public int minute;
	public int second;
	public boolean am=false;
	public boolean pm=false;

	public void input()
	{
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Enter the hour:");
		hour=kb.nextInt();
		if(hour>=0 && hour<24)
		{
			System.out.println(hour);
		}
		else
		{
			System.out.println("Enter a valid number!");
			hour=kb.nextInt();
		}
		System.out.println("Enter the minute:");
		minute=kb.nextInt();
		if(minute>=0 && minute <=60)
		{
			System.out.println(minute);
		}
		else
		{
			System.out.println("Enter a valid number for minute!");
			minute=kb.nextInt();
		}
		System.out.println("Enter the second:");
		second=kb.nextInt();
		if(second>=0 && second<=60)
		{
			System.out.println(second);
		}
		else
		{
			System.out.println("Enter a valid number for second!");
			second=kb.nextInt();
		}
		System.out.println("Is it in the morning?");
		am=kb.nextBoolean();
		System.out.println("Is it in the afternoon?");
		pm=kb.nextBoolean();
		
		kb.close();
	}
	
	public void PrintStandardTime()
	{
		if(hour<=12 && am==true)
		{
			System.out.println("Based on your entry, the standard time is "+hour+ ":"+ minute+ ":"+second +" AM");	
		}
		else if(hour>12 && pm==true)
		{
			System.out.println("Based on your entry, the standard time is "+(hour-12)+ ":"+ minute+ ":"+second +" PM");
		}
		else if((hour-12<11) && pm==true)
		{
			System.out.println("Based on your entry, the standard time is "+hour+ ":"+ minute+ ":"+second +" PM");
		}
		else if(hour<12 && am!=true)
		{
			System.out.println("Based on your entry, the standard time is "+hour+ ":"+ minute+ ":"+second +" PM");
		}
	}
	
	public void PrintMilitaryTime()
	{
		if(hour<12 && am==true)
		{ 
			System.out.print("Based on your entry, the Military time is ");
			System.out.println((0+hour)+":"+ minute+ ":"+second + " AM");
		}
		else if(hour<12 && pm==true)
		{
			System.out.println("Based on your entry, the Military time is "+(12+hour)+":"+ minute+ ":"+second + " PM");
		}
		else
		{
			System.out.println("Based on your entry, the Military time is "+hour+":"+ minute+ ":"+second + " PM");
		}
	}
	public static void main(String[] args) 
	{
		Lab6_2 t1=new Lab6_2();
		t1.input();
		t1.PrintStandardTime();
		t1.PrintMilitaryTime();
	}
}
