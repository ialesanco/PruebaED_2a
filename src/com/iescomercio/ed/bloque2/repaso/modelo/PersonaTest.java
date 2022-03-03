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
	void testSetDni() throws Exception {
		try {
			Persona p = new Persona("123456789", "Carlos", "Saenz");
			p.setDni("123456781");
			assertEquals("123456781", p.getDni());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	void testGetNombre() {
		Persona p = new Persona("123456789", "Carlos", "Saenz");
		assertEquals("Carlos", p.getNombre());
	}

	@Test
	void testSetNombre() {
		Persona p = new Persona("123456789", "Carlos", "Saenz");
        p.setNombre("Iker");
        assertEquals("Iker", p.getNombre());
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
