package Exercises;

import java.util.Scanner;

public class EvenEntryLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userChoice;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		
		do {
			System.out.println("Please Pick a number >>>>");
			userChoice = input.nextInt();
			if(userChoice % 2 == 0) {
				System.out.print("Good Job!");
			
			}
			else
				System.out.print("ERROR!");
		}while(userChoice != 999);
	}

}
