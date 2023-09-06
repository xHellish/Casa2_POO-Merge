package Habitaciones;

public class Habitacion {
	
	// --------------- Atributos -------------- //
	
		String nombre;
		
		boolean servicios = true;
		boolean puertaAbierta = true;
		boolean ventanasAbiertas = true;
		boolean iluminado = true;
		boolean sucio = false;
		boolean taqueado = false;
		
		int metrosCuadrados;
		int puertasCont;
		int ventanasCont;
		
		int objetosCont = 0;
		String[] objetosArray = new String[20];
		
		// --------------- Constructor -------------- //
		
		public Habitacion() {
			nombre = "";
			metrosCuadrados = 0;
			puertasCont = 0;
			ventanasCont = 0;		
		}
		
		public Habitacion(String _nombre, int _dimension, int _puertas, int _ventanas) {
			nombre = _nombre;
			metrosCuadrados = _dimension;
			puertasCont = _puertas;
			ventanasCont = _ventanas;		
		}
		
		//----------------- Métodos ----------------- //
		
		public void cerrarPuerta() {
			puertaAbierta = false;
			System.out.println(this.nombre+": Puerta cerrada");
		}
		
		public void abrirPuerta() {
			puertaAbierta = true;
			System.out.println(this.nombre+": Puerta abierta");
		}
		
		public void cerrarVentana() {
			ventanasAbiertas = false;
			System.out.println(this.nombre+": Ventana cerrada");
		}
		
		public void abrirVentana() {
			ventanasAbiertas = true;
			System.out.println(this.nombre+": Ventana abierta");
		}
		
		public void encenderLuz() {
			if(servicios) {
				iluminado = true;
				System.out.println(this.nombre+": Luz encendida");
			}
			else {
				System.out.println(this.nombre+": Los servicios estan desactivados");
			}
		}
		
		public void apagarLuz() {
			iluminado = false;
			System.out.println(this.nombre+": Luz apagada");
		}
		
		public boolean ensuciar() {
			sucio = true;
			System.out.println(this.nombre+": Habitacion ensuciada");
			if(sucio == true){
				return true;
			}
			else{
				return false;
			}
		}
		
		public void limpiar() {
			sucio = false;
			System.out.println(this.nombre+": Habitacion limpiada");
		}
		
		public void taquear() {
			taqueado = true;
			System.out.println(this.nombre+": Se ha taqueado la tuberia");
		}
		
		public void destaquear() {
			taqueado = false;
			System.out.println(this.nombre+": Se ha destaqueado la tuberia");
		}
		
		public void estado() {
			System.out.println("Habitación: "+ nombre +". "+ metrosCuadrados + " metros cuadrados.");
			System.out.println("Servicios: "+ servicios);
			System.out.println("Puertas abiertas: "+ puertaAbierta);
			System.out.println("Ventanas abiertas: "+ ventanasAbiertas);
			System.out.println("Iluminado: "+ iluminado);
			System.out.println("Sucio: "+ sucio);
			System.out.println("taqueado: "+ taqueado);
			
		}
		
		public void agregarObjeto(String _objeto) {
			
			if (objetosCont < 20) {
				objetosArray[objetosCont] = _objeto;
				objetosCont += 1;
				System.out.println("Se ha agregado "+_objeto+" a "+this.nombre);
				
			}else {
				System.out.println("No puede agregar más objetos en "+this.nombre+". (máx 20)");
			}
			
		}
		
		
		// Si la condición es = 0, imprime los objetos.
		public String[] objetos(int condicion) {
			
			if (condicion == 0) {
				for (int i = 0; i < objetosArray.length; i++) {
					if(objetosArray[i] != null) {
						if(objetosArray[i+1] == null) {
							System.out.println(objetosArray[i]);
							
						}else {
							System.out.print(objetosArray[i]+" - ");
						}
					}
				}
				
				return objetosArray;
				
			}else {
				return objetosArray;
				
			}
		}
		public void serviciosOn() {
			servicios=true;
			System.out.println("Servicios activados");
		}
		public void serviciosOff() {
			servicios=false;
			iluminado=false;
			System.out.println("Servicios desactivados");
		}

}
