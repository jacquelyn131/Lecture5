import java.util.*;

public class Problem1Tester {

	// Tester program that creates an ordered array list of comparable data
	// (dates) and adds 10 dates to the list.  This tester uses the
	// ArrayList class of the Java API.
	
	public static void main(String[] args) {
		
		boolean success;
		CalendarDate date;
		
		ArrayList<CalendarDate> list1 = new ArrayList<CalendarDate>();
		date = new CalendarDate(5, 7, 2010);
		list1.add(date);

		System.out.println("Inserting 10 different dates...\n");
		System.out.println("test: " + myString(list1));

		date = new CalendarDate(3, 16, 1978);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
	
		date = new CalendarDate(1, 25, 1984);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
		
		date = new CalendarDate(6, 8, 2003);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
		
		date = new CalendarDate(3, 12, 1942);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
		
		date = new CalendarDate(8, 13, 1978);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
		
		date = new CalendarDate(1, 28, 1984);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
		
		date = new CalendarDate(4, 25, 1942);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
		
		date = new CalendarDate(12, 8, 2003);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
		
		date = new CalendarDate(10, 3, 2003);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");
		
		date = new CalendarDate(8, 14, 1978);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + myString(list1) + "\n");

	}

	// Inserts the given date into the list in chronological order.
	// Precondition: list is already sorted in chronological order.
	public static void insert(ArrayList<CalendarDate> list, CalendarDate date)
	{
		for (int i = 0; i < list.size(); ++i) 
		{

			//three cases: date is before ith element, after, or equal
			if (date.compareTo(list.get(i)) < 0) // if date is after the ith element, insert right before i
			{
				if (i == 0) 
				{
					list.add(0, date);
					break;
				}
				else 
				{
					list.add(0, date);
					break;
				}
				
			}
			else if (date.compareTo(list.get(i)) > 0)  // if date is before the ith element
			{
				if (i == list.size() - 1) 
				{
					list.add(date);
					break;
				}
			}
			// if date is equal to the ith element
			else if (date.compareTo(list.get(i)) == 0)
			{
				if (i == 0)
				{
					list.add(0, date);
					break;
				}
				else 
				{
					list.add(0, date);
					break;
				}
				
			}
			
			
			
		}




	}
	public static String myString(ArrayList<CalendarDate> lst) 
	{
		String str = "";
		for (int i = 0; i < lst.size(); ++i) 
		{
			str = str + lst.get(i).toString() + ", ";
		}
		return str;
	}

}
