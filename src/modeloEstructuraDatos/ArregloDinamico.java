package modeloEstructuraDatos;


import java.util.Scanner;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */

public class ArregloDinamico<T extends Comparable<T>>{
	/**
	 * Capacidad maxima del arreglo
	 */
	private int tamanoMax;
	/**
	 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
	 */
	private int tamanoAct;
	/**
	 * Arreglo de elementos de tamaNo maximo
	 */
	private Object elementos[ ];

	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * @param max Capacidad maxima inicial
	 */
	public ArregloDinamico( int max )
	{
		elementos = (T[])new Object[max];
		tamanoMax = max;
		tamanoAct = 0;
	}

	public void agregar( T dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			Object [ ] copia = elementos;
			elementos = (T[]) new Object[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = (T)copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		elementos[tamanoAct] = (T)dato;
		tamanoAct++;
	}

	public int darCapacidad() {
		return tamanoMax;
	}

	public int darTamano() {
		return tamanoAct;
	}

	public T darElemento(int i) {
		T elementoFinal = null;
		Object elementoPrueba = (T)elementos[i];
		for (int j = 0; j < elementos.length; j++) {

			if (elementos[j]==elementoPrueba) {

				elementoFinal= (T) elementoPrueba;
				return (T) elementoFinal;
			}
		}
		return (T) elementoFinal;
	}

	public T buscar(T dato) {
		T datoR = null;
		for (int i = 0; i < elementos.length; i++) {
			if(elementos[i]==dato)
			{
				datoR = dato;
			}

		}
		// TODO implementar
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		return datoR;
	}

	public T eliminar(Integer dato) {
		Integer datoR = null;
		for (int i = 0; i < elementos.length; i++) {
			if(elementos[i].equals(dato))
			{
				elementos[i]=elementos[i+1];
				datoR = dato;
			}

		}
		tamanoAct --;
		// TODO implementar
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		return (T) datoR;	
	}

}