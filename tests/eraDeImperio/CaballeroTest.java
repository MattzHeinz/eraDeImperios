package eraDeImperio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import eraDeImperios.Caballero;
import eraDeImperios.Posicion;
import eraDeImperios.Unidad;

public class CaballeroTest {
	Caballero miCaballero, enemigo;
	
	@Before
	public void setup(){
		miCaballero = new Caballero(new Posicion (0, 0));
		
		Unidad [] unidades = new Unidad[5];
		unidades[0] = new Caballero (new Posicion(0,0));
		unidades[1] = new Arquero(new Posicion(0,0));
		unidades[2] = new Soldado(new Posicion(0,0));
		
		unidades
	}
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
