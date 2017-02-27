package Exceptions;

/**
 * ExistingDiskException occurs in order to avoid duplicate disks.
 * @author Pedro Luis Rivera
 *
 */
public class ExistingDiskException extends RuntimeException {

	/**
	 * Constructs an ExistingDiskException.
	 * @param msg issue or information related to the exception.
	 */
	public ExistingDiskException(String msg){
		super(msg);
	}
	
}
