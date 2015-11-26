public class ListIntSet implements IntSet {

	private int number;
	private ListIntSet next;
	
	ListIntSet(int number) {
		this.number = number;
		next = null;
	}
	
	public void add(int number) {
		if(this.next == null) {
			this.next = new ListIntSet(number);
		}
		else {
			this.next.add(number);
		}
	}
	
	public boolean contains(int number) {
		if(this.number == number) {
			return true;
		}
		else {
			if(this.next != null) {
				return this.next.contains(number);
			}
			else {
				return false;
			}
		}
	}
	
	public boolean containsVerbose(int number) {
		System.out.println("Checking number " + number + " against " + this.number);
		if(this.number == number) {
			return true;
		}
		else {
			if(this.next != null) {
				return this.next.containsVerbose(number);
			}
			else return false;
		}
	}
	
	public String toString() {
		if(this.next == null) {
			return this.number + "";
		}
		else {
			
			return this.number + " " + this.next.toString();
		}
	}

}