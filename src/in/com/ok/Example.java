package in.com.ok;

public class Example {

	 static {
	        System.out.println("Before main class in static block");
	    }
	 public Example(int r) {
		 System.out.println("this is contructor of example");
		 
	 }

	    public static void main(String[] args) {
	        System.out.println("Hello Java!");
	       // Example e=new Example(4);
	        String str1 = "Hello";  
	        String str2 = "Hello";
	        System.out.println("this is ");
	        System.out.println(str1 == str2);
	        System.out.println("this is ");
	        System.out.println(str1.equals(str2));
	        String str = "Hello";  
	        String str32 = "Hello"; 
	       System.out.print(str == str32);
	        
	        
	    }
}
