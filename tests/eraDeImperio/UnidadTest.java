package eraDeImperio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import eraDeImperios.*;

public class UnidadTest {
	Unidad u1, u2, u3, u4;
	
	@Before
	public void setup() {
		u1 = new Arquero(new Posicion(3, 3));
		u2 = new Caballero(new Posicion(2.5, 2));
		u3 = new Soldado(new Posicion(3, 2));
		u4 = new Arquero(new Posicion(6, 6));
	}
	
	@Test
	public void saquearTest() {
		u3.atacar(u1);
		u3.atacar(u1);
		u3.atacar(u1);//Descansa
		
		u4.atacar(u3);
		u4.atacar(u3);
		u4.atacar(u3);
		u4.atacar(u3);
		
		u3.atacar(u1);
		u3.atacar(u1);
		u3.atacar(u1);//Descansa
		
		u4.atacar(u3);
		
		assertEquals(10, u1.getMonedasDeOro());
		u3.atacar(u1);
		assertEquals(0, u1.getMonedasDeOro());
		assertEquals(20, u3.getMonedasDeOro());
		
		assertEquals(65, u3.getSalud());
		u3.comprarPocion();
		assertEquals(100, u3.getSalud());
	}

}
