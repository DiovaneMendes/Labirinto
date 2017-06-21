package applications;


import com.senac.SimpleJava.Graphics.Color;
import com.senac.SimpleJava.Graphics.Resolution;
import com.senac.SimpleJava.Graphics.Sprite;

public class Personagem{
	Sprite guerreiro;
	int personagemX = Resolution.MSX.width/7-2, personagemY = Resolution.MSX.height-157;

	public Personagem(){
		
	}
	
	public Sprite criandoGuerreiro(){
		guerreiro = new Sprite(5, 5, Color.BLACK);
		guerreiro.setPosition(personagemX, personagemY);
		return guerreiro;
	}
}
