package Debugging;

public class FixDebugSix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int DAYS = 30;
	      double money = 0.01;
	      int day = 1;
	      while(day < DAYS)
	      {
	         money = 2 * money;
	         System.out.println("After day " + day +
	            " you have " + money);
	}

}
}
