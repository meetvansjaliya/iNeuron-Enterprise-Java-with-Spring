import java.util.Scanner;

class Guesser // The number collected from the Guesser.
{
	int guessrNum;
	
	public int guessNumber(int low, int high) // This method collects the number from the Guesser.
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Guesser kindly guess a number between "+low+" to "+high);
		guessrNum=scan.nextInt();
		
		if((guessrNum >= low) && (guessrNum <= high))
		{// @author Meet Vansjaliya
			return guessrNum; // return the number collected from the Guesser.
		}
		else
		{
			System.out.println("Please guess a valid number within the range specified");
			return guessNumber(low, high);
		}
		
	}	

}

class Player  // The number predicted from the Player.
{
	int playerGuessNum;
	
	public int guessNumber(int low, int high) // This method collects the predicted number from the Player.
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess a number between " +low+" to "+high);
		playerGuessNum=scan.nextInt();
		
		if((playerGuessNum >= low) && (playerGuessNum <= high))
		{
			return playerGuessNum;  // return The predicted value from Player
		}
		else
		{
			System.out.println("Please predict a valid number within the range specified");
			return guessNumber(low, high);
		}
	}
}

class Umpire
{
	
	int guessNumGuesser;  // number guessed by the Guesser.
	int player1NumGuess;  // number predicted by the Player1
	int player2NumGuess;  // number predicted by the Player2
	int player3NumGuess;  // number predicted by the Player3
	
	
	public void collectNumFromGuesser() // method collect the number from the Guesser
	{
		Guesser g=new Guesser();
		guessNumGuesser=g.guessNumber(1,30); // store the number guessNumGuesser in field.
		
	}
	
	
	public void collectNumFromPlayer()  // method collects the numbers from the Players
	{
		Player p1=new Player(); 
		Player p2=new Player();
		Player p3=new Player();
		
		
		player1NumGuess=p1.guessNumber(1,30); // stores the predicted number in player1NumGuess
		player2NumGuess=p2.guessNumber(1,30); // stores the predicted number in player2NumGuess
		player3NumGuess=p3.guessNumber(1,30); // stores the predicted number in player3NumGuess
	}
	
	void compare() // method compares the guessed number from the Guesser And winner is decide
	{
		
		if(guessNumGuesser==player1NumGuess)
		{
			if(guessNumGuesser==player2NumGuess && guessNumGuesser==player3NumGuess)
			{// @author Meet Vansjaliya
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(guessNumGuesser==player2NumGuess)
			{
				System.out.println("Player 1 and Player2 won the game");
			}// @author Meet Vansjaliya
			else if(guessNumGuesser==player3NumGuess)
			{
				System.out.println("Player 1 and Player3 won ");
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			}
		}
		
		
		else if(guessNumGuesser==player2NumGuess)
		{
			
			if(guessNumGuesser==player3NumGuess)
			{
			System.out.println("Player 2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		
		
		else if(guessNumGuesser==player3NumGuess)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
	// @author Meet Vansjaliya
	
}

public class GuesserGame {
	
	final static int TRY = 2; //Repeats game twice
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// @author Meet Vansjaliya
		Umpire u=new Umpire();
		int i = 1;
		while(i<=TRY) {
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		++i;
		}
	}

}// @author Meet Vansjaliya
