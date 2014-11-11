Introduction to Java Programming

Assignment  (10%)



Q1.java, Q2.java, etc.), compile and run it from eclipse.

Q1. The international standard letter/number mapping found on the telephone is:
Write a method that returns a number, given an uppercase letter, as follows:
Write a test program that prompts the user to enter a phone number as a string. 
The input number may contain letters. The program translates a letter (upper- or 
lower- case) to a digit and leaves all other characters intact. Here is a sample run 
of the program:
(10 Marks)
Q2. Write a method that returns a sorted string using the following header: 
For example, sort("acb") returns abc. Write a test program that prompts the user to 
enter a string and displays the sorted string.
(10 Marks)
Q3. Write a hangman game that randomly generates a word and prompts the user to 
guess one letter at a time, as shown in the sample run. Each letter in the word is 
displayed as an asterisk. When the user makes a correct guess, the actual letter is 
then displayed. When the user finishes a word, display the number of misses and 
asks the user whether to continue to play with another word. Declare an array to 
store words, as follows:
Sample execution of the program:
(10 Marks)

Blackjack Game
(Sample game accessible at http://scanlon.ucd.ie/blackjack/)
Premise of the Game
The basic premise of the game is that you want to have a hand value that is closer 
to 21 than that of the dealer, without going over 21. Your hand is strictly played 
out against the hand of the dealer. The rules of play for the dealer are strictly 
dictated, leaving no decisions up to the dealer. 
Values of the Cards
In blackjack, the cards are valued as follows:
 An Ace can count as either 1 or 11, as explained below.
 The cards from 2 through 9 are valued at their face value.
 The 10, Jack, Queen, and King are all valued at 10.
The suits of the cards do not have any meaning in the game. The value of a hand 
is simply the sum of the point counts of each card in the hand. For example, a 
hand containing (5,7,9) has the value of 21. The Ace can be counted as either 1 or 
11. You need not specify which value the Ace has. It's assumed to always have the 
value that makes the best hand. An example will illustrate: Suppose that you have the beginning hand (Ace, 6). This hand can be either 7 or 17. If you stop there, it 
will be 17. Let's assume that you draw another card to the hand and now have 
(Ace, 6, 3). Your total hand is now 20, counting the Ace as 11. Let's backtrack and 
assume that you had instead drawn a third card that was an 8. The hand is now 
(Ace, 6, 8) which totals 15. Notice that now the Ace must be counted as only 1 to 
avoid going over 21.
How the Dealer Plays His Hand
The dealer must play his hand in a specific way, with no choices allowed. There 
are two popular rule variations that determine what total the dealer must draw to. 
In any given casino, you can tell which rule is in effect by looking at the blackjack 
tabletop. It should be clearly labeled with one of these rules:
"Dealer stands on all 17s": The dealer must continue to take cards ("hit") until his 
total is 17 or greater. An Ace in the dealer's hand is always counted as 11 if 
possible without the dealer going over 21. For example, (Ace,8) would be 19 and 
the dealer would stop drawing cards ("stand"). Also, (Ace,6) is 17 and again the 
dealer will stand. (Ace,5) is only 16, so the dealer would hit. He will continue to 
draw cards until the hand's value is 17 or more. For example, (Ace,5,7) is only 13 
so he hits again. (Ace,5,7,5) makes 18 so he would stop ("stand") at that point.
(i) Modify the DeckOfCards class found on Moodle to include the following 
methods:
/* Returns an integer representing a card in the deck.
* Between shuffles, the same card will never be returned twice */
 public static int drawCard()
 (5 Marks)
 /* Shuffle the "deck" of ints */
 public static void shuffle()
(5 Marks)
(ii) Create a Blackjack class to handle the logic of the game. At a minimum this 
class will require the following methods:
/* Set up the game: perform a shuffle, "deal" 2 cards to both the 
dealer & player */
public static void setupNewGame()
(5 Marks)
/* Deal another card to the player */
public static void hit()
(5 Marks)
/* Print the hand supplied as an int array to the console, e.g.:
* 7 of Spades, Ace of Hearts, 3 of Diamonds
* King of Clubs, 10 of Hearts
* */
public static void printHand(int[] hand, boolean isPlayer)
(5 Marks) /* Expects an int array representing a blackjack hand as a 
parameter.
 * Returns the score from the card representation */
 public static int calculateScore(int[] hand)
(5 Marks)
 
 /* Automates the dealer's play after the player stands. Dealer 
draws a new card until he has 17 or greater */
 public static void finishDealersPlay()
(5 Marks)
/* Returns 1 if the player has won, -1 if the player
 * has lost and 0 if it's a draw/push (both the player
 * and the dealer have the same score)
 * 
 * 
 * A player has won if:
 * 1. His/her hand is <= 21 and his/her hand has a 
 * higher score than the dealer
 * 2. His/her hand is <= 21 and the dealers goes bust
 * (i.e., the dealer's score is >21)
 * 3. The player gets Blackjack (21) with two cards: 
 * any 10 card and an Ace (except if the dealer also
 * has a blackjack)
 * 
 * Otherwise the dealer has won.
 * */
 public static int calculateWinnings()
(10 Marks)
(iii) Create a TestBlackjack class that facilitates playing the game on the 
command line. Users should be presented with the dealer’s hand, and their 
hand on a new line. The user should then be invited to hit by inputting ‘h’ or 
stand by inputting ‘s’. The user should then be presented with the final game 
state showing both final hands and a message displaying who won.
(15 Marks)
(iv) Add a starting “bank” of €100 to the game. The player should be able to 
decide their stake between €5 and €25, in increments of €5. If a hand is won, 
the balance should increase by the stake and decrease if a hand is lost. In the 
case of a push/draw, no change is made to the balance.
(10 Marks)Submission Instructions
