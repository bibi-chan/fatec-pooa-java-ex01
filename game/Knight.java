package strategy.pattern.game;

public class Knight extends Character {
	
	public Knight() {
		super.weaponBehavior = new BowAndArrowBehavior();
	}

	@Override
	public void fight() {
		System.out.print("Ha-ha");
		super.weaponBehavior.useWeapon();
	}

}