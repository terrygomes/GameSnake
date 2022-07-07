package Snake.Controle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Snake.View.TelaJogo;

public class ControleTelaJogo implements KeyListener, Runnable
{
	private TelaJogo tela;

	private boolean cima;
	private boolean baixo;
	private boolean esquerda;
	private boolean direita;

	private volatile boolean pausado;

	private Thread loop;

	public ControleTelaJogo(TelaJogo tela)
	{
		super();
		this.tela = tela;

		cima = false;
		baixo = false;
		esquerda = false;
		direita = true;

		pausado = true;
		loop = new Thread(this);

	}

	public void inicializar()
	{
		pausado = false;
		tela.getGamePanel().getTimer().start();
		loop.start();

	}

	public void atualizar()
	{
		if (cima)
		{

			tela.getGamePanel().getCobrinha().atualizar(Snake.Model.Snake.CIMA);
		}
		else if (baixo)
		{

			tela.getGamePanel().getCobrinha().atualizar(Snake.Model.Snake.BAIXO);
		}
		else if (esquerda)
		{

			tela.getGamePanel().getCobrinha().atualizar(Snake.Model.Snake.ESQUERDA);
		}
		else if (direita)
		{

			tela.getGamePanel().getCobrinha().atualizar(Snake.Model.Snake.DIREITRA);
		}
	}

	@Override
	public void run()
	{
		while (!pausado)
		{
			try
			{
				Thread.sleep(1000 / 5);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			atualizar();
		}

	}

	public void stop()
	{
		pausado = true;
		tela.getGamePanel().getTimer().stop();
	}

	// nesse método KeyPressed é quando preciona uma tecla, em qaunto tiver com a tecla apertada
	// estará funcionando e ao soltar a tecla ira para de funcionar
	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_UP && !baixo)
		{
			cima = true;
			esquerda = false;
			direita = false;
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN && !cima)
		{
			baixo = true;
			esquerda = false;
			direita = false;
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT && !direita)
		{
			esquerda = true;
			baixo = false;
			cima = false;
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT && !esquerda)
		{
			direita = true;
			baixo = false;
			cima = false;
		}

	}

	// Nesse método KeyTyped é uada mais para digitar ou apertar tecla específica
	// como se tivesse digitando normanete.
	@Override
	public void keyTyped(KeyEvent e)
	{
	}

	// nesse método KeyRelased é quando vc preciona a tela e só ira funcionar após soltar a tecla
	@Override
	public void keyReleased(KeyEvent e)
	{
	}

	public TelaJogo getTela()
	{
		return tela;
	}

	public void setTela(TelaJogo tela)
	{
		this.tela = tela;
	}

	public boolean isCima()
	{
		return cima;
	}

	public void setCima(boolean cima)
	{
		this.cima = cima;
	}

	public boolean isBaixo()
	{
		return baixo;
	}

	public void setBaixo(boolean baixo)
	{
		this.baixo = baixo;
	}

	public boolean isEsquerda()
	{
		return esquerda;
	}

	public void setEsquerda(boolean esquerda)
	{
		this.esquerda = esquerda;
	}

	public boolean isDireita()
	{
		return direita;
	}

	public void setDireita(boolean direita)
	{
		this.direita = direita;
	}

	public boolean isPausado()
	{
		return pausado;
	}

	public void setPausado(boolean pausado)
	{
		this.pausado = pausado;
	}

}
