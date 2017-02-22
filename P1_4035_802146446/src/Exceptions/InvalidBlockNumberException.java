package Exceptions;

public class InvalidBlockNumberException extends RuntimeException {
	
	public InvalidBlockNumberException(String msg){
		super(msg);
	}

}
