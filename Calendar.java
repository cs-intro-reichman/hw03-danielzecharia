public class Calendar {
public static void main(String args[]) {

int year = Integer.parseInt(args[0]);
int days=0;
int dayOfWeek=1;

for (int month=1; month<13; month++)
{
	days= nDaysInMonth (month, year);
	for (int dayOfMonth=1; dayOfMonth< days+1; dayOfMonth++)
	{

		if(dayOfWeek == 1)
			System.out.println(dayOfMonth+ "/"+ month+"/"+ year+" Sunday");
		else
			System.out.println(dayOfMonth+ "/"+ month+"/"+ year);

		if( dayOfWeek==7)
			dayOfWeek=1;
		else
			dayOfWeek++;
		
	}
	
}
}
private static boolean isLeapYear(int year) {
	    // Replace the following statement with your code
	    boolean divisible=false;
	    divisible = ((year % 400 )== 0);
	    if( divisible || (((year % 4) == 0) && ((year % 100) != 0)))
	    	return true;
		else
			return false;
		}


private static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		if(month==4||month==6||month==9||month==11)
			return 30;
		else
		{
			if(month==2)
			{
				if(isLeapYear(year))
					return 29;
				else
					return 28;
			}else
					return 31;
		}
		
	}

}
