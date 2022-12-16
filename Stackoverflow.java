package Exception;

public class Stackoverflow {
	
	public void callA() {
		 callB();
	}
	
	public void callB() {
		callA();
	}
	
	public static void main(String[] args) {
		
		
		 Stackoverflow a=new Stackoverflow();
		 a.callA();
	}
	
	
	}


