/**
 * 
 */
package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField texto;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setTitle("Saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(94, 55, 215, 14);
		contentPane.add(lblNewLabel);

		texto = new JTextField();
		texto.setBounds(81, 98, 245, 20);
		contentPane.add(texto);
		texto.setColumns(10);

		JButton btnNewButton = new JButton("¡Saludar!");
		btnNewButton.addActionListener(evento);
		btnNewButton.setBounds(158, 149, 89, 23);
		contentPane.add(btnNewButton);
		//Hacemos el frame visible
		setVisible(true);
	}

	ActionListener evento = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "¡Hola " + texto.getText() + "!");
		}
	};

}