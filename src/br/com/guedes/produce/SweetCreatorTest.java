package br.com.guedes.produce;

import java.util.Arrays;

public class SweetCreatorTest {
	
	public static void main(String... hadouken) {
		SweetCreator sweetCreator = new SweetCreator(Arrays.asList(
									new CakeProducer(), 
									new ChocolateProducer(), 
									new CookieProducer()));
		
		sweetCreator.createSweets();
	}
}
