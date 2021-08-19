package eraDeImperios;

public class Arquero extends Unidad implements Reseteable{
	private static final int DANIO_DE_GOLPE = 7;
	private static final int FLECHAS_INICIALES = 10;
	private int flechasActuales;

	public Arquero(Posicion posicion) {
		super(posicion);
		this.flechasActuales = FLECHAS_INICIALES;
	}

	@Override
	public void atacar(Unidad otra) {
		if(this.estaVivo && otra.estaVivo) {
			if (this.flechasActuales > 0) {
				double distancia = this.distanciaCon(otra);
				
				if (distancia >= 5 && distancia <= 25) {
					otra.recibirDanio(DANIO_DE_GOLPE);
					if(!otra.estaVivo) this.saquear(otra);
					this.flechasActuales--;
				}
			}
			else resetear();
		}
	}

	@Override
	public void resetear() {
		this.flechasActuales = FLECHAS_INICIALES;		
	}

}
