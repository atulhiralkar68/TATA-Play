package genericLibrary;

import java.util.Date;
import java.util.Random;
public class JavaUtils {
	
	/**
	 * used to get the random number range of 1 to 10000
	 * @return
	 */
	public static int getRanDomData() {
		Random random = new Random();
		int  randomData = random.nextInt(10000);
		return randomData;
	}
	/**
	 * used the get the system current data with time
	 * @return
	 */
	public String getSystemDate() {
		Date date = new Date();
		return date.toString();
	}

}
