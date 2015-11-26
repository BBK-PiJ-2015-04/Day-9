public class Main {

	public static void main(String[] args) {
	
		TreeIntSet root = new TreeIntSet(50);
		
		System.out.println();
		System.out.println();
		System.out.println("We have created a tree with a root of 50.");
		System.out.println();
		System.out.println("We will now generate 20 random numbers between 0 and 99:");
		System.out.println();
		
		for(int i = 0; i < 20; i++) {
			int number = (int) (Math.random() * 100);
			System.out.print(number + "  ");
			root.add(number);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("These numbers have been added to our tree. However duplicates are ignored! So");
		System.out.println("if there are any duplicates then our tree will be smaller.");
		System.out.println();
		System.out.print("Enter a number and I will check to see if it in our tree: ");
		String str = System.console().readLine();
		int number = Integer.parseInt(str);
		System.out.println();
		System.out.println(root.contains(number)? "It's there!" : "It isn't in our tree.");
		System.out.println();
		System.out.print("Now I will show you how I searched for it. Press enter to continue");
		str = System.console().readLine();
		System.out.println();
		System.out.println(root.containsVerbose(number)? "Bingo!" : "Not found :(");
		System.out.println();
		System.out.println("Now here are the members of our tree in a String representation:");
		System.out.println();
		System.out.println(root.toString());
		
		System.out.println();
		System.out.print("Now let's do the same thing with a list instead of a tree. Press enter to continue");
		str = System.console().readLine();
		System.out.println();
		
		ListIntSet start = new ListIntSet(50);
		
		System.out.println();
		System.out.println();
		System.out.println("We have created a list with a start of 50.");
		System.out.println();
		System.out.println("We will now generate 20 random numbers between 0 and 99:");
		System.out.println();
		
		for(int i = 0; i < 20; i++) {
			number = (int) (Math.random() * 100);
			System.out.print(number + "  ");
			start.add(number);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("These numbers have been added to our list. However duplicates are ignored! So");
		System.out.println("if there are any duplicates then our list will be smaller.");
		System.out.println();
		System.out.print("Enter a number and I will check to see if it in our list: ");
		str = System.console().readLine();
		number = Integer.parseInt(str);
		System.out.println();
		System.out.println(start.contains(number)? "It's there!" : "It isn't in our list.");
		System.out.println();
		System.out.print("Now I will show you how I searched for it. Press enter to continue");
		str = System.console().readLine();
		System.out.println();
		System.out.println(start.containsVerbose(number)? "Bingo!" : "Not found :(");
		System.out.println();
		System.out.println("Now here are the members of our list in a String representation:");
		System.out.println();
		System.out.println(start.toString());

	}

}