package control;
import Habitaciones.Cocina;

public class SuspenderAguaLuz {
	private boolean SuspenderAgua;
	private boolean SuspenderLuz;
	
	public SuspenderAguaLuz() {
		SuspenderAgua = false;
		SuspenderLuz = false;
	}
	
	Cocina kitchen = new Cocina();

	public String isSuspenderAgua() {
		if (SuspenderAgua == true) {
			System.out.println("Agua ha sido suspendida");
			return "Agua ha sido suspendida";
		}
		else {
			System.out.println("Agua no ha sido suspendida");
			return "Agua no ha sido suspendida";
		}
	}
	
	public String isSuspenderLuz() {
		if (SuspenderLuz == true) {
			return "Luz ha sido suspendida";
		}
		else {
			return "Luz no ha sido suspendida";
		}
	}

	public void setSuspenderAgua(boolean grifo){
		if(grifo ==true){
			SuspenderAgua = true;
			System.out.println("se supende el agua");
		}
		else{
			SuspenderAgua = false;
			System.out.println("el agua no se suspende");
		}
	}
}

