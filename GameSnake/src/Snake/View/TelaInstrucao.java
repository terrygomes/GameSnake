package Snake.View;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import Snake.Controle.ControleTelaIntrucao;

public class TelaInstrucao extends TelaBase
{
	private static final long serialVersionUID = 1L;

	private JButton cmd_voltar;
	private ControleTelaIntrucao controle;

	public TelaInstrucao()
	{
		super();
		JLabel lb = new JLabel("Intruções: ");
		lb.setBounds(12, 12, 104, 15);

		JLabel lb2 = new JLabel("Faça a cobrinha comer as sílamas correntes para formar a palavra: ");
		lb2.setBounds(12, 29, 522, 15);

		JLabel lb3 = new JLabel("Movimentar: ");
		lb3.setBounds(12, 112, 93, 15);

		JLabel lb4 = new JLabel("A cobra se movimenta pelas setas: ");
		lb4.setBounds(12, 213, 351, 15);

		JLabel lb5 = new JLabel("");
		lb5.setIcon(new ImageIcon("res/img/setas.png"));
		lb5.setBounds(362, 131, 260, 180);

		cmd_voltar = new JButton("Voltar");
		cmd_voltar.setBounds(483, 366, 127, 25);

		controle = new ControleTelaIntrucao(this);
		cmd_voltar.addActionListener(controle);

		add(lb);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(cmd_voltar);
		setVisible(true);

	}

	public JButton getCmd_voltar()
	{
		return cmd_voltar;
	}

	public void setCmd_voltar(JButton cmd_voltar)
	{
		this.cmd_voltar = cmd_voltar;
	}

}
