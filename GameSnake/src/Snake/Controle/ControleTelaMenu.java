package Snake.Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Snake.View.TelaInstrucao;
import Snake.View.TelaJogo;
import Snake.View.TelaMenu;

public class ControleTelaMenu implements ActionListener
{
	private static TelaMenu tela;

	public ControleTelaMenu(TelaMenu tela)
	{
		ControleTelaMenu.tela = tela;
	}

	public static void mostrarTelaMenu()
	{
		tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource() == tela.getCmd_novoJogo())
		{
			new TelaJogo();
			tela.setVisible(false);
		}
		else if (e.getSource() == tela.getCmd_instrucoes())
		{
			new TelaInstrucao();
			tela.setVisible(false);
		}
		else if (e.getSource() == tela.getCmd_sair())
		{
			System.exit(0);
		}
	}
}
