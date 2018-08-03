package Prim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prim {
	
	private MatrizAdyacencia ma;
	private int nodos;
	
	public Prim(String path) throws FileNotFoundException{
		
			Scanner sc = new Scanner (new File(path));
			this.nodos= sc.nextInt();
			int cantAristas= sc.nextInt();
			ma= new MatrizAdyacencia(nodos,false);
			 
			//CARGO LA MATRIZ CON LOS PESOS	
			 
			 for(int i = 0; i < cantAristas; i++)
			 {
					ma.agregarArist(sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
		sc.close();
	}
	
	public  int grafoPrim(){
		int origen = 0, destino = 0,menorCosto = 0, costo, nodoInicial=(int) (Math.random() * this.nodos);
		ArrayList<Arista> lista = new ArrayList<Arista>();
        ArrayList<Integer> nodosRestantes = new ArrayList<Integer>();
    	ArrayList<Integer> NodosLeidos = new ArrayList<Integer>();
    	//!CUIDADO- NO ARRANCAN DE 0 LOS NODOS
    	NodosLeidos.add(nodoInicial);
    	for(int i = 1; i <= nodos; i++)
			if(i != nodoInicial)
				nodosRestantes.add(i);
		while(nodosRestantes.size() > 0)
		{
			costo = Integer.MAX_VALUE;
			//BUSCO PESO MENOR DE ARISTA
			for(int i = 0; i < NodosLeidos.size(); i++)
			 for(int j = 0; j < nodosRestantes.size(); j++)
			  if(ma.sonAdyacentes(NodosLeidos.get(i), nodosRestantes.get(j)))
				if(ma.getCosto(NodosLeidos.get(i), nodosRestantes.get(j)) < costo)
				{
					origen = NodosLeidos.get(i);
					destino = nodosRestantes.get(j);
					costo = ma.getCosto(NodosLeidos.get(i), nodosRestantes.get(j));
				}
			lista.add(new Arista(origen, destino, ma.getCosto(origen, destino)));		
			NodosLeidos.add(destino);
			nodosRestantes.remove((Integer)destino);
			menorCosto += costo;
		}
		return menorCosto;
	}

}
