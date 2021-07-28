package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.Calculadora;

class TesteSubtracao {
	
	private Calculadora calc;

	@Test
	public void subtracaoDoisPositivos() {
		calc = new Calculadora(7, 3);
        assertEquals(4, calc.subtracao());
        calc = new Calculadora(3, 7);
        assertEquals(-4, calc.subtracao());
	}
	
	@Test
	public void subtracaoDoisNegativos() {
		calc = new Calculadora(-2, -4);
        assertEquals(2, calc.subtracao());
        calc = new Calculadora(-4, -2);
        assertEquals(-2, calc.subtracao());
        
	}
	
	@Test
	public void subtracaoDoisComplementares() {
		calc = new Calculadora(-7, 7);
        assertEquals(-14, calc.subtracao());
        calc = new Calculadora(7, -7);
        assertEquals(14, calc.subtracao());
        
	}
	
	@Test
	public void subtracaoZeroPositivo() {
		calc = new Calculadora(0, 5);
        assertEquals(-5, calc.subtracao());
        calc = new Calculadora(5, 0);
        assertEquals(5, calc.subtracao());
	}
	
	@Test
	public void subtracaoZeroNegativo() {
		calc = new Calculadora(0, -4);
        assertEquals(4, calc.subtracao());
        calc = new Calculadora(-4, 0);
        assertEquals(-4, calc.subtracao());
	}

}
