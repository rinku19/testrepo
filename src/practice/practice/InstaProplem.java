package practice.practice;

public class InstaProplem {

	public static void main(String args[]) {
		// String s=null;
		// System.out.println(s);
		// System.out.println(s.toString());//This is because you are trying to invoke
		// the toString()
		// method on a null reference (s). In Java, calling methods
		// on a null object reference leads to a NullPointerException.
		/*
		 * int x = 3; int y = 4; switch (x + 3) { case 6: y = 0; System.out.println(y);
		 * case 7: y = 1; System.out.println(y); default: y += 1; System.out.println(y);
		 */
		// }
		int x = 2;
		int y = 3;
		switch (x + 2) {
		case 5:
			System.out.println("4");
			break;
		case 4:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		default:
			System.out.println("def");

		}

	}
}
