package projet_softEng;
import java.util.Random;

public class TheClassToTest {
	
	int MultiplyBy2(int x)
	{		
		return x*2;
	}
	
	int DivideByNumberFromInternet(int x)
	{
		Random random = new Random();
		int divisor = (random.nextInt(4)-3);
		System.out.println("divisor: "+ divisor);
		return x/(divisor);
	}
	

}
