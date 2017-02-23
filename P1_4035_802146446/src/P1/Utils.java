package P1;

public class Utils {

	public static boolean powerOf2(int valueToCompare) {
		if(valueToCompare < 0){ throw new IllegalArgumentException("powerOf2: Invalid input - " + valueToCompare); }
		return (valueToCompare != 0) && ((valueToCompare & (valueToCompare - 1)) == 0);
	}

}
