package strategy.pattern.game;

public class Troll extends Character {
	
	public Troll() {
		super.weaponBehavior = new AxeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.print("Arg");
		super.weaponBehavior.useWeapon();
	}

}