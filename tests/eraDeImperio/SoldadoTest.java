package eraDeImperio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import eraDeImperios.*;

public class SoldadoTest {
	Soldado miSoldado, enemigo;
	
	@Before
	public void setup() {
		miSoldado = new Soldado(new Posicion(0, 0));
	}
	@Test
	public void atacarEnemigo() {
		enemigo = new Soldado(new Posicion(1, 1));
		
		assertEquals(100, enemigo.getSalud());
		miSoldado.atacar(enemigo);
		assertEquals(80, enemigo.getSalud());
	}

	@Test
	public void atacarEnemigoMuyLejos() {
		enemigo = new Soldado(new Posicion(2, 0));
		
		assertEquals(100, enemigo.getSalud());
		miSoldado.atacar(enemigo);
		assertEquals(100, enemigo.getSalud());
	}

}

