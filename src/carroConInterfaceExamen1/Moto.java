package carroConInterfaceExamen1;



public class Moto implements Vehiculo {
	
	
	public String nombre = "Moto";
	int velocidad = 50;


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
		
		return nombre;
	}

	@Override
	public int getVelocidad() {
		return velocidad;
	}
	
	
	//Metodo acelerar: contiene if para que solo sean valores positivos
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
