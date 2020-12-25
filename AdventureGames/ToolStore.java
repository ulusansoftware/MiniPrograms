package AdvantureGame;

public class ToolStore extends NormalLoc {
	ToolStore(Player player) {
		super(player, "Shop");
	}

	public boolean getLocation() {
		System.out.println("Money :" + player.getMoney());
		System.out.println("1. Weaponry");
		System.out.println("2. Armors");
		System.out.println("3. Exit");
		System.out.println("Your choice :");
		int selTool = scan.nextInt();
		int selItemID;
		switch (selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		case 2:
			selItemID = armorMenu();
			buyArmor(selItemID);
			break;
		default:
			break;
		}

		return true;
	}

	public int armorMenu() {
		System.out.println("1-] Light Armor <--> \t Block = 1 \t Money = 15");
		System.out.println("2-] Medium Armor   <--> \t Block = 3 \t Money = 25");
		System.out.println("3-] Heavy Armor   <--> \t Block = 5 \t Money = 40");
		System.out.println("4-] Exit ");
		System.out.println("Choose Armor :");
		int selArmorID = scan.nextInt();
		return selArmorID;
	}

	public void buyArmor(int itemID) {
		int avoid = 0, price = 0;
		String aName = null;
		switch (itemID) {
		case 1:
			avoid = 1;
			aName = "Light Armor";
			price = 15;
			break;
		case 2:
			avoid = 3;
			aName = "Medium Armor";
			price = 25;
			break;
		case 3:
			avoid = 5;
			aName = "Heavy Armor";
			price = 40;
			break;
		case 4:
			System.out.println("Logging Out Please Wait.");
			break;
		default:
			System.out.println("Invalid Transaction !");
			break;

		}
		if (price > 0) {
			if (player.getMoney() >= price) {
				player.getInv().setArmor(avoid);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney() - price);
				System.out.println(aName + " You Bought, Damage Blocked: " + player.getInv().getArmor());
				System.out.println("Remaining money :" + player.getMoney());
			} else {
				System.out.println("Insufficient Balance. !");
			}
		}

	}

	public int weaponMenu() {
		System.out.println("1-] Gun <--> \t Damage = 2 \t Money = 25");
		System.out.println("2-] Sword   <--> \t Damage = 3 \t Money = 35");
		System.out.println("3-] Rifle   <--> \t Damage = 7 \t Money = 45");
		System.out.println("4-] Exit ");
		System.out.println("Select Weapon :");
		int selWeaponID = scan.nextInt();
		return selWeaponID;
	}

	public void buyWeapon(int itemID) {
		int damage = 0, price = 0;
		String wName = null;
		switch (itemID) {
		case 1:
			damage = 2;
			wName = "Gun";
			price = 25;
			break;
		case 2:
			damage = 3;
			wName = "Sword";
			price = 35;
			break;
		case 3:
			damage = 7;
			wName = "Rifle";
			price = 45;
			break;
		case 4:
			System.out.println("Logging Out Please Wait.");
			break;
		default:
			System.out.println("Invalid Transaction!");
			break;

		}
		if (price > 0) {
			if (player.getMoney() > price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney() - price);
				System.out.println(wName + " You Bought, Previous Damage :" + player.getDamage() + "New Damage: "
						+ player.getTotalDamage());
				System.out.println("Remaining money:" + player.getMoney());
			} else {
				System.out.println("Insufficient Balance. !");
			}
		}

	}
}
