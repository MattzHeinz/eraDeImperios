package eraDeImperios;

public class Soldado extends Unidad implements Reseteable{
	static final int DANIO_DE_GOLPE = 20;
	private static final int ATAQUES_CONSECUTIVOS = 2;
	private int ataquesParaCansarse;

	public Soldado(Posicion posicion) {
		super(posicion);
		this.ataquesParaCansarse = ATAQUES_CONSECUTIVOS;
	}

	@Override
	public void atacar(Unidad otra) {
		if(this.estaVivo && otra.estaVivo) {
			if(this.ataquesParaCansarse != 0) {
				if (this.distanciaCon(otra) < 1.5) {
					otra.recibirDanio(DANIO_DE_GOLPE);
					if(!otra.estaVivo) this.saquear(otra);
					this.ataquesParaCansarse--;
				}
			}
			else resetear();
		}
	}

	@Override
	public void resetear() {
		this.ataquesParaCansarse = ATAQUES_CONSECUTIVOS;
	}

}