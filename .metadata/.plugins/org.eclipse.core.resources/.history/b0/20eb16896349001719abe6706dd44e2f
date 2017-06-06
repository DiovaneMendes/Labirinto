package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Random;

public class Sala {
	public String modeloSala[] = new String [31];
	private Porta porta = new Porta();
	private Random gerador = new Random();
	
	public Sala(){
		
	}
	
	//Leitura de arquivo txt
	public void lendo() throws FileNotFoundException{
			
		//Chama o arquivo txt
		FileReader texto = new FileReader("coordenadas.txt");
		
		//Scanner para ler o arquivo acima e "useDelimiter" 
		//para saber onde o texto deve ter quebra de linha
		Scanner ler = new Scanner(texto).useDelimiter("\n");
		
		//"hasNext" para ler linha por linha
		int i=0;
		while (ler.hasNext()) {
			String nome = ler.next();
			modeloSala[i] = nome;
			i++;
		}
	}
	
	//Criando as salas do jogo
	public void criandoSala(){
		for (int i=0; i<=31; i++){
			if(modeloSala[i].toLowerCase().contains("room 1".toLowerCase())){
				porta.south();
				porta.east();
			}
			else if(modeloSala[i].toLowerCase().contains("room 2".toLowerCase())){
				porta.east();
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 3".toLowerCase())){
				porta.south();
				porta.east();
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 4".toLowerCase())){
				porta.south();
				porta.east();
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 5".toLowerCase())){
				porta.south();
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 6".toLowerCase())){
				porta.north();
				porta.south();
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 7".toLowerCase())){
				porta.north();
				porta.east();
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 8".toLowerCase())){
				porta.north();
				porta.south();
				porta.east();
				porta.up();
			}
			else if(modeloSala[i].toLowerCase().contains("room 9".toLowerCase())){
				porta.north();
				porta.south();
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 10".toLowerCase())){
				porta.north();
				porta.south();
				porta.east();
			}
			else if(modeloSala[i].toLowerCase().contains("room 11".toLowerCase())){
				porta.east();
				porta.west();
				porta.up();
			}
			else if(modeloSala[i].toLowerCase().contains("room 12".toLowerCase())){
				porta.west();
				porta.north();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 13".toLowerCase())){
				porta.north();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 14".toLowerCase())){
				porta.north();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 15".toLowerCase())){
				porta.east();
				porta.west();
				porta.up();
				porta.north();
			}
			else if(modeloSala[i].toLowerCase().contains("room 16".toLowerCase())){
				porta.east();
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 17".toLowerCase())){
				porta.west();
				porta.north();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 18".toLowerCase())){
				porta.east();
				porta.west();
				porta.up();
				porta.north();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 19".toLowerCase())){
				porta.east();
				porta.west();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 20".toLowerCase())){
				porta.east();
			}
			else if(modeloSala[i].toLowerCase().contains("room 21".toLowerCase())){
				porta.east();
			}
			else if(modeloSala[i].toLowerCase().contains("room 22".toLowerCase())){
				porta.east();
				porta.west();
				porta.down();
				porta.north();
			}
			else if(modeloSala[i].toLowerCase().contains("room 23".toLowerCase())){
				porta.east();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 24".toLowerCase())){
				porta.west();
				porta.down();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 25".toLowerCase())){
				porta.east();
				porta.down();
				porta.north();
			}
			else if(modeloSala[i].toLowerCase().contains("room 26".toLowerCase())){
				porta.west();
				porta.north();
			}
			else if(modeloSala[i].toLowerCase().contains("room 27".toLowerCase())){
				porta.east();
			}
			else if(modeloSala[i].toLowerCase().contains("room 28".toLowerCase())){
				porta.east();
				porta.west();
				porta.down();
				porta.north();
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 29".toLowerCase())){
				porta.west();
			}
			else if(modeloSala[i].toLowerCase().contains("room 30".toLowerCase())){
				porta.south();
			}
			else if(modeloSala[i].toLowerCase().contains("room 31".toLowerCase())){
				porta.north();
			}
		}
	}
}
