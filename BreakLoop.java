package forLoop;

public class BreakLoop {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				break; // break loop once condition satisfied 
			}
			System.out.println(i);
		}
	}

}
