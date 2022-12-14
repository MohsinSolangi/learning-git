 import java.util.*;
class DayToHour{

public static void main (String args[]){

	Scanner as = new Scanner(System.in);
	
	System.out.print("Enter  days ");
	int day = as.nextInt();

	int hour =  day*24;
	
		System.out.println("days is "+day+" hour will be :" + hour);
}

}