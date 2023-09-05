package Habitaciones;

public class Cochera extends Habitacion{
	
	boolean porton=false;
	
	public Cochera() {
		super("Cochera", 8, 2, 0);
	}
	
	public void abrirCochera() {
		if(servicios) {
			porton=true;
			System.out.println("Cochera abierta");
		}
		else {
			System.out.println("Los servicios estan desactivados");
		}
	}
	public void cerrarCochera() {
		if(servicios) {
			porton=false;
			System.out.println("Cochera cerrada");
		}
		else {
			System.out.println("Los servicios estan desactivados");
		}
	}	
}
