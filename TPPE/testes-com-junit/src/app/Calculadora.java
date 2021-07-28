package app;


public class Calculadora {
	
	private int a;
	private int b;

	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int soma() {
		return this.a + this.b;
	}
	
	public int subtracao() {
		return this.a - this.b;
	}
}
