
package br.edu.unicesumar.arquivos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Colecoes {
	private static void performanceHashSet() {
		System.out.println("Iniciando Hashset...");
        Collection<Integer> teste = new HashSet<Integer>();
        percorrer(teste);

	}

	private static void performanceLinkedSet() {
		System.out.println("Iniciando LinkedHashSet...");
        Collection<Integer> teste = new LinkedHashSet<Integer>();
        percorrer(teste);

	}

	private static void performanceList() {
		System.out.println("Iniciando List...");
        Collection<Integer> teste = new ArrayList<Integer>();
        percorrer(teste);
	}

	private static void performanceLinkedList() {
		System.out.println("Iniciando LinkedList...");
        Collection<Integer> teste = new LinkedList<Integer>();
        percorrer(teste);
	}

	private static void percorrer(Collection<Integer> teste) {
		long inicio = System.currentTimeMillis();

        int total = 30000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
	}
	
	public static void main(String[] args) {
		performanceHashSet();
		performanceLinkedSet();
		
		performanceLinkedList();
		performanceList();
	}

}
