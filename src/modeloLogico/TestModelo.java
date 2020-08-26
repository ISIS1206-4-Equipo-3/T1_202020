package modeloLogico;

import modeloLogico.Modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestModelo {

	
	private Modelo modelo;
	
	public void setUp1()
	{
		modelo = new Modelo();
	}
	@Test
	public void testModelo() {
	setUp1();
	assertNotNull(modelo.datos);
		
	}

	@Test
	public void testDarPeliculasDeUnDirector() {
		setUp1();
		assertNotNull(modelo.darPeliculasDeUnDirector("George Lucas"));
	}

	@Test
	public void testCargarDatos() {
		setUp1();
		assertEquals(40,modelo.datos.darTamanoColumnas());
		assertEquals(2000, modelo.datos.darTamanoFilas());
		assertNotNull(modelo.datos.darElementoEn(10, 100));
	}

}
