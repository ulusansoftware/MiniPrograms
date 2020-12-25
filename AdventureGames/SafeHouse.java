package AdvantureGame;

public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}

	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println(" Saðlýðýnýz Yenilendi.. ");
		System.out.println("!!!!--> SAVAÞA HAZIRSINIZ <--!!!!");
		return true;
	}
}
