package genericutilities;

import java.util.Random;

public class JavaUtility {

	public int getRandomNumber() {
		Random ran =new Random();
		return ran.nextInt(100);
	
	}
}
