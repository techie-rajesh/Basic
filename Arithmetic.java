package Exception;

public class Arithmetic {
	
	public static void main(String[]args) {
		 int a=5;
		 int b=2;
		 int c=0;
		 
		 
		  
		  
		  try {
			  System.out.println(a/b);
		  System.out.println(a/c);
		  System.out.println(a);
		  }
		  
		  catch (Exception e) {
			  System.err.println("Dont try to divide any number by zero");
			  e.printStackTrace();
		  }
		  
	}

}
