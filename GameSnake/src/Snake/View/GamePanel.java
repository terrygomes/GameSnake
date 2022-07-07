package Snake.View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import Snake.Model.Snake;

public class GamePanel extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;

	private Snake cobrinha;
	private Timer timer;
	private int velocidade;

	public GamePanel()
	{
		this.cobrinha = new Snake(20 * 5, 20 * 5, 20, 20);
		this.velocidade = 100 / 30;
		this.timer = new Timer(velocidade, this);
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.clearRect(0, 0, 480, 180);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 480, 480);
		getCobrinha().desenhar(g);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}

	public synchronized Snake getCobrinha()
	{
		return cobrinha;
	}

	public void setCobrinha(Snake cobrinha)
	{
		this.cobrinha = cobrinha;
	}

	public Timer getTimer()
	{
		return timer;
	}

	public void setTimer(Timer timer)
	{
		this.timer = timer;
	}

	public int getVelocidade()
	{
		return velocidade;
	}

	public void setVelocidade(int velocidade)
	{
		this.velocidade = velocidade;
	}

}
