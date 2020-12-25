package AdvantureGame;

import java.util.Scanner;

public class Player {
	private int damage, healthy, money, rHealthy;
	private String name, cName;
	private Inventory inv;
	Scanner scan = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}

	public void selectCha() {
		switch (chaMenu()) {
		case 1:
			initPlayer("Samuray", 5, 21, 15);
			break;
		case 2:
			initPlayer("Okçu", 7, 18, 20);
			break;
		case 3:
			initPlayer("Þovalye", 8, 24, 5);
			break;
		default:
			initPlayer("Samuray", 5, 21, 15);
			break;
		}
		System.out.println("\n<<-- !! Your character is getting ready !.!.!.!.! Your character is ready, be careful !! -->> ");
		System.out.println("\t    Character :" + getcName() + "\t Damage :" + getDamage() + "\t Healthy :" + getHealthy()
				+ "\t Para :" + getMoney());
	}

	public int chaMenu() {
		System.out.println("   \n             !! Please Select Your Character To Play !!   ");
		System.out.println("1-] Samuray <--> \t Damage = 5 \t Healthy = 21 \t Money = 15");
		System.out.println("2-] Okçu    <--> \t Damage = 7 \t Healthy = 18 \t Money = 20");
		System.out.println("3-] Þovalye <--> \t Damage = 8 \t Healthy = 24 \t Money = 5 ");
		System.out.print("\nYour Character Selection--->>>");
		int chaID = scan.nextInt();
		while (chaID < 1 || chaID > 3) {
			System.out.print("Please Select A Valid Character..");
			chaID = scan.nextInt();
		}
		return chaID;

	}

	public int getTotalDamage() {
		return this.getDamage() + this.getInv().getDamage();
	}

	public void initPlayer(String cName, int dmg, int hlthy, int mny) {
		setcName(cName);
		setDamage(dmg);
		setHealthy(hlthy);
		setMoney(mny);
		setrHealthy(hlthy);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}

}
