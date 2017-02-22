package Exceptions;

public class NonExistingDiskException extends RuntimeException {
	
	public NonExistingDiskException(String msg){
		super(msg);
	}

}
