package Dispositivos;

public class lavanderia extends dispositivo {
    private boolean aguaLlenando;
    private boolean cicloIniciado;
    private boolean puertaAbierta;
    private boolean cicloSecado;
    public lavanderia(double altura, double peso, String color, String marca,
                    boolean aguaLlenando, boolean cicloIniciado, boolean puertaAbierta, boolean cicloSecado) {
        super(altura, peso, color, marca);
        this.aguaLlenando = aguaLlenando;
        this.cicloIniciado = cicloIniciado;
        this.puertaAbierta = puertaAbierta;
        this.cicloSecado = cicloSecado;
        this.puertaAbierta = puertaAbierta;
    }

    public void llenarse() {
        if (!aguaLlenando) {
            aguaLlenando = true;
            System.out.println("La lavadora está llenándose de agua.");
        } else {
            System.out.println("La lavadora ya se está llenando de agua.");
        }
    }

    public void drenar() {
        if (aguaLlenando) {
            aguaLlenando = false;
            System.out.println("El agua de la lavadora ha sido drenada.");
        } else {
            System.out.println("La lavadora ya está vacía.");
        }
    }

    public void iniciarCiclo() {
        if (!puertaAbierta && aguaLlenando && isEncendido()) {
            cicloIniciado = true;
            System.out.println("La lavadora ha iniciado el ciclo de lavado.");
        } else {
            System.out.println("No se puede iniciar el ciclo de lavado.");
        }
    }


    public void iniciarSecado() {
        if (!puertaAbierta && isEncendido()) {
            cicloSecado = true;
            System.out.println("La secadora ha iniciado el ciclo de secado.");
        } else {
            System.out.println("No se puede iniciar el ciclo de secado.");
        }
    }
}