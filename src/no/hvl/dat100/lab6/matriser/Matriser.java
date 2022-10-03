package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int x = 0; x < matrise.length; x++) {
			for (int y = 0; y < matrise [x].length; y++) {
				System.out.print(matrise[x][y] + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		System.out.print("{");
		for (int x = 0; x < matrise.length-1; x++) {
			System.out.print("{ ");
			for (int y = 0; y < matrise [x].length; y++) {
				String result = (matrise[x][y] + " ");
				System.out.print(result);
			}
			System.out.print("}" + "\n");
		}
		for (int x = matrise.length-1; x < matrise.length; x++) {
			System.out.print("{ ");
			for (int y = 0; y < matrise [x].length; y++) {
				String result = (matrise[x][y] + " ");
				System.out.print(result);
			}
			System.out.print("}}");
		}
		return null;	
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		System.out.print("{");
		int [][] multiplisert = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		for (int x = 0; x < matrise.length-1; x++) {
			System.out.print("{ ");
			for (int y = 0; y < matrise [x].length; y++) {
				multiplisert [x][y] = matrise[x][y]*tall;
				System.out.print(multiplisert [x][y] + " ");
			}
			System.out.print("}" + "\n");
		}
		for (int x = matrise.length-1; x < matrise.length; x++) {
			System.out.print("{ ");
			for (int y = 0; y < matrise [x].length; y++) {
				multiplisert [x][y] = matrise[x][y]*tall;
				System.out.print(multiplisert [x][y] + " ");
			}
			System.out.print("}}");
		}
		return multiplisert;
	
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		boolean same = true;
		int rekke1 = mat1.length;
		int rekke2 = mat2.length;
		int rad1 = mat1[0].length;
		int rad2 = mat2[0].length;
		if(rekke1 != rekke2 || rad1 != rad2) {
			same = false;
		}
		else {
		for (int x = 0; x < mat1.length; x++) {
				for (int y = 0; y < mat1[x].length; y++) {
					if (mat1[x][y] != mat2[x][y]) {
						same = false;
					}
				}
			}
		}
		if (same = false) {
			System.out.println("Matrisene er ikke lik.");
		}
		else {
			System.out.println("Matrisene er lik.");
		}
		return same;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
