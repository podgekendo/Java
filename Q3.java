import java.util.Random;//import the random class
import java.util.Scanner;//import the scanner class

public class Q3 {

	public static void main(String[] args) {
		String [] words = {"this", "better", "get" , "a" , "good" , "result"};// My selection of words
		Scanner scan = new Scanner(System.in);//create scanner object
		Random random = new Random();//create random object
		String more = "y";
		while(more.equalsIgnoreCase("y")) {//when more is either Y or y, we enter the while loop
			int index = random.nextInt(words.length);//index is a random integer b/w 0 and the length of the words array.
			 String word = words[index];//word is then the word in that random index of the array words.
			char[] guess = new char[word.length()];//char array called guess
			for(int i = 0; i < guess.length; i++) {//loop over the char array setting each element to *
				guess[i] = '*';
			}
			int charsLeft = word.length();//chars left to be guessed
			int missedChars = 0;//missed guesses
			while(charsLeft > 0) {//while there are still letters to be guessed
				System.out.print("(Guess) enter a letter in word " + new String(guess) + " > " );
				char c = scan.nextLine().charAt(0);
				if(!isGuessed(guess, c)) {//if 
					int guessedChars = checkGuess(guess, word, c);
					charsLeft -= guessedChars;	// checks the amount of letters left against the amount guessed
					if(guessedChars == 0) {
						System.out.println("\t\t"+c+" is not in the word");		
						missedChars++;										// another incorrect letter added
					}
				} else {
					System.out.println("\t\t" + c +" is already in the word");		// already guessed char
				}
			}
			System.out.println("The word is " + word + ". You missed " + missedChars + " time" + (missedChars < 2 ? "" : "s"));
			more = "";
			while(!more.equalsIgnoreCase("y") && !more.equalsIgnoreCase("n")) {
				System.out.println("Do you want to guess another word? Enter y or n > ");			// unfortunately the person didnt guess the word and asks would they like another go
				more = scan.nextLine();
			}
		}
		
	}
	
	public static int checkGuess(char[] guess, String answer, char letter) {
		int count = 0;
		for(int i = 0; i < answer.length(); i++) {		// how many letters in the word and how many guesses at it
			if(answer.charAt(i) == letter) {
				count++;								// increment the count 
				guess[i] = letter;
			}
		}
		return count;
	}
	
	public static boolean isGuessed(char[] guess, char c) {			// if letter guessed is in the word. The return is a true one.
		for(int i = 0; i < guess.length; i++) {
			if(guess[i] == c) return true;
		}
		return false;						// otherwise incorrect
	}

}