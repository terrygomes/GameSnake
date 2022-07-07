package Snake.View;

import Snake.Controle.ControleTelaJogo;

public class TelaJogo extends TelaBase
{
	private static final long serialVersionUID = 1L;

	private GamePanel gamePanel;
	private Statuspanel statusPanel;
	private ControleTelaJogo controle;

	public ControleTelaJogo getControle()
	{
		return controle;
	}

	public void setControle(ControleTelaJogo controle)
	{
		this.controle = controle;
	}

	public TelaJogo()
	{
		super();
		gamePanel = new GamePanel();
		gamePanel.setBounds(0, 0, 480, 480);

		statusPanel = new Statuspanel();
		statusPanel.setBounds(480, 0, 160, 480);

		add(gamePanel);
		add(statusPanel);

//		gamePanel.setBackground(Color.BLACK);
//		statusPanel.setBackground(Color.ORANGE);

		controle = new ControleTelaJogo(this);
		addKeyListener(controle);

		setVisible(true);
		controle.inicializar();
	}

	public GamePanel getGamePanel()
	{
		return gamePanel;
	}

	public void setGamePanel(GamePanel gamePanel)
	{
		this.gamePanel = gamePanel;
	}

	public Statuspanel getStatusPanel()
	{
		return statusPanel;
	}

	public void setStatusPanel(Statuspanel statusPanel)
	{
		this.statusPanel = statusPanel;
	}

}
