package eraDeImperios;

public class Posicion {
	private double x;
	private double y;
	
	public Posicion (double x, double y) {
		this.x =x;
		this.y = y;
	}
	
	public double distanciaCon( Posicion otra) {
		return Math.sqrt(Math.pow(this.x - otra.x, 2)+
				         Math.pow(this.y - otra.y, 2));
	}
	
	public void moverse(double difX, double difY) {
		this.x += difX;
		this.y += difY;
	}

}
