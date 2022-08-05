package carroConInterfaceExamen1;



public class Carro implements Vehiculo {
	
	public String nombre = "Carro";
	int velocidad = 100;


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
