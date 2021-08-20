package eraDeImperio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import eraDeImperios.Caballero;
import eraDeImperios.Posicion;
public class CaballeroTest {
	Caballero miCaballero, enemigo;
	
	@Before
	public void setup() {
		miCaballero = new Caballero(new Posicion(0, 0));
	}
	
	@Test
	public void atacarEnemigo() {
		enemigo = new Caballero(new Posicion(1, 0));
		
		assertEquals(100, enemigo.getSalud());
		miCaballero.atacar(enemigo);
		assertEquals(70, enemigo.getSalud());
	}

	@Test
	public void atacarEnemigoMuyLejos() {
		enemigo = new Caballero(new Posicion(4, 0));
		
		assertEquals(100, enemigo.getSalud());
		miCaballero.atacar(enemigo);
		assertEquals(100, enemigo.getSalud());
	}
	
	@Test
	public void atacarEnemigoMuyCerca() {
		enemigo = new Caballero(new Posicion(0.75, 0));
		
		assertEquals(100, enemigo.getSalud());
		miCaballero.atacar(enemigo);
		assertEquals(100, enemigo.getSalud());
	}

}

