package Exception;

public class LogIn {
	public static void main(String[] args) throws LoginException,Exception{
		  String username="nilesh1013";
		  String password="nilesh@1013";
		  try {
		  if(username.equals("nilesh1013")&&password.equals("nilesh@1014")) {
		  System.out.println("Valid user");
	}
	else {
		throw new LoginException("Invalid user");
	}
		  }
		  catch(LoginException l) {
			  System.out.println(l);
			  l.printStackTrace();
		  }
}
}
