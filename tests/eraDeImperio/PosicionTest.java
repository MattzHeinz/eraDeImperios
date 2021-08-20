package eraDeImperio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import eraDeImperios.Posicion;
public class PosicionTest {
	Posicion pos;
	
	@Before
	public void setup() {
		pos = new Posicion(0, 0);
	}
	
	@Test
	public void test() {
		Posicion pos2 = new Posicion(2, 2);
		assertEquals(Math.sqrt(8), pos.distanciaCon(pos2), 0.0001);
	}

}
