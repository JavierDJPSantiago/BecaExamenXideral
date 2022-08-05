package carroConAbstractaExamen1;

public class Avion extends Vehiculo {
	
	

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
		
		return "Avion";
	}

	@Override
	public int getVelocidad() {
		return 10000;
	}
	
		//Metodo acelerar: contiene if para que solo sean valores positivos
	@Override
	public int acelerar(int velocidad) {
		int resultado = 0;
		if(velocidad>0) {
			resultado = getVelocidad() + velocidad;
		}
		else {
			System.out.println("Debe ser un número mayor a 0");
		}
		
		return resultado;
	}
}
