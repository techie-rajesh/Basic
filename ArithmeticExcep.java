package Exception;

public class ArithmeticExcep {
	public static void main(String[] args) {
		int a=5;
		int b=2;
		int c=0;
		
		try {
			System.out.println(a/b);
			System.out.println(a/c);
			System.out.println(b);
		}
		catch(NullPointerException e) {
			System.err.println(e);
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Try again later");
		}
	}

}
