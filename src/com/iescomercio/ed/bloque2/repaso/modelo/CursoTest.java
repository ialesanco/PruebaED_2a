package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {
	public Curso c;

	@BeforeEach
	void beforeEach() {
		c = new Curso();
		c.aniadirAlumno(new Persona("123456789", "asdfsad", "asdf"));
		c.aniadirAlumno(new Persona("25", "asdfsad", "asdf"));
		c.aniadirAlumno(new Persona("123477789", "asdfsad", "asdf"));
	}

	@Test
	void testEliminarAlumno() {
		try {
			int numBefore = c.numeroAlumnos();
			c.eliminarAlumno("123456789");
			int numAfter = c.numeroAlumnos();
			assertEquals(numBefore - 1, numAfter);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	void testEliminarAlumnoError() {
		assertThrows(Exception.class, () -> c.eliminarAlumno("1"));

	}

	@Test
	void testAniadirAlumno() {
		Curso cs = new Curso();
		cs.aniadirAlumno(new Persona("123456789", "Iker", "Alesanco"));
		assertEquals(1, cs.numeroAlumnos());
	}

	@Test
	void testEstaRegistrado() {
		assertTrue(c.estaRegistrado("123456789"));
		assertFalse(c.estaRegistrado("33333333"));
	}

	@Test
	void testCurso() {
		Curso cs = new Curso();
		cs.aniadirAlumno(new Persona("123456789", "Iker", "Alesanco"));
		assertEquals(1, cs.numeroAlumnos());
	}

	@Test
	void testNumeroAlumnos() {
		assertEquals(3, c.numeroAlumnos());
	}

}
