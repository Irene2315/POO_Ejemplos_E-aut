package pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date fecha= new Date();
		
		System.out.println(fecha);
		
		//Y, M,m,d,S,k,H
		//formato
		
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy");
		//formateamos fecha
		
		System.out.println(sdf1.format(fecha));
		System.out.println(sdf2.format(fecha));
		
		
		//yo meto la fecha
		
		SimpleDateFormat formatoLectura1= new SimpleDateFormat("dd-MM-yyyy");
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Escribe una fecha en el formato dd-MM-yyyy");
		String stringfecha=scan.nextLine();
		Date fechaLeida= formatoLectura1.parse(stringfecha);
		System.out.println( sdf1.format(fechaLeida));
		//fechaLeida.after(fechaLeida)
		
		scan.close();
		
	}
	

}
