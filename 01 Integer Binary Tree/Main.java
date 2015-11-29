public class Main {

	public static void main(String[] args) {
		
		IntegerTreeNode root = new IntegerTreeNode(6);
		
		/*
		for(int i = 0; i < 20; i++) {
			int number = (int) (Math.random() * 100);
			System.out.println(number);
			root.addNumber(number);
		}
		*/
		
		//root.addNumber(6);
		root.addNumber(5);
		root.addNumber(9);
		root.addNumber(3);
		root.addNumber(8);
		root.addNumber(11);
		root.addNumber(12);
		
		System.out.println(root.getMax());
		System.out.println(root.getMin());
		
		System.out.println(root.toString());
		
		System.out.println(root.contains(10));
		
	}

}
