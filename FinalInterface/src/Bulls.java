import java.util.Random;

public class Bulls {

	public static int countBulls(int[] guessNum, int[] compNum) {
		int bulls = 0;
		// counting bulls - same digits of number 1234 == 1234 => 4 bulls
		for (int i = 0; i < compNum.length; i++) {
			if (guessNum[i] == compNum[i]) {
				bulls++;
			}
		}
		return bulls;
	}

	// method that returns a digit from a secretNumber exampleL: **8*

	public static int helpBulls(int bull) {
		int randomBull = 0;
		Random rnd = new Random();
		randomBull = Number.numArr[rnd.nextInt(4)];
		return randomBull;
	}
}
