package AdvantureGame;

public abstract class BattleLoc extends Location {
	protected Obstacle obstacle;
	protected String award;

	BattleLoc(Player player, String name, Obstacle obstacle, String award) {
		super(player);
		this.name = name;
		this.obstacle = obstacle;
		this.award = award;

	}

	public boolean getLocation() {
		int obsCount = obstacle.count();
		System.out.println("�uan Buradas�n�z " + this.getName());
		System.out.println("Dikkatli Ol Burada " + obsCount + " Tane " + obstacle.getName() + " Ya��yor!");
		System.out.println("\n<S>ava� veya <K>a�");
		String selCase = scan.nextLine();
		selCase = selCase.toUpperCase();
		if (selCase.equals("S")) {
			if (combat(obsCount)) {
				System.out.println(this.getName() + " B�lgesindeki T�m D��manlar� Temizlediniz");
				if (this.award.equals("FOOD") && player.getInv().isFood() == false) {
					System.out.println(this.award + "KAZANDINIZ !");
					player.getInv().setFood(true);
				} else if (this.award.equals("WATER") && player.getInv().isWater() == false) {
					System.out.println(this.award + "KAZANDINIZ !");
					player.getInv().setWater(true);
				} else if (this.award.equals("FIREWOOD") && player.getInv().isFirewood() == false) {
					System.out.println(this.award + " KAZANDINIZ !");
					player.getInv().setFirewood(true);
				}
				return true;
			} else {
				
			}
			if(player.getHealthy() <= 0 ) {
				System.out.println("�LD�N�Z!");
				return false;
			}
			
		}
		return true;
	}

	public boolean combat(int obsCount) {
		for (int i = 0; i < obsCount; i++) {
			int defObsHealth = obstacle.getHealth();
			playerStats();
			enemyStats();
			while (player.getHealthy() > 0 && obstacle.getHealth() > 0) {
				System.out.println("\n<V>ur veya <K>a�");
				String selCase = scan.nextLine();
				selCase = selCase.toUpperCase();
				if (selCase.equals("V")) {
					System.out.println("\tSiz Vurdunuz !!");
					obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
					afterHit();
					if (obstacle.getHealth() > 0) {
						System.out.println();
						System.out.println("\tCanavar Size Vurdu !!");
						player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInv().getArmor()));
						afterHit();
					}

				} else {
					return false;
				}

			}
			if (obstacle.getHealth() < player.getHealthy()) {
				System.out.println("D��man� Yendiniz Tebrikler !!");
				player.setMoney(player.getMoney() + obstacle.getAward());
				System.out.println("G�ncel Paran�z :" + player.getMoney());
				obstacle.setHealth(defObsHealth);

			} else {
				return false;
			}
			System.out.println("---------------------------------------------");
		}
		return true;
	}

	public void playerStats() {
		System.out.println("Oyuncu De�erleri\n------------");
		System.out.println("Can :" + player.getHealthy());
		System.out.println("Hasar :" + player.getTotalDamage());
		System.out.println("Para :" + player.getMoney());
		if (player.getInv().getDamage() > 0) {
			System.out.println("Silah : " + player.getInv().getwName());
		}
		if (player.getInv().getArmor() > 0) {
			System.out.println("Z�rh : " + player.getInv().getaName());
		}
	}

	public void enemyStats() {
		System.out.println("\n" + obstacle.getName() + "De�erleri\n-------------------");
		System.out.println("Can :" + obstacle.getHealth());
		System.out.println("Hasar :" + obstacle.getDamage());
		System.out.println("�d�l : " + obstacle.getAward());

	}

	public void afterHit() {
		System.out.println(" Oyuncu Can� :" + player.getHealthy());
		System.out.println(obstacle.getName() + " Can� :" + obstacle.getHealth());
		System.out.println();
	}
}
