package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	@Test
	void testPersonaStringStringString() {
		Persona p = new Persona("123456789", "Carlos", "Saenz");
		assertEquals("Carlos", p.getNombre());
		assertEquals("Saenz", p.getApellido1());
		assertEquals("123456789", p.getDni());
	}

	@Test
	void testGetDni() {
		Persona p = new Persona("123456789", "Carlos", "Saenz");
		assertEquals("123456789", p.getDni());
	}

	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
