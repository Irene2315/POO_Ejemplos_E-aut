package pruebas;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {
	public static void main(String[] args) {
		ArrayList<String> lista= new ArrayList<String>();
		
		lista.add("Marius");
		lista.add("Julen");
		lista.add("Christian");
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("---------------");
		Iterator<String> it= lista.iterator();
		
		while(it.hasNext()) {
			String nombre=it.next();
			if(nombre.contains("a")) {
				it.remove();
			}
		}
		while(it.hasNext()) {
			if(it.next().contains("a")) {
				it.remove();
			}
		}
		//chuleta de eclipse
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
		//no recomendable
		/*for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).contains("a")) {
				lista.remove(i);
			}
		}
		System.out.println();
		 * 
		 */
		//cambiar contenido
		for(int i=0;i<lista.size();i++) {
			String nombre=lista.get(i);
			nombre=nombre.replace("a", "");
			lista.set(i, nombre);
		}
	}
}
