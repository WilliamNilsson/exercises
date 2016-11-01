package main;
import java.util.Scanner;
import monsters.IMonster;
import monsters.Monster;
public class Game{

	private static boolean lostGame;
	private static boolean wonGame;
	private static IPlayer player;
	
	public static void game(){
		System.out.println("************************");
		System.out.println("* Welcome to the game! *");
		System.out.println("************************");
		System.out.println("Enter your name: ");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		player = new Player(name, true, 100, 2, 1, 1, 0, 4);
		
		int ms; //MenuChoice
			System.out.println("What would you like to do " + name + "?");
				System.out.println("1. Go adventuring"); // alternative to go adventuring
				System.out.println("2. Show details about your character"); // alternative to inpect players stats
				System.out.println("3. Exit game"); // alternative to exit the game
			Scanner msIn = new Scanner(System.in); // creating the scanner for selecting an alternative in the menu
			while(player.isAlive() && (!wonGame && !lostGame)){
			ms = msIn.nextInt();  // the Scanner
			switch (ms){ //the switch for the menu
				case 1: 
					GoAdventure(); // alterntive 1
					break;
				case 2: 
					player.showStats(); // alternative 2
					break;
				case 3: 
					System.out.println("Exiting game.");  // alternative 3
					lostGame = true;
					break;
				default:
					System.out.println("Error. No valid alternative selected.");
					System.out.println("Try Again.");
					break;
				}
			}
				if(wonGame){
					System.out.println("Congratulations! You won the game!");
					}

	}
	


	public static void GoAdventure(){ // the adventuring method
		if(RandomHelper.getBigChance())// Randomgeneration
			Battle();
			else{
			nothingHappens();
				}
			}
		private static void nothingHappens() {
			System.out.println("Nothing Exciting happens on your travels.");
			return;
		}
	public static void Battle(){
		Scanner ns = new Scanner(System.in);
		while(player.isAlive()){
			System.out.println("Press any key to continue:");
			System.out.println("> ");
			ns.next();
			if(RandomHelper.oneInTwo()){
				monsterList.get(0);
			}
			
		}
		

		}
}