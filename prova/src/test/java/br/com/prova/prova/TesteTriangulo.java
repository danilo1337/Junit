package br.com.prova.prova;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.prova.prova.questao1.Triangulo;

public class TesteTriangulo{
	Triangulo triangulo;

	@Test
	public void testParametroZero() {
		triangulo = new Triangulo(1,3,0);
		assertFalse("Nao e triangulo", triangulo.trianguloValido());
		
	}
	@Test
	public void testParametroNegativo() {
		triangulo = new Triangulo(-1,3,1);
		assertFalse("Nao e triangulo", triangulo.trianguloValido());
		
	}
	@Test
	public void testSomaLados() {
		triangulo = new Triangulo(4, 2, 6);
		assertFalse("Soma de lados incorreta", triangulo.trianguloValido());
		
	}
	@Test
	public void testETriangulo() {
		triangulo = new Triangulo(6, 3, 4);
		assertTrue("É Triangulo", triangulo.trianguloValido());
		
	}
	@Test
	public void testEscaleno() {
		triangulo = new Triangulo(6, 3, 4);
		assertEquals("Triangulo escaleno", triangulo.tipoTriangulo());
	}
	
	@Test
	public void testIsosceles() {
		Triangulo triangulo = new Triangulo(6, 3, 6);
		assertEquals("Triangulo isosceles", triangulo.tipoTriangulo());
	}
	
	@Test
	public void testEquilatero() {
		Triangulo triangulo = new Triangulo(3, 3, 3);
		assertEquals("Triangulo equilatero", triangulo.tipoTriangulo());
	}

}
