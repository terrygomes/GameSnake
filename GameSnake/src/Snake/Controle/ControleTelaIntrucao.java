package Snake.Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Snake.View.TelaInstrucao;

public class ControleTelaIntrucao implements ActionListener
{
	private TelaInstrucao tela;

	public ControleTelaIntrucao(TelaInstrucao tela)
	{
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		ControleTelaMenu.mostrarTelaMenu();
		tela.dispose();

	}

}
