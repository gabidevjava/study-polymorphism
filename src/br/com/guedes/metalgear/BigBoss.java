package br.com.guedes.metalgear;

public class BigBoss extends MetalGearCharacter {

	@Override
	void useWeapon(String weapon) {
		System.out.println("Big Boss is using a " + weapon);
	}
	
	void giveOrderToTheArmy(String orderMessage) {
		System.out.println(orderMessage);
	}
}
