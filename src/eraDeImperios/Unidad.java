package eraDeImperios;

public abstract class Unidad implements Saqueable{
	protected Posicion posicion;
	protected int salud;
	protected int monedasDeOro;
	protected boolean estaVivo;
	
	static final int SALUD_INICIAL = 100;
	static final int ORO_INICIAL = 10;
	private static final int COSTO_POCION = 20;
	private static final int SALUD_REGEN_POCION = 75;
	
	public Unidad(Posicion pos) {
		this.posicion = pos;
		this.salud = SALUD_INICIAL;
		this.monedasDeOro = ORO_INICIAL;
		this.estaVivo = true;
	}
	
	public abstract void atacar(Unidad otra);
	
	public double distanciaCon(Unidad otra) {
		return this.posicion.distanciaCon(otra.posicion);
	}	

	protected void recibirDanio(int danio) {
		this.salud -= danio;
		if(this.salud <= 0) this.estaVivo = false;
	}
	
	public void comprarPocion() {
		if(this.monedasDeOro >= COSTO_POCION) {
			this.monedasDeOro -= COSTO_POCION;
			this.curarse(SALUD_REGEN_POCION);
		}
	}
	
	protected void curarse(int curacion) {
		this.salud = (curacion + this.salud > SALUD_INICIAL)? 
				SALUD_INICIAL 
				: curacion + this.salud;
	}
	
	@Override
	public void saquear(Unidad otra) {
		this.monedasDeOro += otra.monedasDeOro;
		otra.monedasDeOro = 0;
	}
	
	public int getSalud() {
		return this.salud;
	}
	
	public int getMonedasDeOro() {
		return this.monedasDeOro;
	}
}
