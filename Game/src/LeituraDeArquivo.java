
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.senac.SimpleJava.Console;

public class LeituraDeArquivo {
	
	//Aponta o caminho do arquivo
	private File texto = new File("coordenadas.txt");
	
	private String sala[] = new String[31];
	public Scanner ler;
	private String lendo;
	private int i = 0;
	
	public void run() throws FileNotFoundException {
		
		ler = new Scanner(texto);
		lendo  = ler.next();
		
		//Trata de um erro, no caso do metodo que colhe os dados do arquivo
		try {
			LerTexto(ler, lendo, sala, i);
		} catch (NoSuchElementException e) {
			Console.println("");
		}
	}

	
	private void LerTexto(Scanner ler, String lendo, String sala[], int i) {
		while (ler.hasNext()) {

			if (lendo.equals("room")) {
				if (i <= sala.length) {
					i = i+i;
				}
				lendo = ler.next();
				sala[i] = ("Sala: " + lendo);
				Console.println(sala[i]);
				lendo = ler.next();
			}
			
			
			if (lendo.equals("south")) {
				lendo = ler.next();
				Console.println("South " + lendo);
				lendo = ler.next();
			} else if (lendo.equals("north")) {
				lendo = ler.next();
				Console.println("North " + lendo);
				lendo = ler.next();
			} else if (lendo.equals("east")) {
				lendo = ler.next();
				Console.println("East " + lendo);
				lendo = ler.next();
			} else if (lendo.equals("west")) {
				lendo = ler.next();
				Console.println("West " + lendo);
				lendo = ler.next();
			} else if (lendo.equals("up")) {
				lendo = ler.next();
				Console.println("Up " + lendo);
				lendo = ler.next();
			} else if (lendo.equals("down")) {
				lendo = ler.next();
				Console.println("Down " + lendo);
				lendo = ler.next();
			}
		}

	}

}