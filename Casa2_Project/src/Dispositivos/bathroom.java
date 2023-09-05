package dispositivos;

public class bathroom extends dispositivo {
	private boolean aguaFria;
    private boolean aguaCaliente;
    private boolean aguaTibia;
    private String formaLimpiezaBidet;
    private boolean activarDucha;

	public bathroom(double altura, double peso, String color, String marca) {
		super(altura, peso, color, marca);
		 aguaFria = false;
	     this.aguaCaliente = false;
	     this.aguaTibia=false;
	     this.formaLimpiezaBidet = "Normal";
	     this.activarDucha=false;
	}
	public void activarDucha() {
		activarDucha=true;
        System.out.println("La ducha ha sido encendida.");
		
	}
	public void apagarDucha() {
		activarDucha=false;
        System.out.println("La ducha ha sido apagada.");
		
	}
	public void aguaFria() {
		aguaFria=true;
		aguaCaliente=false;
		aguaTibia=false;
        System.out.println("La temperatura del agua de la ducha esta fria.");

	}
	public void aguaCaliente() {
		aguaFria=false;
		aguaCaliente=true;
		aguaTibia=false;
        System.out.println("La temperatura del agua de la ducha esta caliente.");
		
	}
	public void aguaTibia() {
		aguaFria=false;
		aguaCaliente=false;
		aguaTibia=true;
        System.out.println("La temperatura del agua de la ducha esta tibia (ni muy fria ni muy caliente.)");
	
	}
	public void sinAgua() {
		aguaFria=false;
		aguaCaliente=false;
		aguaTibia=false;
        System.out.println("El agua en la ducha esta desactivada.");
		
	}
	public void cambiarLimpieza(String forma) {
        formaLimpiezaBidet = forma;
        System.out.println("Se ha cambiado la forma de limpieza del bidet a: " + forma);
    }

	public void recibirOrdenDucha(String orden) {
		super.recibirOrden(orden);
        System.out.println("Se ha recibido la orden para la ducha: " + orden);
    }

    public void recibirOrdenBidet(String orden) {
    	super.recibirOrden(orden);
        System.out.println("Se ha recibido la orden para el bidet: " + orden);
    }
	

}
