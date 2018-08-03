package Prim;

public class MatrizAdyacencia {
	
	private int matriz[][];
	private int nodos;
	private boolean dirigido;
	
	public MatrizAdyacencia(int cant_nodos, boolean dirigido){
		
		this.nodos=cant_nodos;
		this.dirigido=dirigido;
		matriz=new int[nodos][nodos];
		
		for(int i=0;i<nodos;i++)
			for(int j=0;j<nodos;j++)
				matriz[i][j]=0;
	}
	
	
	//ESTE CUANDO EMPIEZA DE 1
	public void agregarArist(int i, int j, int costo){
		matriz[i-1][j-1] = costo;
		if(!dirigido)
			matriz[j-1][i-1] = costo;
	}
	
	public boolean sonAdyacentes(int i, int j){
		return matriz[i-1][j-1] != 0;
	}
	
	public int getCosto(int i, int j){
		return matriz[i-1][j-1];
	}
}