package diskUtilities;

import Exceptions.InvalidBlockCapacityException;

/**
 * VirtualDiskBlock emulates a memory disk with a fixed block capacity.
 * @author Pedro Luis Rivera
 *
 */
public class VirtualDiskBlock {
	private static final int DEFAULT_BLOCK_CAPACITY = 256; // default number of bytes per block
	private static final int MIN_BLOCK_CAPACITY = 8; // Minimum Block Capacity...
	
	private byte[] elements; // block...
	private int capacity; // size...
	
	/**
	 * Creates a new VirtualDiskBlock with default capacity (256 bytes).
	 */
	public VirtualDiskBlock() { this(DEFAULT_BLOCK_CAPACITY); }
	
	/**
	 * Creates a new VirtualDiskBlock with capacity equals to blockCapacity.
	 * @param blockCapacity - Represents the desired capacity.
	 */
	public VirtualDiskBlock(int blockCapacity) throws InvalidBlockCapacityException {
		if(blockCapacity < MIN_BLOCK_CAPACITY){
			throw new InvalidBlockCapacityException("ViarualDiskBlock: InvalidBlockCapacityException"
					+ ": block capacity should be at least "+ MIN_BLOCK_CAPACITY +". Parameter entered is: " + blockCapacity);
		}
		this.elements = new byte[blockCapacity];
		this.capacity = blockCapacity;
	}
	
	/**
	 * This method returns the block capacity.
	 * @return - Returns block capacity.
	 */
	public int getCapacity() { return this.capacity; }
	
	/**
	 * This method sets the element at the position determined by index 
	 * to the byte represented by newElement.
	 * @param index - Represents the position in elements.
	 * @param newElement - Represents the element to be placed on elements.
	 */
	public void setElement(int index, byte newElement) { this.elements[index] = newElement; }
	
	/**
	 * This method returns the element located at the position determined by index 
	 * inside of elements.
	 * @param index - Represents the position in elements.
	 * @return - Returns the elements at the position index in elements.
	 */
	public byte getElement(int index) { return this.elements[index]; }
}
