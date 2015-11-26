public interface IntSet {

	// Adds a new int to the set; if it is there already, nothing happens.
	
	public void add(int number);
	
	// Returns true if the number is in the set, false otherwise.

	public boolean contains(int number);
	
	// Returns the same values as the former method, but for every element that
	// is checked prints its value on screen.

	public boolean containsVerbose(int number);
	
	// Returns a string with the values of the elements in the set separated by
	// commas.

	public String toString();

}
