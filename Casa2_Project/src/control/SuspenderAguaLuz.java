package control;

public class SuspenderAguaLuz {
	private boolean SuspenderAgua;
	private boolean SuspenderLuz;
	
	public SuspenderAguaLuz() {
		SuspenderAgua = false;
		SuspenderLuz = false;
	}
	
	public String isSuspenderAgua() {
		if (SuspenderAgua == true) {
			return "Agua ha sido suspendida";
		}
		else {
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
}

