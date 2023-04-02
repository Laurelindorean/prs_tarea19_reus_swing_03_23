package ejercicio4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.awt.SystemColor;
import java.awt.Font;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public About(String texto) {
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//En caso de cerrar la ventana no se cerrará la aplicación
		setBounds(100, 100, 450, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea(texto);
		textArea.setFont(new Font("Miriam Mono CLM", Font.BOLD, 14));
		textArea.setBackground(SystemColor.text);
		textArea.setBounds(0, 0, 434, 261);
		contentPane.add(textArea);
	}

}
