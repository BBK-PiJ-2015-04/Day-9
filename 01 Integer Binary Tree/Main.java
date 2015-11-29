public class Main {

	public static void main(String[] args) {
		
		IntegerTreeNode root = new IntegerTreeNode(6);
		
		/*
		for(int i = 0; i < 20; i++) {
			int number = (int) (Math.random() * 100);
			System.out.println(number);
			root.add(number);
		}
		*/
		
		//root.addNumber(6);
		root.add(5);
		root.add(9);
		root.add(3);
		root.add(8);
		root.add(11);
		root.add(12);
		
		System.out.println(root.getMax());
		System.out.println(root.getMin());
		
		System.out.println(root.toString());
		System.out.println(root.toStringSimplified());
		
		
		System.out.println(root.contains(10));
		
	}

}
