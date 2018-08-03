package Prim;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Prim p1 = new Prim ("prim.in");
		int costo = p1.grafoPrim();
		System.out.println(costo);
		

	}

}
