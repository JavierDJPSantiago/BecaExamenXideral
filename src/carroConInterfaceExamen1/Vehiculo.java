package carroConInterfaceExamen1;

//Clase abstracta que da herencia
public interface Vehiculo {
		
	//Metodos abstractos para herencia
	String moverse ();
	
	int costo ();
	
	String color();
	
	String nombre ();
	
	int getVelocidad ();
	
	int acelerar(int velocidad);
}
