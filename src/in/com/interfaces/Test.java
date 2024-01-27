package in.com.interfaces;

public interface Test {
	int x = 1;
	int y = 2;

	void fun2();

	void fun();

	static void fun1() {
		System.out.println("static mathod of Test interface ");
	}

	default void ok() {
		System.out.println("default method of Test");
	}

}
