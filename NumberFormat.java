package Exception;

public class NumberFormat {
public static void main(String[] args) {
		
		
		
		
		
		try {
			
			int b=Integer.parseInt(args[1]);
		
		System.out.println(b);
		}
		
		catch(NumberFormatException n) {
			System.err.println(n);
		}
		
		finally {
			System.out.println("String cannot converted to Integer");
		}
		
	}
}
