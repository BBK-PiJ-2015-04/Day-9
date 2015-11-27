public class Main {

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
