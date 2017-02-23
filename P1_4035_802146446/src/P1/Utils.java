package P1;

public class Utils {

	/**
	 * This method determines whether a positive integer is power of two or not.
	 * @param valueToCompare - Positive integer value to analyze.
	 * @return - Returns a true if valueToCompare is power of two, else returns false.
	 */
	public static boolean powerOf2(int valueToCompare) {
		if(valueToCompare < 0){ throw new IllegalArgumentException("powerOf2: Invalid input - " + valueToCompare); }
		return (valueToCompare != 0) && ((valueToCompare & (valueToCompare - 1)) == 0);
	}

}
