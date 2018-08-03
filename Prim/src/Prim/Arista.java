package Prim;


public class Arista {
	
	private int nodoOrigen;
	private int nodoFin;
	private int costo;
	
	public Arista(int nodoA, int nodoB, int costo){
		
		this.nodoOrigen=nodoA;
		this.nodoFin=nodoB;
		this.costo=costo;
		
	}

	public int getNodoOrigen() {
		return nodoOrigen;
	}

	public void setNodoOrigen(int nodoOrigen) {
		this.nodoOrigen = nodoOrigen;
	}

	public int getNodoFin() {
		return nodoFin;
	}

	public void setNodoFin(int nodoFin) {
		this.nodoFin = nodoFin;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	


}