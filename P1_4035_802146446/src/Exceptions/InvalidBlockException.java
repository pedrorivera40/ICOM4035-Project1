package Exceptions;

/**
 * InvalidBlockException occurs when the block entered doesn't satisfy the specifications.
 * @author Pedro Luis Rivera
 *
 */
public class InvalidBlockException extends RuntimeException {
	/**
	 * Constructs an InvalidBlockException.
	 * @param msg issue or information related to the exception.
	 */
	public InvalidBlockException(String msg){
		super(msg);
	}

}
