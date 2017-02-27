package Exceptions;

/**
 * InvalidBlockCapacity occurs to avoid the addition of different blocks (the system must be uniform - same capacity).
 * @author Pedro Luis Rivera
 *
 */
public class InvalidBlockCapacityException extends RuntimeException {
	
	/**
	 * Constructs an InvalidBlockCapacityException.
	 * @param msg issue or information related to the exception.
	 */
	public InvalidBlockCapacityException(String msg){
		super(msg);
	}

}
