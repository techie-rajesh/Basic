package Exception;

public class AgeEligibility {
	
	public static void main(String[] args) throws AgeException,Exception {
		
		int age=17;
		
			
		try {
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		
		else {
			throw new AgeException("Not eligible to vote");
		}
		
		}
		 catch(AgeException a) {
			 System.out.println(a);
			 a.printStackTrace();
		
		
		
		
		
		 }
	}

}
