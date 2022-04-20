package G_WS;
import java.util.Random;
public class gamblerSimulation {
	//uc1
	public static void gamble () {
		int amount=100;
		final int bet=1;
		//uc2
		Random ran= new Random();
		int check= ran.nextInt(2);
		if(check==0) {
			amount=amount +bet;
			System.out.println("Gambler won"+amount);
		}
		else {
			amount=amount-bet;	
			System.out.println("Gambler loss"+amount);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gamble();
	}
}