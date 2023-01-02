package principal;

import clases.Pez;

public class Prueba_pez {

		public static void main(String[] args) {
			// new es un metodo contructor,para crear objetos
		  Pez pez=new Pez();
		  pez.setNombre("Nemo");
		  pez.setColor("naranja");
		  pez.setEspecie("pez payaso");
		  pez.setPeso(10);
		  
		  pez.imprimirme();
		  
		  pez.comer(-3);
		 // pez.presentarse();
		  
		 
		}

	}

