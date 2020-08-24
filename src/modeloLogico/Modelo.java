package modeloLogico;

import modeloEstructuraDatos.ArregloDinamico;
import modeloEstructuraDatos.cargarDatos;

public class Modelo {
	  
	public ArregloDinamico datos;
	
	private final static String RUTA_DATOS_PRINCIPALES= "./data/small/MoviesCastingRaw-small.csv";
	private final static String RUTA_DATOS_SECUNDARIOS= "./data/small/Small/MoviesCastingRaw-small.CSV";
	
	
	public Modelo () {
		
	}

	public Integer darPeliculasDeUnDirector(String nombre) {
		
		cargarDatos CargarDatos = new cargarDatos<Comparable<T>>("./data/small/MoviesCastingRaw-small.csv", "./data/small/MoviesCastingRaw-small.csv")
		
		return null;
	}

	
	
}
