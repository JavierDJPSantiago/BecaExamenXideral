package carroConAbstractaExamen1;

//Clase abstracta que da herencia
public abstract class Vehiculo {

	//Metodos abstractos para herencia
	abstract String moverse ();
	
	abstract int costo ();
	
	abstract String color();
	
	abstract String nombre ();
	
	abstract int getVelocidad ();
	
	abstract int acelerar(int velocidad);
}
