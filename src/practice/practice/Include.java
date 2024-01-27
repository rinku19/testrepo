package practice.practice;

public class Include {
	public static void main(String[] rinku) {
		
		int arr[]=new int[] {0,1,2,3,4,5,6,7,8,9};
		int n=6;
		n=arr[arr[n]/2];
		System.out.println(arr[n]/2);
		int x=5;
		System.out.println("x value  "+x);
		int y=x++;
		System.out.println("y value  "+y);
		System.out.println("x value  "+x);
		int z=++y;
		System.out.println("x value --- "+x);
		System.out.println("y value --- "+y);
		System.out.println("z value --- "+z);
		
		
		
	}

}
