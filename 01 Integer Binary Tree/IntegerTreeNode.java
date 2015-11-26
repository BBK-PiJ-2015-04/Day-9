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
				IntegerTreeNode temp = new IntegerTreeNode(value);
				this.right = temp;
				return;
			}
			else {
				this.right.addNumber(value);
			}
		}
		else {
			if(this.left == null) {
				IntegerTreeNode temp = new IntegerTreeNode(value);
				this.left = temp;
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
		String str = "";
		str = str;
		return "John";
	}
	
	public static void main(String[] args) {
		
		IntegerTreeNode root = new IntegerTreeNode(5);
		
		for(int i = 0; i < 20; i++) {
			int number = (int) (Math.random() * 100);
			System.out.println(number);
			root.addNumber(number);
		}
		
		System.out.println(root.getMax());
		System.out.println(root.getMin());
		
		System.out.println(root.toString());
		
		System.out.println(root.contains(10));
		
	}
}
