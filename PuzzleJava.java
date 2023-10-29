import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class PuzzleJava {
    // You will need to import the Random library from java.util
    // To use methods from the Random library you will need to create an instance of Random
    Random randMachine = new Random();
    // From there you can use any of the methods listed in the documentation. For example:
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for(int i = 0; i < 10; i ++){
            tenRolls.add(randMachine.nextInt(10));
        }
        return tenRolls;
    }

    public char getRandomLetter(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        int alphabetSelector = randMachine.nextInt(25);
        char randomLetter = alphabet.get(alphabetSelector);
        return randomLetter;
    }

    public String generatePassword(){
        String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k",
        "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String password = new String();
        for(int i = 0; i < 8; i ++){
            int alphabetSelector = randMachine.nextInt(25);
            String randomLetter = alphabet[alphabetSelector];
            password += randomLetter;
        }
        System.out.println(password + " <-- Password");
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int passwordCount){
    //     // create an alphabet
    //     // for loop within a for loop that creates a random string nth times
        String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k",
        "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> passwords = new ArrayList<String>();
        for(int ii = 0; ii < passwordCount; ii++) {
            String password = new String();
            for(int i = 0; i < 8; i ++){
                int alphabetSelector = randMachine.nextInt(25);
                String randomLetter = alphabet[alphabetSelector];
                password += randomLetter;
            }
            passwords.add(password);
        }
        System.out.println("Password Set:");
        return passwords;
    }

    public ArrayList<String> shuffleArray(ArrayList<String> arrayShuffled){
        for(int i = 0; i < arrayShuffled.size(); i++){
            int randomIndex = randMachine.nextInt(arrayShuffled.size());
            String temp = arrayShuffled.get(randomIndex);
            arrayShuffled.set(randomIndex, arrayShuffled.get(i));
            arrayShuffled.set(i,temp);
        }
        System.out.println("Shuffled Array:");
        return arrayShuffled;
    }
}
