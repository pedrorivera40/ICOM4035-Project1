package Exceptions;
/**
 * NonExistingDiskException occurs when the disk doesn't exist.
 * @author Pedro Luis Rivera
 *
 */
public class NonExistingDiskException extends RuntimeException {
	/**
	 * Constructs a NonExistingDiskException.
	 * @param msg issue or information related to the exception.
	 */
	public NonExistingDiskException(String msg){
		super(msg);
	}

}
