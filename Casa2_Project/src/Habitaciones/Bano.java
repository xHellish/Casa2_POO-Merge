package Habitaciones;

public class Bano extends Habitacion{
	
	boolean ducha=false;
	boolean grifo=false;
	boolean cadena=false;
	
	public Bano() {
		super("Baño", 6, 1, 1);
	}
	
	public void abrirGrifo() {
		if(servicios) {
			grifo=true;
			System.out.println("Grifo abierto");
		}
		else {
			System.out.println("Los servicios estan desactivados");
		}
	}
	public void cerrarGrifo() {
		grifo = false;
		System.out.println("Grifo cerrado");
	}
	public void abrirDucha() {
		if(servicios) {
			ducha=true;
			System.out.println("Ducha abierta");
		}
		else {
			System.out.println("Los servicios estan desactivados");
		}
	}
	public void cerrarDucha() {
		ducha = false;
		System.out.println("Ducha cerrada");
	}
	public void jalarCadena() {
		if(servicios) {
			cadena=true;
			System.out.println("Se ha jalado la cadena");
			cadena=false;
		}
		else {
			System.out.println("Los servicios estan desactivados");
		}
	}

}
