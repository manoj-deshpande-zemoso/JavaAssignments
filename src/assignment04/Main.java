package assignment04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static final int FIELD_DAY_OF_MONTH = Calendar.DAY_OF_MONTH;
	private static final int FIELD_YEAR = Calendar.YEAR;
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		Main main = new Main();
		sc.nextLine();
		while (testCases-- > 0) {
			String[] dates = sc.nextLine().split(" ");
			Date registeredDate = sdf.parse(dates[0]);
			Date currentDate = sdf.parse(dates[1]);
			System.out.println(main.validateKYC(registeredDate, currentDate));
		}
		sc.close();

	}

	protected String validateKYC(Date registeredDate, Date currentDate) {

		Calendar registeredCal = Calendar.getInstance();
		registeredCal.setTime(registeredDate);
		
		Calendar currentCal = Calendar.getInstance();
		currentCal.setTime(currentDate);
		
		if(registeredCal.compareTo(currentCal)>=0) {
			return "No range";
		}
		
		registeredCal.set(FIELD_YEAR, currentCal.get(FIELD_YEAR));
		if(registeredCal.compareTo(currentCal)>=0) {
			registeredCal.add(FIELD_DAY_OF_MONTH, -30);
			if(registeredCal.compareTo(currentCal)>0) {
				return "No range";
			}
			return sdf.format(registeredCal.getTime()) + " " + sdf.format(currentCal.getTime());
		}
		registeredCal.add(FIELD_DAY_OF_MONTH, 30);
		if(registeredCal.compareTo(currentCal)<0) currentCal.setTime(registeredCal.getTime());
		registeredCal.add(FIELD_DAY_OF_MONTH, -60);
		
		return sdf.format(registeredCal.getTime()) + " " + sdf.format(currentCal.getTime());
	}



}
