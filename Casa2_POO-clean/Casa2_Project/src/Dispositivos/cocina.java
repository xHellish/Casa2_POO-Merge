package Dispositivos;

public class cocina extends dispositivo {
    private double cantidadDeAgua;
    private boolean puertaAbierta;
    private boolean platosEnLavaplatos;
    private boolean discosEncendidos;
    private boolean hornoEncendido;
    public cocina(double altura, double peso, String color, String marca, double cantidadDeAgua) {
        super(altura, peso, color, marca);
        this.cantidadDeAgua = cantidadDeAgua;
        this.puertaAbierta = false;
        this.platosEnLavaplatos = false;
        this.discosEncendidos = false;
        this.hornoEncendido = false;
    }

    public void servirAgua(double cantidad) {
        if (cantidad > 0 && cantidad <= cantidadDeAgua && !puertaAbierta) {
            cantidadDeAgua -= cantidad;
            System.out.println("Se ha servido " + cantidad + " litros de agua del refrigerador.");
        } else {
            System.out.println("No se puede servir esa cantidad de agua o el refrigerador está vacío o la puerta está abierta.");
        }
    }

    public void abrirPuerta() {
        puertaAbierta = true;
        System.out.println("La puerta del refrigerador ha sido abierta.");
    }

    public void cerrarPuerta() {
        puertaAbierta = false;
        System.out.println("La puerta del refrigerador ha sido cerrada.");
    }

    public double getCantidadDeAgua() {
        return cantidadDeAgua;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void drenar() {
        if (platosEnLavaplatos) {
            platosEnLavaplatos = false;
            System.out.println("Los platos han sido drenados del lavaplatos.");
        } else {
            System.out.println("El lavaplatos está vacío.");
        }
    }

    public void lavarPlatos() {
        if (!platosEnLavaplatos) {
            platosEnLavaplatos = true;
            System.out.println("Se están lavando los platos en el lavaplatos.");
        } else {
            System.out.println("Los platos ya están en el lavaplatos.");
        }
    }

    public boolean isPlatosEnLavaplatos() {
        return platosEnLavaplatos;
    }


    public void encenderDiscos() {
        if (!discosEncendidos) {
            discosEncendidos = true;
            System.out.println("Los discos de la estufa han sido encendidos.");
        } else {
            System.out.println("Los discos ya están encendidos.");
        }
    }

    public void apagarDiscos() {
        if (discosEncendidos) {
            discosEncendidos = false;
            System.out.println("Los discos de la estufa han sido apagados.");
        } else {
            System.out.println("Los discos ya están apagados.");
        }
    }

    public void encenderHorno() {
        if (!hornoEncendido) {
            hornoEncendido = true;
            System.out.println("El horno de la estufa ha sido encendido.");
        } else {
            System.out.println("El horno ya está encendido.");
        }
    }

    public void apagarHorno() {
        if (hornoEncendido) {
            hornoEncendido = false;
            System.out.println("El horno de la estufa ha sido apagado.");
        } else {
            System.out.println("El horno ya está apagado.");
        }
    }

    public boolean isDiscosEncendidos() {
        return discosEncendidos;
    }

    public boolean isHornoEncendido() {
        return hornoEncendido;
    }
}