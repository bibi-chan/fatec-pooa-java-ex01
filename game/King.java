package strategy.pattern.game;

public class King extends Character {
	
	public King() {
		super.weaponBehavior = new SwordBehavior();
	}

	@Override
	public void fight() {
		System.out.print("Ae!");
		super.weaponBehavior.useWeapon();
	}

}