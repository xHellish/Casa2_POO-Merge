package dispositivos;


public class habitacion extends dispositivo {
    private int canalActual;
    private int volumen;
    private boolean encendida;
    private String informacion;
    public habitacion(double altura, double peso, String color, String marca) {
        super(altura, peso, color, marca);
        this.canalActual = 1;
        this.volumen = 20;
        this.encendida = false;
        this.informacion = "Información predeterminada de la computadora.";
    }

    public void sintonizarCanal(int canal) {
        if (canal >= 1 && canal <= 100) {
            canalActual = canal;
            System.out.println("El televisor ha sido sintonizado en el canal " + canalActual);
        } else {
            System.out.println("Canal no válido. El televisor solo tiene 100 canales disponibles.");
        }
    }

    public void subirVolumen() {
        if (volumen < 100) {
            volumen++;
            System.out.println("Volumen subido a " + volumen);
        } else {
            System.out.println("El volumen ya está en su máximo nivel.");
        }
    }

    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
            System.out.println("Volumen bajado a " + volumen);
        } else {
            System.out.println("El volumen ya está en su mínimo nivel.");
        }
    }

    public int getCanalActual() {
        return canalActual;
    }

    public int getVolumen() {
        return volumen;
    }
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora ha sido encendida.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La computadora ha sido apagada.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información de la computadora: " + informacion);
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public boolean isEncendida() {
        return encendida;
    }
}
