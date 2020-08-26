package modeloEstructuraDatos;

import modeloEstructuraDatos.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico arreglo;

	private static int TAMANOF=1;
	private static int TAMANOC=2;

	public void setUp1() {
		arreglo= new ArregloDinamico(TAMANOC, TAMANOF);
	}


	@Test
	public void testArregloDinamico() {
		
	}

	@Test
	public void testAgregar() {
		assertTrue(arreglo!=null);
		arreglo.agregar(dato, numeroColumna, numeroFila);


		int tamaño = arreglo.darTamanoColumnas();
		assertEquals(3,tamaño);
		int tamaño2 = arreglo.darTamanoFilas();
		assertEquals(2,tamaño);
	}

	@Test
	public void testDarTamanoFilas() {
		assertTrue(arreglo!=null);
		int tamaño = arreglo.darTamanoFilas();
		assertEquals(1,tamaño);
	}

	@Test
	public void testDarTamanoColumnas() {
		assertTrue(arreglo!=null);
		int tamaño = arreglo.darTamanoColumnas();
		assertEquals(2,tamaño);
	}

	@Test
	public void testBuscarFila() {
		assertTrue(arreglo!=null);
	}

	@Test
	public void testBuscarColumna() {
		assertTrue(arreglo!=null);
	}

	@Test
	public void testDarIdFila() {
		assertTrue(arreglo!=null);
	}

	@Test
	public void testDarElementoEn() {
		assertTrue(arreglo!=null);
	}

	@Test
	public void testDarBuenasPeliculasDeUnDirector() {
		assertTrue(arreglo!=null);
	}

}
