package Exception;

public class NullPointer {
	public static void main(String[] args) {
		
		String a=null;
		
		
		try {
			String b=a.toUpperCase();
		System.out.println(b);
		}
		catch (Exception e) {
			System.out.println("String cannot be Converted to upperCase");
			e.printStackTrace();
		}
		
		
		
		
	}

}
