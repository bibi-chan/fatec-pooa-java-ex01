package strategy.pattern.game;

public class Queen extends Character {
	
	public Queen() {
		super.weaponBehavior = new KnifeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.print("OH!");
		super.weaponBehavior.useWeapon();
	}

}