package modeloLogico;

import modeloEstructuraDatos.ArregloDinamico;
import modeloEstructuraDatos.cargarDatos;

public class Modelo {
	  
	public ArregloDinamico datos;
	
	private final static String RUTA_DATOS_PRINCIPALES= "./data/small/MoviesCastingRaw-small.csv";
	private final static String RUTA_DATOS_SECUNDARIOS= "./data/small/SmallMoviesDetailsCleaned.csv";
	
	
	public Modelo () {
		
	}

	public Integer darPeliculasDeUnDirector(String nombre) {
		cargarDatos CargarDatos = new cargarDatos(RUTA_DATOS_PRINCIPALES, RUTA_DATOS_SECUNDARIOS);
		return null;
	}

	
	
}
