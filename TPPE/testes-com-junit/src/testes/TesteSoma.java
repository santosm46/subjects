package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import app.Calculadora;

class TesteSoma {
	
	private Calculadora calc;
	
	@BeforeClass
	public static void setupBeforeAll() {
		System.out.println("Iniciando testes");
	}
	
	@Before
	public void setupBefore() {
		System.out.println("Iniciando teste unitário");
	}

	@Test
	public void somaDoisPositivos() {
		calc = new Calculadora(7, 3);
        assertEquals(10, calc.soma());
	}
	
	@Test
	public void somaDoisNegativos() {
		calc = new Calculadora(-2, -4);
        assertEquals(-6, calc.soma());
	}
	
	@Test
	public void somaDoisComplementares() {
		calc = new Calculadora(-7, 7);
        assertEquals(0, calc.soma());
	}
	
	@Test
	public void somaZeroPositivo() {
		calc = new Calculadora(0, 5);
        assertEquals(5, calc.soma());
	}
	
	@Test
	public void somaZeroNegativo() {
		calc = new Calculadora(0, -4);
        assertEquals(-4, calc.soma());
	}

}
