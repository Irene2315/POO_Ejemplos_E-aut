package pruebas;

import java.util.ArrayList;

public class PruebaAnimales {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.setAnios(5);
		a1.setEspecie("perro");
		
		Animal a2 = new Animal("gato", 2);
		
		System.out.println();
		
		ArrayList<Animal> animales = new ArrayList<Animal>();
		
		System.out.println(animales.isEmpty());

		animales.add(a1);
		animales.add(a2);
		
		System.out.println(animales.isEmpty());

	}

}
