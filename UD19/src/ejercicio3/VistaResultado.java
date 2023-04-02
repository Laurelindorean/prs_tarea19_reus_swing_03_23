package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class VistaResultado extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VistaResultado(String texto) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea resultado = new JTextArea(texto);
		resultado.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		resultado.setBounds(0, 0, 534, 211);
		contentPane.add(resultado);
		
	}
}
