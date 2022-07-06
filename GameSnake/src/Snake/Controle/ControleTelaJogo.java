package Snake.Controle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Snake.View.TelaJogo;

public class ControleTelaJogo implements KeyListener
{
	private TelaJogo tela;

	public ControleTelaJogo(TelaJogo tela)
	{
		super();
		this.tela = tela;
	}

	// nesse método KeyPressed é quando preciona uma tecla, em qaunto tiver com a tecla apertada
	// estará funcionando e ao soltar a tecla ira para de funcionar
	@Override
	public void keyPressed(KeyEvent e)
	{

	}

	// Nesse método KeyTyped é uada mais para digitar ou apertar tecla específica
	// como se tivesse digitando normanete.
	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

	// nesse método KeyRelased é quando vc preciona a tela e só ira funcionar após soltar a tecla
	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

}
