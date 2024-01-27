package in.com.interfaces;

public interface Test1 extends Test {
	int x = 3;
	int y = 4;
	

	void fun();

	static void fun1() {
		System.out.println("static method of Test1");
	}

	default void ok() {
		System.out.println("default method of Test1");
	}

}
