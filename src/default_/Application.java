package default_;

public class Application {
	
	public static void main(String[] args) {
		MyObject one = new MyObject(1);
		MyObject two = new MyObject(1);
		
		System.out.println(one.equals(two));
		
		MyObject three = new MyObject(2);
		
		System.out.println(one.equals(three));
	}

}
