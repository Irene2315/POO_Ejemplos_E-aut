package clases;

public class Persona {
	private String nombrePersona;
	private String primeroApellido;
	private String segundoApellido;
	private String fechaNacimiento;
	
	
	
	public String getnombrePersona() {
		return this.nombrePersona;
	}
	public void setnombrePersona(String nombre) {
		this.nombrePersona=nombre;
	}
	public String getprimerApellido() {
		return this.primeroApellido;
	}
	public void setprimerApellido(String primer_apellido) {
		this.primeroApellido=primer_apellido;
	}
	public String getsegundoApellido() {
		return this.segundoApellido;
	}
	public void setsegundoApellido(String segundo_apellido) {
		this.segundoApellido=segundo_apellido;
	}
	public String getfechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setfechaNacimiento(String fecha_nacimiento) {
		this.fechaNacimiento=fecha_nacimiento;
	}
	
	public void imprimirme() {
		System.out.println("Nombre "+this.nombrePersona);
		System.out.println("1.apellido "+this.primeroApellido);
		System.out.println("2.apellido "+this.segundoApellido);
		System.out.println("fecha nacimiento "+this.fechaNacimiento);
		
	}
	
	
	
	
	
}