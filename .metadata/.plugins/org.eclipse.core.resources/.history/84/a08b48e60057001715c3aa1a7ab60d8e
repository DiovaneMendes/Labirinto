
package applications;

import java.util.Random;

import javax.swing.JOptionPane;
import com.senac.SimpleJava.Graphics.Canvas;
import com.senac.SimpleJava.Graphics.GraphicApplication;
import com.senac.SimpleJava.Graphics.Point;
import com.senac.SimpleJava.Graphics.Resolution;
import com.senac.SimpleJava.Graphics.events.MouseEvent;
import com.senac.SimpleJava.Graphics.events.MouseObserver;

public class Principal
	extends GraphicApplication // Para aplicacoes graficas com SimpleJava
	implements MouseObserver // Para responder a eventos de mouse na propria applicacao
	{
	private Porta porta;
	private Personagem personagem;
	private Inimigo inimigo;
	private LeituraDeArquivo leitura = new LeituraDeArquivo();
	Sala sala[] = new Sala [32];
	private Random gerador = new Random();
	private int numeroAleatorio = gerador.nextInt(31);
	
	//==============================CLICK====================================
	@Override
	public void notify(MouseEvent event, int button, Point point) {
		if (event == MouseEvent.CLICK){
			//north
			if(sala[numeroAleatorio].north != null && 
				porta.northX+10 > point.x && porta.northX < point.x+1 &&
				porta.northY+2 > point.y && porta.northY < point.y+2){
					numeroAleatorio = sala[numeroAleatorio].clickNorth;
					if(numeroAleatorio==0){
						 JOptionPane.showMessageDialog(null,"PARABENS, VOCE VENCEU O LABIRINTO!");
					}
			}
			//south
			if(sala[numeroAleatorio].south != null && 
				porta.southX+10 > point.x && porta.southX < point.x+1 &&
				porta.southY+2 > point.y && porta.southY < point.y+2){ 
					numeroAleatorio = sala[numeroAleatorio].clickSouth;
					if(numeroAleatorio==0){
						 JOptionPane.showMessageDialog(null,"PARABENS, VOCE VENCEU O LABIRINTO!");
					}
			}
			//east
			if(sala[numeroAleatorio].east != null && 
				porta.eastX+2 > point.x && porta.eastX < point.x+2 &&
				porta.eastY+10 > point.y && porta.eastY < point.y+1){ 
					numeroAleatorio = sala[numeroAleatorio].clickEast;
					if(numeroAleatorio==0){
						 JOptionPane.showMessageDialog(null,"PARABENS, VOCE VENCEU O LABIRINTO!");
					}
			}
			//west
			if(sala[numeroAleatorio].west != null && 
				porta.westX+2 > point.x && porta.westX < point.x+2 &&
				porta.westY+10 > point.y && porta.westY < point.y+1){ 
					numeroAleatorio = sala[numeroAleatorio].clickWest;
					if(numeroAleatorio==0){
						 JOptionPane.showMessageDialog(null,"PARABENS, VOCE VENCEU O LABIRINTO!");
					}
			}
			//up
			if(sala[numeroAleatorio].up != null && 
				porta.upX+10 > point.x && porta.upX < point.x+1 &&
				porta.upY+2 > point.y && porta.upY < point.y+2){
					numeroAleatorio = sala[numeroAleatorio].clickUp;
					if(numeroAleatorio==0){
						 JOptionPane.showMessageDialog(null,"PARABENS, VOCE VENCEU O LABIRINTO!");
					}
			}
			//down
			if(sala[numeroAleatorio].down != null && 
				porta.downX+10 > point.x && porta.downX < point.x+1 &&
				porta.downY+2 > point.y && porta.downY < point.y+2){
					numeroAleatorio = sala[numeroAleatorio].clickDown;
					if(numeroAleatorio==0){
						 JOptionPane.showMessageDialog(null,"PARABENS, VOCE VENCEU O LABIRINTO!");
					}
			}
		}
	}
	//==============================DRAW=====================================
	@Override
	protected void draw(Canvas canvas) {
		canvas.clear();
		
		if(sala[numeroAleatorio].north != null){
			porta.north().draw(canvas);
			inimigo.definePosicao(1);
			
			if(sala[numeroAleatorio].inimigoNorth == 1){
				inimigo.goblin().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoNorth == 2){
				inimigo.orc().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoNorth == 3){
				inimigo.troll().draw(canvas);
			}
		}
		if(sala[numeroAleatorio].south != null){
			porta.south().draw(canvas);
			inimigo.definePosicao(2);
			
			if(sala[numeroAleatorio].inimigoSouth == 1){
				inimigo.goblin().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoSouth == 2){
				inimigo.orc().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoSouth == 3){
				inimigo.troll().draw(canvas);
			}
		}
		if(sala[numeroAleatorio].east != null){
			porta.east().draw(canvas);
			inimigo.definePosicao(3);
			
			if(sala[numeroAleatorio].inimigoEast == 1){
				inimigo.goblin().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoEast == 2){
				inimigo.orc().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoEast == 3){
				inimigo.troll().draw(canvas);
			}
		}
		if(sala[numeroAleatorio].west != null){
			porta.west().draw(canvas);
			inimigo.definePosicao(4);
			
			if(sala[numeroAleatorio].inimigoWest == 1){
				inimigo.goblin().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoWest == 2){
				inimigo.orc().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoWest == 3){
				inimigo.troll().draw(canvas);
			}
		}
		if(sala[numeroAleatorio].up != null){
			porta.up().draw(canvas);
			inimigo.definePosicao(5);
			
			if(sala[numeroAleatorio].inimigoUp == 1){
				inimigo.goblin().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoUp == 2){
				inimigo.orc().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoUp == 3){
				inimigo.troll().draw(canvas);
			}
		}
		if(sala[numeroAleatorio].down != null){
			porta.down().draw(canvas);
			inimigo.definePosicao(6);
			
			if(sala[numeroAleatorio].inimigoDown == 1){
				inimigo.goblin().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoDown == 2){
				inimigo.orc().draw(canvas);
			}
			else if(sala[numeroAleatorio].inimigoDown == 3){
				inimigo.troll().draw(canvas);
			}
		}
		
		personagem.criandoGuerreiro().draw(canvas);
	}
	
	//==============================LOOP=====================================
	@Override
	protected void loop() {
		redraw();
	}
	
	//==============================SETUP====================================
	@Override
	protected void setup(){
		definindoSala();
		porta = new Porta();
		personagem = new Personagem();
		inimigo = new Inimigo();
		
		// ajusta o numero maximo de vezes por segundo que "loop()" sera executado
		setFramesPerSecond(60);
		// ajusta a resolucao
		setResolution(Resolution.LOWRES);
		
		addMouseObserver(MouseEvent.CLICK, this);
		
	}
	
	//==============================SALAS====================================
	public void definindoSala(){
		leitura.lendoArquivo();
		for(int i=0; i<32; i++){
			sala[i] = leitura.sala[i];
		}
	}
}

