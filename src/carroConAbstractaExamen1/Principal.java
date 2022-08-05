package carroConAbstractaExamen1;

import java.util.Scanner;

public class Principal {
	
	//Variable que contiene el valor de la aceleración
	static int aceleracion;
	
	public static void main(String[] args) {

		//Instancia de objeto scanner para recibir información por consola del cliente
		Scanner eleccionVehiculoYAceleracion = new Scanner (System.in);	
		
		System.out.println("Introduzca un número del 1 al 3 por favor");
		
		//variable de tipo int para la elección del vehiculo
		int numeroVehiculo = eleccionVehiculoYAceleracion.nextInt();
		
		System.out.println("¿Cuantos km quiere que acelere?");
		
		//Variable que contiene el valor de la aceleración
		aceleracion = eleccionVehiculoYAceleracion.nextInt();

		//Cerrado del escaner
		eleccionVehiculoYAceleracion.close();
		
		//Llamada al metodo elegirVehiculo de la clase selección
		Vehiculo vehiculo = Seleccion.elegirVehiculo(numeroVehiculo);
		
		//Llamada al metodo datos
		datos(vehiculo);
		
	}
	
	//metodo de la clase: muestra datos del objeto y la velocidad de la aceleración
	private static void datos (Vehiculo vehiculo) {
		System.out.println(" Hola "+ " soy un " + vehiculo.nombre() + " " + vehiculo.moverse() + " mi costo es de " + vehiculo.costo() + " pesos " + " y soy de color " + vehiculo.color());
		System.out.println("LLevo una velocidad de " + vehiculo.getVelocidad() + " km/h " + " he acelerado a " + vehiculo.acelerar(aceleracion) + " km/h");
	}
	
	
}
