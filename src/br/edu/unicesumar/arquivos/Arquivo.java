package br.edu.unicesumar.arquivos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Arquivo {

	public static void main(String[] args) {
		//inputOutputJava7();
		lerLambda();
	}
	
	private static void inputOutputJava7() {
		try {
			InputStreamReader reader = new FileReader("comandos.txt");
			BufferedReader bufferReader = new BufferedReader(reader);

			try (BufferedWriter bw = new BufferedWriter(new FileWriter("comandosa1.txt"))) {
				String linha = bufferReader.readLine();
				while (linha != null) {
					System.out.println("Comando: " + linha);
					bw.write(linha);
					bw.newLine();
					linha = bufferReader.readLine();
				}
			} finally {
				reader.close();
			}
		} catch (IOException ex) {
			System.out.println("Erro: " + ex);
		}

	}

	private static void lerLambda(){
		List<String> comandos = Arrays.asList("cima", "baixo", "direita", "esquerda");
		//comandos.forEach(new ImprimeTexto());
		//comandos.forEach((String s) -> System.out.println(s));
		//comandos.forEach(s -> System.out.println(s));
		//comandos.forEach(System.out::println);
		
		//List<String> lista = comandos.stream().filter(s -> !s.equals("cima")).sorted().collect(Collectors.toList());
		//lista.forEach(System.out::println);
	}

	private static void inputOutputJava6() {
		List<String> comandos = Arrays.asList("cima", "baixo", "direita", "esquerda");
		serializarObjeto(comandos);
		deserializar();
	}

	private static void deserializar() {
		try {
			// use buffering
			InputStream file = new FileInputStream("comandos.txt");
			InputStream buffer = new BufferedInputStream(file);
			ObjectInput input = new ObjectInputStream(buffer);
			try {
				List<String> lista = (List<String>) input.readObject();
				for (String comando : lista) {
					System.out.println("Comando: " + comando);
				}
			} finally {
				input.close();
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Erro: " +  ex);
		} catch (IOException ex) {
			System.out.println("Erro: " +  ex);
		}
	}

	private static void serializarObjeto(List<String> comandos) {
		try {
			OutputStream file = new FileOutputStream("comandos.txt");
			OutputStream buffer = new BufferedOutputStream(file);
			ObjectOutput output = new ObjectOutputStream(buffer);
			try {
				output.writeObject(comandos);
			} finally {
				output.close();
			}
		} catch (IOException ex) {
			System.out.println("Erro: " +  ex);
		}
	}

}

