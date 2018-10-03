package gameZone;

public class RandomGuess3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		String[] stringArray = {"This", "is", "and", "a"};
		System.out.println("Print numbers first to last");
		
		for(int i = 0; i < numArrays.length; i++) {
			System.out.println("numbers in order " + numArrays[i]);
		}
		System.out.println("Print numbers last to first");
		for(int j = 11; j >= 0; j--) {
			System.out.println("numbers in reverse order " + numArrays[j]);
		}
		for(int z = 0; z<stringArray.length; z++) {
			System.out.print(stringArray[z]);
	}
	}
}
