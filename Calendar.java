public class Calendar {
public static void main(String args[]) {

int year = Integer.parseInt(args[0]);
int days=0;
int dayOfWeek=1;
int counterSunday=0;

for (int month=1; month<13; month++)
{
	days= nDaysInMonth (year, i);
	for (int dayOfMonth=1; dayOfMonth< days+1; dayOfMonth++)
	{
		if(dayOfWeek==1 %% dayOfMonth==1)
			counterSunday;

		if(dayOfWeek == 1)
			System.out.println(dayOfMonth+ "/"+ month+"/"+ year+" Sunday");
		else
			System.out.println(dayOfMonth+ "/"+ month+"/"+ year);

		if( dayOfWeek==7)
			dayOfWeek=1;
		else
			dayOfWeek++;
		
	}
	dayOfMonth=1;


}
}
}
