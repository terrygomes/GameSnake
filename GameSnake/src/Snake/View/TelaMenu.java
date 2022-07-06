package Snake.View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import Snake.Controle.ControleTelaMenu;

public class TelaMenu extends TelaBase
{
	private static final long serialVersionUID = 1L;

	private JButton cmd_novoJogo;
	private JButton cmd_instrucoes;
	private JButton cmd_sair;

	private ControleTelaMenu controle;

	public TelaMenu()
	{
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		cmd_novoJogo = new JButton("Novo Jogo");
		cmd_instrucoes = new JButton("Instrução");
		cmd_sair = new JButton("Sair");

		add(cmd_novoJogo);
		add(cmd_instrucoes);
		add(cmd_sair);
		
		controle = new ControleTelaMenu(this);
		cmd_novoJogo.addActionListener(controle);
		cmd_instrucoes.addActionListener(controle);
		cmd_sair.addActionListener(controle);

		setVisible(true);

	}

	public JButton getCmd_novoJogo()
	{
		return cmd_novoJogo;
	}

	public void setCmd_novoJogo(JButton cmd_novoJogo)
	{
		this.cmd_novoJogo = cmd_novoJogo;
	}

	public JButton getCmd_instrucoes()
	{
		return cmd_instrucoes;
	}

	public void setCmd_instrucoes(JButton cmd_instrucoes)
	{
		this.cmd_instrucoes = cmd_instrucoes;
	}

	public JButton getCmd_sair()
	{
		return cmd_sair;
	}

	public void setCmd_sair(JButton cmd_sair)
	{
		this.cmd_sair = cmd_sair;
	}

}
