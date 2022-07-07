package Snake.Model;

import java.awt.Graphics;
import java.util.ArrayList;

public class Snake
{
	public static final int CIMA = 1;
	public static final int BAIXO = 2;
	public static final int ESQUERDA = 3;
	public static final int DIREITRA = 4;

	private ArrayList<Elemento> snake;

	public Snake(int x, int y, int largura, int altura)
	{
		this.snake = new ArrayList<>();
		CorpoSnake cabeca = new CorpoSnake(x, y, largura, altura);
		CorpoSnake corpo = new CorpoSnake(x, y, largura, altura);
		CorpoSnake rabo = new CorpoSnake(x, y, largura, altura);
		this.snake.add(cabeca);
		this.snake.add(corpo);
		this.snake.add(rabo);

	}

	public void adicionarCorpo()
	{
		CorpoSnake corpo = (CorpoSnake) this.snake.get(this.snake.size() - 1);
		int x = corpo.getX();
		int y = corpo.getY();
		int largura = corpo.getLargura();
		int altura = corpo.getAltura();

		this.snake.add(new CorpoSnake(x, y, largura, altura));

	}

	public void desenhar(Graphics g)
	{
		for (Elemento e : snake)
		{
			e.desenhar(g);
		}

	}

	public void atualizar(int direcao)
	{
		for (int i = this.snake.size() - 1; i > 0; i--)
		{
			this.snake.get(i).mover(this.snake.get(i-1).getX(), this.snake.get(i-1).getY());
		}

		switch (direcao)
		{
			case CIMA:
			{
				this.snake.get(0).setY(this.snake.get(0).getY() - this.snake.get(0).getAltura());
				break;
			}
			case BAIXO:
			{
				this.snake.get(0).setY(this.snake.get(0).getY() + this.snake.get(0).getAltura());
				break;
			}
			case ESQUERDA:
			{
				this.snake.get(0).setX(this.snake.get(0).getX() - this.snake.get(0).getLargura());
				break;
			}

			case DIREITRA:
			{
				this.snake.get(0).setX(this.snake.get(0).getX() + this.snake.get(0).getLargura());
				break;
			}
		}

	}

}
