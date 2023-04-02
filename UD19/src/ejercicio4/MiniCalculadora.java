package ejercicio4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniCalculadora extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;
	private JButton botonSumar, botonRestar, botonMultiplicar, botonDividir, botonSalir, botonAbout;
	private JLabel lblresultado;

	/**
	 * Create the frame.
	 */
	public MiniCalculadora() {
		setTitle("Mini Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		numero1 = new JTextField();
		numero1.setHorizontalAlignment(SwingConstants.CENTER);
		numero1.setBounds(39, 67, 86, 20);
		contentPane.add(numero1);
		numero1.setColumns(10);

		numero2 = new JTextField();
		numero2.setHorizontalAlignment(SwingConstants.CENTER);
		numero2.setBounds(278, 67, 86, 20);
		contentPane.add(numero2);
		numero2.setColumns(10);

		resultado = new JTextField();
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(158, 118, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);

		JLabel lblTitulo = new JLabel("Mini Calculadora");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(121, 11, 164, 30);
		contentPane.add(lblTitulo);

		JLabel lblnum1 = new JLabel("Primer Numero");
		lblnum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum1.setBounds(24, 52, 119, 14);
		contentPane.add(lblnum1);

		JLabel lblnum2 = new JLabel("Segundo Numero");
		lblnum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum2.setBounds(269, 52, 108, 14);
		contentPane.add(lblnum2);

		lblresultado = new JLabel("Resultado");
		lblresultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblresultado.setBounds(167, 101, 63, 14);
		contentPane.add(lblresultado);

		botonSumar = new JButton("Sumar");
		botonSumar.setBounds(70, 195, 86, 51);
		contentPane.add(botonSumar);
		botonSumar.addActionListener(this);

		botonRestar = new JButton("Restar");
		botonRestar.setBounds(252, 195, 86, 51);
		contentPane.add(botonRestar);
		botonRestar.addActionListener(this);

		botonMultiplicar = new JButton("Multiplicar");
		botonMultiplicar.setBounds(70, 283, 89, 51);
		contentPane.add(botonMultiplicar);
		botonMultiplicar.addActionListener(this);

		botonDividir = new JButton("Dividir");
		botonDividir.setBounds(252, 283, 89, 51);
		contentPane.add(botonDividir);
		botonDividir.addActionListener(this);

		botonSalir = new JButton("Salir");
		botonSalir.setBounds(105, 384, 89, 23);
		contentPane.add(botonSalir);
		botonSalir.addActionListener(this);

		botonAbout = new JButton("About");
		botonAbout.setBounds(223, 384, 89, 23);
		contentPane.add(botonAbout);
		botonAbout.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Si apretamos al boton salir, la aplicación se cierra
		if (e.getSource() == botonSalir) {
			System.exit(0);
		} else if (e.getSource() == botonAbout) {
			String textoAbout = "\n\n\n    Esta calculadora ha sido realizada " + "\n    por la estudiante "
					+ "Palmira Romia Segura." + "\n    Para la tarea 19 dedicada a Swing/AWT del "
					+ "\n    Bootcamp de Java de la Fundacio " + "\n    Esplai de Reus.";
			About abouttxt = new About(textoAbout);
			abouttxt.setVisible(true);

		} else {
			String operando1 = numero1.getText();
			String operando2 = numero2.getText();
			//Controlamos que antes de escoger operacion hayan numeros marcados
			if (!operando1.isEmpty() && !operando2.isEmpty()) {
				int num1 = Integer.parseInt(operando1);
				int num2 = Integer.parseInt(operando2);

				// Calculamos todas las posibilidades de operaciones
				if (e.getSource() == botonSumar) {
					int result = num1 + num2;
					resultado.setText(String.valueOf(result));
				}
				if (e.getSource() == botonRestar) {
					int result = num1 - num2;
					resultado.setText(String.valueOf(result));
				}
				if (e.getSource() == botonMultiplicar) {
					int result = num1 * num2;
					resultado.setText(String.valueOf(result));
				}
				if (e.getSource() == botonDividir) {
					int result = num1 / num2;
					resultado.setText(String.valueOf(result));
				}
			}else {
				JOptionPane.showMessageDialog(null, "Primero debes introducir los numeros");
			}

		}
	}
}
