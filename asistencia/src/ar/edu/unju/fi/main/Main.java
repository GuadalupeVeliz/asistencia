package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alumno alumno= generarAlumno(sc);
		registrarNota(sc,alumno,2);
		sc.close();
	}
	public static Alumno generarAlumno(Scanner sc) {
		Alumno alumno = new Alumno();
		
		System.out.println("Ingrese el legajo: ");
		Integer legajo=sc.nextInt();
		System.out.println("Ingrese apellido: ");
		String apellido=sc.next();
		System.out.println("Ingrese nombre: ");
		String nombre=sc.next();
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		return alumno;
	}
	
	public static void registrarNota(Scanner sc,Alumno alumno, int numMaterias){
		
		while(numMaterias>0) {
			//cargar Materia
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria=sc.next();		
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria=sc.next();		
			
			Materia materia=new Materia(codigoMateria,nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de notas: ");
			String codigoNota=sc.next();	
			System.out.println("Ingrese la nota final: ");
			Float nota=sc.nextFloat();	
			
			RegistroNota registroNota= new RegistroNota(codigoNota,alumno,materia,nota);
			System.out.println(registroNota.toString());
			numMaterias--;
		}
	}
}

