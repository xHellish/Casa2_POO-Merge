package Dispositivos;

public class patio extends dispositivo{
	 private boolean podadoraCespedEncendida;
	    private boolean riegoEncendido;
	 public patio(double altura, double peso, String color, String marca) {
		super(altura, peso, color, marca);
		
		podadoraCespedEncendida = false;
        riegoEncendido = false;
	}
	public void encenderPodadora() {
		podadoraCespedEncendida=true;
		System.out.println("La podadora de cesped esta encendida");
		
		
	}
	public void apagarPodadora() {
		podadoraCespedEncendida=false;
		System.out.println("La podadora de cesped esta apagada");
		
		
	}
	
	public void encenderRiego() {
		  riegoEncendido = true;		
		  System.out.println("El sistema de riego esta encendido");

		  
		
	}
	public void apagarRiego() {
		  riegoEncendido = true;		
		  System.out.println("El sistema de riego esta encendido");

	  
		
	}
	 public void recibirOrdenRiego(String orden) {
	    	super.recibirOrden(orden);

	        System.out.println("Se ha recibido la orden para el sistema de riego" + orden);
	    }

	 public void recibirOrdenPodadora(String orden) {
	    	super.recibirOrden(orden);

	        System.out.println("Se ha recibido la orden para la podadora de cesped " + orden);
	    }
	

}
