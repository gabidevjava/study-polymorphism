package br.com.guedes.produce;

public class CakeProducer extends SweetProducer {
	
	@Override
	public void produceSweet() {
		System.out.println("Cake produced");
	}
}
