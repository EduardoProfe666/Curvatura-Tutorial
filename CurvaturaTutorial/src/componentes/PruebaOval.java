package componentes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

public class PruebaOval extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComponentOval cOval;
	
	public PruebaOval() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cOval = new JComponentOval(0,0,0,60);
		cOval.setBounds(62, 82, 334, 229);
		cOval.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cOval.setBackground(Color.CYAN);
		contentPane.add(cOval);
	}
}
