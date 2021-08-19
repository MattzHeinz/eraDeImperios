package eraDeImperios;

public class Caballero extends Unidad {
	static final int DANIO_DE_GOLPE = 30;
	
	public Caballero(Posicion posicion) {
		super(posicion);
	}
	
	@Override
	public void atacar(Unidad otra) {
		if(this.estaVivo && otra.estaVivo) {
			double distancia = this.distanciaCon(otra);
			
			if (distancia >= 1 && distancia <= 3) {
				if(Math.random() > 0.2) {
					otra.recibirDanio(DANIO_DE_GOLPE);
					if(!otra.estaVivo) this.saquear(otra);
				}
				else this.huir();
			}
		}
	}
	
	private void huir() {
		if(Math.random() >= 0.5)
			this.posicion.moverse(2, 1);
		else this.posicion.moverse(-1, 2);
	}
}