package AdvantureGame;

public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "G�venli Ev");
	}

	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println(" Sa�l���n�z Yenilendi.. ");
		System.out.println("!!!!--> SAVA�A HAZIRSINIZ <--!!!!");
		return true;
	}
}
