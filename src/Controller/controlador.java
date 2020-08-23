package Controller;

import java.util.Scanner;
import view.View;
import modeloLogico.Modelo;

public class controlador {

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	public controlador()
	{
		view = new View();
		modelo = new Modelo();
	}

	public void run()
	{
		Scanner lectura = new Scanner(System.in);
		boolean acabar = false;
		Integer dato = null;
		Comparable rta = " ";

		while(!acabar)
		{
			view.printMenu();

			int opcion = lectura.nextInt();
			switch(opcion) {
			case 1:
			view.printMessage(" \n Encontrar películas buenas de un director \n Dar nombre del director: ");
			String director_name = lectura.next();
			rta = modelo.darPeliculasDeUnDirector(director_name);
			if ( rta != null)
			{
				view.printMessage("Películas buenas del director "+director_name+ "\n"+ rta);
				
			}
			else
			{
				view.printMessage("Director no encontrado");
			}						
			break;
			}
		}
	}


























}
