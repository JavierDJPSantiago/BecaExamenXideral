package carroConInterfaceExamen1;



public class Carro implements Vehiculo {
	


	@Override
	public String moverse() {
		return "Me muevo por tierra";
	}

	@Override
	public int costo() {
		return 100000;
	}

	@Override
	public String color() {
		return "Rojo";
	}

	@Override
	public String nombre() {
		
		return "Carro";
	}

	@Override
	public int getVelocidad() {
		return 100;
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
