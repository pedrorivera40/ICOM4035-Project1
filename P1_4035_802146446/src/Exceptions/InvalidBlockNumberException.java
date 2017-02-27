package Exceptions;
/**
 * InvalidBlockNumberException occurs when the index isn't under the specified boundary.
 * @author Pedro Luis Rivera
 *
 */
public class InvalidBlockNumberException extends RuntimeException {
	/**
	 * Constructs an InvalidBlockNumberException.
	 * @param msg issue or information related to the exception.
	 */
	public InvalidBlockNumberException(String msg){
		super(msg);
	}

}
