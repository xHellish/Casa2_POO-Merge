package Dispositivos;

public class dispositivo {
	private double altura;
    private double peso;
    private String color;
    private String marca;
    private boolean encendido;

    public dispositivo (double altura, double peso, String color, String marca) {
        this.altura = altura;
        this.peso = peso;
        this.color = color;
        this.marca = marca;
        this.encendido = false; // Por defecto, el electrodoméstico está apagado al crearlo
    }

    public void encender() {
        encendido = true;
        System.out.println("El electrodoméstico ha sido encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El electrodoméstico ha sido apagado.");
    }

    public void recibirOrden(String orden) {
        System.out.println("Se ha recibido la orden: " + orden);
    }

    // Getters y setters para los atributos
    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
