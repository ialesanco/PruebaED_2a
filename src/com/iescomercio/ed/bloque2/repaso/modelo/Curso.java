package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Javadoc hecho para Entornos de Desarrollo la clase Curso
 * 
 * @author Iker Alesanco
 * @version 1.0
 */
public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * Este metodo eliminara a un alumno del curso en cuestion
	 * 
	 * @param dni Pasaremos por pantalla el dni del alumno a eliminar
	 * @throws Exception Si la longitud del dni es incorrecta saltara una excepcion
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Este metodo aniadira a una persona a un curso
	 * 
	 * @param p Pasaremos como parametro la persona que queremos aniadir
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Este metodo lo utilizaremos para saber si una persona esta registrada en este
	 * curso
	 * 
	 * @param dni meteremos el dni de la persona que queremos buscar
	 * @return Devolvera true en caso de encontrarlo y falso en caso de que no este
	 *         registrado en el curso
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Con este constructor crearemos un curso con un nuevo ArrayList de personas
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * Este metodo nos permitira saber el numero de alumnos registrados en este
	 * curso
	 * 
	 * @return devuelve el numero de alumnos registrados en este curso
	 * 
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
