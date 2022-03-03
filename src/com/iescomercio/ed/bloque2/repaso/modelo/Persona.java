package com.iescomercio.ed.bloque2.repaso.modelo;

/**
 * Javadoc hecho para Entornos de Desarrollo la clase Persona
 * 
 * @author Iker Alesanco
 * @version 1.0
 */
public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	/**
	 * Constructor que nos permitira crear una persona
	 * 
	 * @param dni       El dni de la persona en cuestion
	 * @param nombre    El nombre de la persona en cuestion
	 * @param apellido1 El apellido de la persona en cuestion
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * Metodo que nos permite saber el dni de una persona concreta
	 * 
	 * @return Devuelve el dni de dicha persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo que nos permitira cambiar el dni de una persona concreta
	 * 
	 * @param dni El nuevo dni que queremos asignarle
	 * @throws Exception Si el ultimo caracter del dni no es una letra saltara una
	 *                   excepcion
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length()))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/**
	 * Metodo que nos permite saber el nombre de una persona concreta
	 * 
	 * @return Devuelve el nombre de dicha persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que nos permitira cambiar el nombre de una persona concreta
	 * 
	 * @param nombre El nuevo nombre que queremos asignarle
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que nos permite saber el apellido de una persona concreta
	 * 
	 * @return Devuelve el apellido de dicha persona
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Metodo que nos permitira cambiar el apellido de una persona concreta
	 * 
	 * @param apellido1 El nuevo apellido que queremos asignarle
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
