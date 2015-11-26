public class Main {

	public static void main(String[] args) {
	
		TreeIntSet root = new TreeIntSet(50);
		
		System.out.println("We will generate 20 random numbers between 0 and 99 and add them to our tree:");
		
		for(int i = 0; i < 20; i++) {
			int number = (int) (Math.random() * 100);
			System.out.print(number + "  ");
			root.add(number);
		}
		
		System.out.println();
		System.out.print("Enter a number and I will check to see if it in our tree: ");
		String str = System.console().readLine();
		int number = Integer.parseInt(str);
		
		System.out.println(root.contains(number)? "It's there!" : "It isn't in our tree.");
		
		System.out.println(root.containsVerbose(number)? "Bingo!" : "Not found :(");
		
		
		ListIntSet start = new ListIntSet(50);
		
		System.out.println("We will generate 20 random numbers between 0 and 99 and add them to our list:");
		
		for(int i = 0; i < 20; i++) {
			number = (int) (Math.random() * 100);
			System.out.print(number + "  ");
			start.add(number);
		}
		
		System.out.println();
		System.out.print("Enter a number and I will check to see if it in our list: ");
		str = System.console().readLine();
		number = Integer.parseInt(str);
		
		System.out.println(start.contains(number)? "It's there!" : "It isn't in our tree.");
		
		System.out.println(start.containsVerbose(number)? "Bingo!" : "Not found :(");
		
		System.out.println(start.toString());

	}

}