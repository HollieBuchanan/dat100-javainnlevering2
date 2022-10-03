package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;
import java.util.Scanner;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for (int n : tabell) {
			System.out.print(n + " ");
		}
		
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
    	System.out.print("[ ");
    	for (int tall : tabell) {
    		System.out.print(tall + ",");
    	}
    	System.out.print(" ]");
    	String print= (" ");
		return print;
		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int n : tabell) {
			sum = sum + n;
		}
    	return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		Scanner inn = new Scanner(System.in);
		String read = inn.nextLine();
		int readNumber = Integer.parseInt(read);
		boolean resault = false;
		for (int n : tabell) {
			if (readNumber == n) {
				resault = true;
			}
		}
		System.out.println(resault);
		return resault;
		// TODO
	}
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		Scanner inn1 = new Scanner(System.in);
		String read1 = inn1.nextLine();
		int readNumber1 = Integer.parseInt(read1);
			
			 if (tabell == null) {
		            return -1;
		        }
			int length = tabell.length;
			int x = 0;
			boolean notThere = false;
			while (x < length) {
				if (tabell[x] == tall) {
					System.out.print("Posisjonen av " + tabell[x] + " er " + (x+1));
					return x;	
				}
				if (x != tall) {
					notThere = true;
				}
				x++;
			}
			if (notThere = true) {
				System.out.print(-1);
			}
			return -1;
			}

	// f)
	public static int[] reverser(int[] tabell) {
		int x = tabell.length;
		int[] substitute = new int [x];
		int z = x;
		for (int i = 0; i < x; i++) {
			substitute[z-1] = tabell[i];
			z = z - 1;
		}
		System.out.println("Tabellen i revers er:");
		 for (int y = 0; y < x; y++) {
	            System.out.print(substitute[y]);
		 }
		 return substitute;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean done = false;
		Arrays.sort(tabell);
		System.out.println("Stigende rekkefølge på arrayen er: ");
		for (int x = 0; x < tabell.length; x++ ) {
			System.out.print(tabell[x] + ",");
		}
		return done;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
			int first = tabell1.length;
			int second = tabell2.length;
			int sammen[] = new int [first+second];
			System.arraycopy(tabell1, 0, sammen, 0, first);
			System.arraycopy(tabell2, 0, sammen, first, second);
			System.out.println(Arrays.toString(sammen));
			return sammen;
	}
}
