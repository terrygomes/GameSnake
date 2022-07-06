package Snake.View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TelaBase extends JFrame
{
	private static final long serialVersionUID = 1L;

	public TelaBase()
	{
		setTitle("Tela Principal");
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setIconImage(new ImageIcon("res/img/icon.png").getImage());
		;

	}

}
