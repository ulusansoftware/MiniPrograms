package AdvantureGame;

import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);
	

	
	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				" \t-->>>ULUSAN SOFTWARE<<<--    !! Welcome to Adventure Game !!    -->>>ULUSAN SOFTWARE<<<--");
		System.out.print("\nEnter Your Name Before Starting the Game --> ");
		String playerName = scan.nextLine();
		player = new Player("a");
		System.out.println("Welcome Ulusan");
		player.selectCha();
		start();
	}

	public void start() {
		while (true) {
			System.out.println();
			System.out
					.println("=======================================================================================");
			System.out.println();
			System.out.println("<<-->> Choose From Below <<-->>");
			System.out.println(
					"\n1. Safe House --> A Safe Place Belonging to You, No Enemy, Your Life is Renewed in This Place !");
			System.out.println("2. Cave     --> Maybe you will come across the Zombie !");
			System.out.println("3. Forest      --> Maybe you will come across the Vampire  !");
			System.out.println("4. Forest      --> Maybe you will come across the Bear !");
			System.out.println(
					"5. Shop     --> You Can Buy Weapons or Armor <-- !!!!!!Because You Will Go Through Very Tough Ways!!!!!!!!!");
			System.out.print("Choose Where You Want To Go :");
			int selLoc = scan.nextInt();
			while (selLoc < 0 || selLoc > 5) {
				System.out.print("Please Select a Valid Value :");
				selLoc = scan.nextInt();

			}
			switch (selLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3:
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;
			case 5:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
			}

			if (location.getClass().getName().equals("SafeHouse")) {
				if (player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
					System.out.println("CONGRATULATIONS Ulusan WIN THE GAME");
					break;
				}
			}
			if (!location.getLocation()) {
				System.out.println("!!Game Over!!");
				break;
			}
		}
	}
}
