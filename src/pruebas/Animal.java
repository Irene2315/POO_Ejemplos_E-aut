package pruebas;

public class Animal {
	private String nombreEspecie;
	private int anios;
	
	public Animal() {
		
	}

	public Animal(String especie, int anios) {
		super();
		this.nombreEspecie = especie;
		this.anios = anios;
	}

	public String getEspecie() {
		return nombreEspecie;
	}

	public void setEspecie(String especie) {
		this.nombreEspecie = especie;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}
	
	
	

}
