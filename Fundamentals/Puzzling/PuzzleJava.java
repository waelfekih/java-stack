import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            tenRolls.add(r.nextInt(20) + 1);
        }
        return tenRolls;
    }

    public ArrayList<String> getRandomLetter() {
        ArrayList<String> AllLetters = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; ++c) {
                AllLetters.add(String.valueOf(c));
        }
        System.out.println("All letters: " +    AllLetters);

        Random rand = new Random();
        String pickedLetter = AllLetters.get(rand.nextInt(AllLetters.size()));
        ArrayList<String> selectedLetter = new ArrayList<>();
        selectedLetter.add(pickedLetter);

        return selectedLetter;
    }

    public String generatePassword() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder password = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            char c = letters.charAt(rand.nextInt(letters.length()));
            password.append(c);
        }

        return password.toString();
    }

    public String[] getNewPasswordSet(int length) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] passwords = new String[length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            StringBuilder password = new StringBuilder();
            for (int j = 0 ; j < 8 ; j++) {
                char c = letters.charAt(rand.nextInt(letters.length()));
                password.append(c);
            }
            passwords[i] = password.toString();

        }
            return passwords;

    }

}


