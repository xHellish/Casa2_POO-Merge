package Dispositivos;

public class Sala extends dispositivo{
	private boolean tvEncendido;
    private boolean wifiActivado;
    private int canalActual;
    private int volumenTelevisor;
   
	public Sala(double altura, double peso, String color, String marca) {
		super(altura, peso, color, marca);
		this.tvEncendido=false;
		this.wifiActivado=false;
		this.canalActual=707; 
		this.volumenTelevisor=50;
	}
	 public void sintonizar(int canal) {
	        if (canal >= 1 && canal <= 900) { 
	            canalActual = canal;
	            System.out.println("Se ha cambiado al canal " + canal);
	        } else {
	            System.out.println("Canal Inexistente, Por favor contacte al operador de cable para mas informacion");
	        }
	    }
	 public void masVolumenTV() {
		 if(volumenTelevisor<100 ) {
			 volumenTelevisor++;
			 System.out.println("Se ha aumentado el volumen del televisor a" + volumenTelevisor);
		 }
		 
	 }
	 public void menosVolumenTV(){
		 if(volumenTelevisor>0) {
			 volumenTelevisor--;
			 System.out.println("Se ha disminuido el volumen del televisor a" + volumenTelevisor);
		 } 
		 
	 }
	
	 public void tvEncendido() {
		 tvEncendido=true;
		 System.out.println("El televisor se encuentra encendido");

		 
	 }
	 public void tvApagado() {
		 tvEncendido=false;
		 System.out.println("El televisor se encuentra apagado");

		 
	 }
	 public void wifiActivado() {
		 wifiActivado=true;
		 System.out.println("El wifi se encuentra activado");

		 
	 }
	 public void wifiDesactivado() {
		 wifiActivado=false;
		 System.out.println("El wifi se encuentra desactivado");

	 }
	
	 public void recibirOrdenTV(String orden) {
	    	super.recibirOrden(orden);
	        System.out.println("Se ha recibido la orden para el TV " + orden);
	    }

	 public void recibirOrdenWIFI(String orden) {
	    	super.recibirOrden(orden);
	        System.out.println("Se ha recibido la orden para el WIFI: " + orden);
	    }
		
	 

	    
		

}
