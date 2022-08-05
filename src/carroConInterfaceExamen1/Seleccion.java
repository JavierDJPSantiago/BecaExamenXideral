package carroConInterfaceExamen1;

public class Seleccion {

	//Switch para la elección del objeto con base a la entrada del cliente
	public static Vehiculo varios (int i) {
		switch(i) {
		case 1: 
			return new Carro();
		case 2: 
			return new Moto();
		default:
			return new Avion();
		
		}

		
		
	}
	
}
