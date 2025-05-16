import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

        System.out.println("Random Letter picked: " + generator.getRandomLetter());

        System.out.println("Your password is: " + generator.generatePassword());

        String[] randomWords = generator.getNewPasswordSet(3);
        for (String word : randomWords) {
            System.out.println(word);
        }
    }

}
