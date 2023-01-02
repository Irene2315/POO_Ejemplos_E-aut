package clases;

public class Pez {
    //atributos
	private String nombre;
	private int peso;
	private String Color;
	private String especie;
	
	
	//metodos
	/*
	 * imprimira su nombre y especie
	 */
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	
	public void presentarse() {
		System.out.println("Hola soy "+nombre+" de la especie "+especie);
	
	}
	public String getColor() {
		return this.Color;
	}
	public void setColor( String color) {
		this.Color=color;
	}
	public int getPeso() {
		return this.peso;
	}
	public  void setPeso( int peso) {
		if(peso>0) {
			this.peso=peso;
		}
		else {
			this.error("Peso negativo");
		}
		
		
		
	}
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie( String especie) {
		this.especie=especie;
	}
	public void imprimirme() {
		System.out.println("Nombre "+this.nombre);
		System.out.println("Especie "+this.especie);
		System.out.println("Color "+this.Color);
		System.out.println("Peso "+this.peso+"gr");
		
	}
	private void error(String mensaje) {
		System.out.println("Error" +mensaje);
	}
	//int
	public void comer(int gramosComida) {
		if(gramosComida>=0) {
			peso=peso+gramosComida;
		}else {
			this.error("comida negativa");
		}
	}
	//string
	public void comer(Pez pez) {
		
	}
	
	
	/**
	 * anade los gramosComida al peso del pez
	 * @param gramosComida
	 */
	
}