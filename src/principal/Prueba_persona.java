package principal;

import clases.Persona;

public class Prueba_persona {

	public static void main(String[] args) {
	Persona persona1=new Persona();
	Persona persona2=new Persona();
	persona1.setnombrePersona("Marius");
	persona1.setprimerApellido("Guceanu");
	persona1.setsegundoApellido(" ");
	persona1.setfechaNacimiento("12-12-2000");
 
	persona2.setnombrePersona("Irene");
	persona2.setprimerApellido("Herrero");
	persona2.setsegundoApellido("San Jose ");
	persona2.setfechaNacimiento("15-03-2000");
	
	
	Persona[] alumnos=new Persona[2];
	alumnos[0]=persona1;
	alumnos[1]=persona2;
	for (int i = 0; i < alumnos.length; i++) {
		alumnos[i].imprimirme();
	}
	}

}
