public class IntegerTreeNode {
	
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void addNumber(int value) {
		if(value > this.value) {
			if(this.right == null) {
				this.right = new IntegerTreeNode(value);
				return;
			}
			else {
				this.right.addNumber(value);
			}
		}
		else {
			if(this.left == null) {
				this.left = new IntegerTreeNode(value);
				return;
			}
			else {
				this.left.addNumber(value);
			}
		}
	}

	public boolean contains(int value) {
		if(this.value == value) {
			return true;
		}
		else {
			if(value > this.value) {
				if(this.right != null) {
					return this.right.contains(value);
				}
			}
			else {
				if(this.left != null) {
					return this.left.contains(value);
				}
			}
			return false;
		}
	}

	public int getMax() {
		if(this.right == null) {
			return this.value;
		}
		else {
			return this.right.getMax();
		}
	}
	
	public int getMin() {
		if(this.left == null) {
			return this.value;
		}
		else {
			return this.left.getMin();
		}
	}
	
	public String toString() {
		if(this.left == null && this.right == null) {
			return "[" + this.value + " L[] R[]]";
		}
		if(this.left == null) {
			return this.value + " R[" + this.right.toString();
		}
		if(this.right == null) {
			return this.value + " L[" + this.left.toString();
		}
		return this.value + " L[" + this.left.toString() + " R[" + this.right.toString();
	}
	
}
