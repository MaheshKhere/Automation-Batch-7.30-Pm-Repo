package decision_making_Statement;

public class Class_004 {

	public static void main(String[] args) {
		
		// Week day
		int day_No = 3;
		String days;
		
		switch(day_No) {
		case 1: 
			days = "Monday";
			break;
		case 2: 
			days= "Tuesday";
			break;
		case 3: 
			days= "Wednesday";
			break;
		case 4: 
			days= "Thursday";
			break;
		case 5: 
			days= "Friday";
			break;
		case 6: 
			days= "Saturday";
			break;
		case 7: 
			days= "Sunday";
			break;
			
			default:
				days = "Invalid day";
				break;
		}
		System.out.println("Your day is:- "+ days);

	}

}
