package Debugging;

import java.util.Scanner;

public class FixDebugSix4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int high, low;
		int count = 0;
	      Object fina1;
		final int NUM = 5;
	      Scanner input = new Scanner(System.in);
	      // Prompt user to enter high and low values
	      System.out.print("This application displays " + NUM +
	         " random numbers" +
	         "\nbetween the low and high values you enter" +
	         "\nEnter low value now... ");
	      high = input.nextInt();
	      System.out.print("Enter high value... ");
	      low = input.nextInt();
	
	      {
	         System.out.println("The number you entered for a high number, " +
	            high + ", is not more than " + low);
	         System.out.print("Enter a number higher than " + low + "... ");
	         high = input.nextInt();
	      }


	      {
	         double result = Math.random();
	          // random() returns value between 0 and 1
	         int answer = (int) (result * 10 + low);
	          // multiply by 10 and add low -- random is at least the value of low
	          // only use answer if it is low enough
	         
	         {
	            System.out.print(answer + "  ");
	            count = count - 1;
	         }
	      }
	      System.out.println();
	}

}
