public class TreeIntSet implements IntSet {

	private int number;
	private TreeIntSet left;
	private TreeIntSet right;
	
	TreeIntSet(int number) {
		this.number = number;
		left = null;
		right = null;
	}
	
	public void add(int number) {
		if(number > this.number) {
			if(this.right == null) {
				TreeIntSet temp = new TreeIntSet(number);
				this.right = temp;
				return;
			}
			else {
				this.right.add(number);
			}
		}
		else {
			if(this.left == null) {
				TreeIntSet temp = new TreeIntSet(number);
				this.left = temp;
				return;
			}
			else {
				this.left.add(number);
			}
		}
	}
	
	public boolean contains(int number) {
		if(this.number == number) {
			return true;
		}
		else {
			if(number > this.number) {
				if(this.right != null) {
					return this.right.contains(number);
				}
			}
			else {
				if(this.left != null) {
					return this.left.contains(number);
				}
			}
		return false;
		}
	}
	
	public boolean containsVerbose(int number) {
		System.out.println("Checking number " + number + " against " + this.number);
		if(this.number == number) {
			return true;
		}
		else {
			if(number > this.number) {
				if(this.right != null) {
					return this.right.containsVerbose(number);
				}
			}
			else {
				if(this.left != null) {
					return this.left.containsVerbose(number);
				}
			}
		return false;
		}
	}
	
	public String toString() {
		return "Sorry but this method is too difficult for my tiny brain!";
	}

}