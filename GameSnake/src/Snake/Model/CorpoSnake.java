package Snake.Model;

import java.awt.Color;
import java.awt.Graphics;

public class CorpoSnake extends Elemento
{

	public CorpoSnake(int x, int y, int largura, int altura)
	{
		super(x, y, largura, altura);
	}

	public void desenhar(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.fillRect(this.getX(), this.getY(), this.getLargura(), this.getAltura());
	}

}
