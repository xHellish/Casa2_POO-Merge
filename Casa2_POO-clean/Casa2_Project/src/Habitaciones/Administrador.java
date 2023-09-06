package Habitaciones;

public class Administrador {
	
	// ----------------- Habitaciones ---------------- // 
	
	Cocina kitchen = new Cocina();
	Dormitorio room1 = new Dormitorio();
	Dormitorio room2 = new Dormitorio();
	Lavanderia laundry = new Lavanderia();
	Sala living = new Sala();
	Bano restroom1 = new Bano();
	Bano restroom2 = new Bano();
	Cochera garage = new Cochera();
	
	/*
	room1.encenderLuz();
	room1.abrirPuerta();
	room2.encenderLuz();
	room2.abrirPuerta();
	restroom1.abrirPuerta();
	restroom1.encenderLuz();
	restroom1.abrirVentana();
	restroom1.jalarCadena();
	restroom1.abrirDucha();
	room2.apagarLuz();
	room2.cerrarPuerta();
	kitchen.encenderLuz();
	kitchen.abrirVentana();
	kitchen.abrirPuerta();
	kitchen.ensuciar();
	restroom1.cerrarDucha();
	restroom1.apagarLuz();
	restroom1.cerrarPuerta();
	room1.apagarLuz();
	room1.cerrarPuerta();
	living.abrirPuerta();
	living.encenderLuz();
	kitchen.abrirGrifo();
	kitchen.limpiar();
	kitchen.cerrarGrifo();
	kitchen.apagarLuz();
	kitchen.cerrarVentana();
	restroom1.abrirPuerta();
	restroom1.encenderLuz();
	restroom1.abrirGrifo();
	restroom1.cerrarGrifo();
	restroom1.cerrarVentana();
	restroom1.apagarLuz();
	restroom1.cerrarPuerta();
	garage.abrirPuerta();
	garage.encenderLuz();
	living.apagarLuz();
	living.cerrarPuerta();
	garage.cerrarPuerta();
	garage.abrirCochera();
	garage.apagarLuz();
	garage.cerrarCochera();
	*/ 
	
	
	/* 
	 * 
	 * 
	 * Estas las hice clases separadas usando super entoncess no creo que necesitemos lo de aqui
	 * Yo diria que aqui pongamos a que hora se realiza cada cosa y ya 
	 * 
	 * 
	 * 
	
	

	// ----------------- Métodos ------------------ //
	
	void orden(String _comando, String zona) {
		
		if (_comando == "status") {
			if (zona == "kitchen") {
				kitchen.estado();
			}else if (zona == "room1") {
				room1.estado();
			}else if (zona == "room2") {
				room2.estado();
			}else if (zona == "laundry") {
				laundry.estado();
			}else if (zona == "living") {
				living.estado();
			}else if (zona == "restroom1") {
				restroom.estado();
			}else if (zona == "restroom2") {
				restroom2.estado();
			}else if (zona == "garage") {
				garage.estado();
			}
			
		}else if (_comando == "ensuciar") {
			if (zona == "kitchen") {
				kitchen.ensuciar();
			}else if (zona == "room1") {
				room1.ensuciar();
			}else if (zona == "room2") {
				room2.ensuciar();
			}else if (zona == "laundry") {
				laundry.ensuciar();
			}else if (zona == "living") {
				living.ensuciar();
			}else if (zona == "restroom1") {
				restroom.ensuciar();
			}else if (zona == "restroom2") {
				restroom2.ensuciar();
			}else if (zona == "garage") {
				garage.ensuciar();
			}
			
		}else if (_comando == "taquear") {
			if (zona == "kitchen") {
				kitchen.taquear();
			}else if (zona == "room1") {
				room1.taquear();
			}else if (zona == "room2") {
				room2.taquear();
			}else if (zona == "laundry") {
				laundry.taquear();
			}else if (zona == "living") {
				living.taquear();
			}else if (zona == "restroom1") {
				restroom.taquear();
			}else if (zona == "restroom2") {
				restroom2.taquear();
			}else if (zona == "garage") {
				garage.taquear();
			}
		}
		
		 -Falta crear un método en la clase Habitación que desactive los servicios: 
		   	"serviciosOff" y otro que los active "serviciosOn". 
		   	
			-También un condicional en el método encender luz, que no sea posible si los servicios 
			están desactivados, a su vez que se apague la luz si se desactivan los servicios.
			
			--Si se van los servicios, en los banos y la cocina hay que poner que se va el agua
			
			-Todavía no está implementado el método de inundar habitación.
			
		
		 else if (_comando == "serviciosOff") {
			if (zona == "kitchen") {
				kitchen.serviciosOff();
			}else if (zona == "room1") {
				room1.serviciosOff();
			}else if (zona == "room2") {
				room2.serviciosOff();
			}else if (zona == "laundry") {
				laundry.serviciosOff();
			}else if (zona == "living") {
				living.serviciosOff();
			}else if (zona == "restroom1") {
				restroom.serviciosOff();
			}else if (zona == "restroom2") {
				restroom2.serviciosOff();
			}else if (zona == "garage") {
				garage.serviciosOff();
			}	
		} 
	}*/

}
