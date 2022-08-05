package carroConAbstractaExamen1;

public abstract class Vehiculo {

	abstract String moverse ();
	
	abstract int costo ();
	
	abstract String color();
	
	abstract String nombre ();
	
	abstract int getVelocidad ();
	
	abstract int acelerar(int velocidad);
}
