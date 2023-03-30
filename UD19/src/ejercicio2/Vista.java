package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField texto;
	private JComboBox comboBox;
	/**
	 * Create the frame.
	 */
	public Vista() {
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeElTitulo = new JLabel("Escribe el titulo de una pelicula");
		lblEscribeElTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscribeElTitulo.setBounds(10, 47, 192, 14);
		contentPane.add(lblEscribeElTitulo);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeliculas.setBounds(272, 47, 79, 14);
		contentPane.add(lblPeliculas);
		
		texto = new JTextField();
		texto.setBounds(23, 99, 179, 20);
		contentPane.add(texto);
		texto.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(evento);
		btnNewButton.setBounds(57, 172, 89, 23);
		contentPane.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setBounds(233, 98, 172, 22);
		contentPane.add(comboBox);
	}
	
	ActionListener evento = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String peliculas = texto.getText();
			comboBox.addItem(peliculas);
			texto.setText("");
		}
	};
}
