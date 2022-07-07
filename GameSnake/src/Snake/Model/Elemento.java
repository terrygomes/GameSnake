package Snake.Model;

import java.awt.Graphics;

public abstract class Elemento
{
	private int x;
	private int y;
	private int largura;
	private int altura;

	public Elemento(int x, int y, int largura, int altura)
	{
		super();
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}

	public abstract void desenhar(Graphics g);

	public void mover(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public int getLargura()
	{
		return largura;
	}

	public void setLatgura(int largura)
	{
		this.largura = largura;
	}

	public int getAltura()
	{
		return altura;
	}

	public void setAltura(int altura)
	{
		this.altura = altura;
	}

}
