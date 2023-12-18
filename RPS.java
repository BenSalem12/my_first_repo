import java.util.Scanner;
import java.util.Random;

class RPS{
  public static void main(String[] args) {
	// 0 is paper
	// 1 is scissors
	// 2 is rock
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	int computerSelection=r.nextInt(0,3);
	System.out.println("Make a choice! 0 for paper, 1 for scissors, 2 for rock");
	int playerSelection=s.nextInt();
	String computerChoice;
	String playerChoice;
	if (computerSelection == 0){
	    computerChoice = "paper";
	} else if (computerSelection == 1){
	    computerChoice = "scissors";
	} else if (computerSelection == 2){
	    computerChoice = "rock";
	} else {
	    System.out.println("Something went wrong");
	    computerChoice = "invalid";
	}


	if (playerSelection == 0){
	    playerChoice = "paper";
	} else if (playerSelection == 1){
	    playerChoice = "scissors";
	} else if (playerSelection == 2){
	    playerChoice = "rock";
	} else {
	    System.out.println("Something went wrong");
	    playerChoice = "invalid";
	}



	System.out.println("Player chose " + playerChoice + ". Computer made the mistake of choosing " + computerChoice +".");
	int result = (3 + playerSelection - computerSelection) % 3;
	if (result == 1){
	    System.out.println("Player wins!!!!");
	} else if (result == 2) {
	    System.out.println("Computer wins ):");
	} else {
	    System.out.println ("Its a tie?!?!?!?!");
        }
	
  }
}