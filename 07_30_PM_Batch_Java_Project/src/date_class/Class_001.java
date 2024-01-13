package date_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class_001 {

	public static void main(String[] args) {
		
		// Print date and time
		Date d = new Date();
		System.out.println(d.toString());
		
		// dd-mm-yyyy-hh:mm:ss
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        System.out.println(s.format(d));
        
        SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(s1.format(d));
	}

}
