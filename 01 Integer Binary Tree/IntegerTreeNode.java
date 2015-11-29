public class IntegerTreeNode {
	
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void add(int value) {
		if(value > this.value) {
			if(this.right == null) {
				this.right = new IntegerTreeNode(value);
				return;
			}
			else {
				this.right.add(value);
			}
		}
		else {
			if(this.left == null) {
				this.left = new IntegerTreeNode(value);
				return;
			}
			else {
				this.left.add(value);
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
		String str = "[" + this.value + " L";
		if(this.left != null) {
			str = str + this.left.toString();
		}
		else {
			str = str + "[]";
		}
		str = str + " R";
		if(this.right != null) {
			str = str + this.right.toString();
		}
		else {
			str = str + "[]";
		}
		str = str + "]";
		return str;
	}
	
	public String toStringSimplified() {
		String str = "[" + this.value + "";
		if(this.left != null) {
			str = str + " " + this.left.toStringSimplified();
		}
		if(this.right != null) {
			str = str + " " + this.right.toStringSimplified();
		}
		str = str + "]";
		return str;
	}
	
}
