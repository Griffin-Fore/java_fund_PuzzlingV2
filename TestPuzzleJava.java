import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
    	//..
		// Write your other test cases here.
		//..
        char alpha = generator.getRandomLetter();
        System.out.println(alpha);
        String bravo = generator.generatePassword();
        System.out.println(bravo);

        ArrayList<String> passwordSet = generator.getNewPasswordSet(9);
        System.out.println(passwordSet);

        ArrayList<String> pirateArray = new ArrayList<String>();
        pirateArray.add("P");
        pirateArray.add("i");
        pirateArray.add("r");
        pirateArray.add("a");
        pirateArray.add("t");
        pirateArray.add("e");

        ArrayList<String> PirateShuffle = generator.shuffleArray(pirateArray);
        System.out.println(PirateShuffle);
	}
}
