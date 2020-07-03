package br.com.guedes.metalgear;

public class UseSpecificMethod {
	
	public static void executeActionWith(MetalGearCharacter metalGearCharacter) {
		metalGearCharacter.useWeapon("SOCOM");
		
		if(metalGearCharacter instanceof BigBoss) {
			((BigBoss) metalGearCharacter).giveOrderToTheArmy("Attack!");
		}
	}
	
	public static void main(String... specificPolymorphismInvocation) {
        executeActionWith(new SolidSnake());
        executeActionWith(new BigBoss());
    }

}
