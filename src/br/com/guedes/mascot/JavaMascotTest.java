package br.com.guedes.mascot;

public class JavaMascotTest {
	
	public static void main(String... gogo) {
		JavaMascot dukeMascot = new Duke();
		JavaMascot juggyMascot = new Juggy();
		
		dukeMascot.executeAction();
		juggyMascot.executeAction();
	}

}
