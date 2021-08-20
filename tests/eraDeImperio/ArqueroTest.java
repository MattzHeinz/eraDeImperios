package eraDeImperio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import eraDeImperios.Arquero;
import eraDeImperios.Posicion;

public class ArqueroTest {
	Arquero miArquero, enemigo;

	@Before
	public void setup() {
		miArquero = new Arquero(new Posicion(0, 0));
	}

	@Test
	public void atacarEnemigo() {
		enemigo = new Arquero(new Posicion(5, 5));
		
		System.out.println(enemigo);
		miArquero.distanciaCon(enemigo);
		System.out.println(enemigo);
		
		assertEquals(100, enemigo.getSalud());
		miArquero.atacar(enemigo);
		assertEquals(93, enemigo.getSalud());
	}

	@Test
	public void atacarEnemigoMuyLejos() {
		enemigo = new Arquero(new Posicion(20, 20));
		
		assertEquals(100, enemigo.getSalud());
		miArquero.atacar(enemigo);
		assertEquals(100, enemigo.getSalud());
	}
	
	@Test
	public void atacarEnemigoMuyCerca() {
		enemigo = new Arquero(new Posicion(2, 2));
		
		assertEquals(100, enemigo.getSalud());
		miArquero.atacar(enemigo);
		assertEquals(100, enemigo.getSalud());
	}

}
