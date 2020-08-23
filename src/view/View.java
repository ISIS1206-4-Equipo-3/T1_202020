package view;

import modeloLogico.Modelo;

public class View {

	public View()
	{
		
	}
	
	public void printMenu()
	{
		System.out.println("1. Encontrar películas buenas películas de un director");
		System.out.println("2. Crear ranking de películas");
		System.out.println("3. Conocer información sobre un director");
		System.out.println("4. Conocer información sobre un actor");
		System.out.println("5. Conocer características de un género de películas");
		System.out.println("6. Crear ranking de un género de películas");
		System.out.println("7. Exit");
		System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
	}

	public void printMessage(String mensaje) {

		System.out.println(mensaje);
	}		
	
	public void printModelo(Modelo modelo)
	{
		// TODO implementar
	}
	
}
