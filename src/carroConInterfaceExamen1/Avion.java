package carroConInterfaceExamen1;

public class Avion implements Vehiculo {
	
	public String nombre = "Avion";
	int velocidad = 10000;

	

	@Override
	public String moverse() {
		return "Me muevo por aire";
	}

	@Override
	public int costo() {
		return 10000000;
	}

	@Override
	public String color() {
		return "blanco";
	}

	@Override
	public String nombre() {
		
		return nombre;
	}

	@Override
	public int getVelocidad() {
		return velocidad;
	}
	
	@Override
	public int acelerar(int velocidad) {
		int resultado = 0;
		if(velocidad>0) {
			resultado = this.velocidad + velocidad;
		}
		else {
			System.out.println("Debe ser un número mayor a 0");
		}
		
		return resultado;
	}
}
