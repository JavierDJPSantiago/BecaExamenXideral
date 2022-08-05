package carroConAbstractaExamen1;

public class Moto extends Vehiculo {
	
	
	
	@Override
	public String moverse() {
		return "Me muevo por tierra";
	}

	@Override
	public int costo() {
		return 50000;
	}

	@Override
	public String color() {
		return "verde";
	}

	@Override
	public String nombre() {
		
		return "Moto";
	}

	@Override
	public int getVelocidad() {
		return 50;
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
