package in.com.interfaces;

public class Testclass implements Test1 {

	public static void main(String[] args) {
		Testclass tc = new Testclass();
		tc.ok();
		tc.ok();

		tc.fun();
		System.out.println(Test1.x);
		System.out.println(Test1.y);
		Test.fun1();
		Test1.fun1();
		System.out.println(Test.x);
		System.out.println(Test.y);
		Testclass t=new Testclass();
		Testclass te=t;
		System.out.println(te.hashCode());
		System.out.println(t.hashCode());
		Testclass tr=new Testclass();
		System.out.println(tr.hashCode());

	}

	@Override
	public void fun() {
		System.out.println("fun method Testclass");

	}

	@Override
	public void fun2() {
		
		
	}
}
