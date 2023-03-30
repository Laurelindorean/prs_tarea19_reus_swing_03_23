package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setTitle("Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));

		JRadioButton botonWindows = new JRadioButton("Windows");
		buttonGroup.add(botonWindows);

		JRadioButton botonLinux = new JRadioButton("Linux");
		buttonGroup.add(botonLinux);

		JRadioButton botonMac = new JRadioButton("Mac");
		buttonGroup.add(botonMac);

		JSeparator separator = new JSeparator();

		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));

		JCheckBox checkProgram = new JCheckBox("Programación");

		JCheckBox checkDesign = new JCheckBox("Diseño gráfico");

		JCheckBox checkAdmin = new JCheckBox("Administración");

		JSeparator separator_1 = new JSeparator();

		JLabel lblNewLabel_2 = new JLabel("Horas que dedicas en el ordenador");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));

		JSlider slider = new JSlider();

		slider.setToolTipText("");
		slider.setMaximum(10);

		JButton btnNewButton = new JButton("Generar");
		btnNewButton.addActionListener(evento);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGap(22)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(botonMac)
										.addComponent(botonLinux).addComponent(botonWindows).addComponent(lblNewLabel,
												GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.LEADING,
								gl_contentPane.createSequentialGroup().addGap(23)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(checkProgram)
												.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 175,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(checkDesign).addComponent(checkAdmin))))
				.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(separator_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 283,
												Short.MAX_VALUE)
										.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 283,
												Short.MAX_VALUE))
								.addGap(24))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(10)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 251,
										GroupLayout.PREFERRED_SIZE)
								.addGap(33))))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(34)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(82, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(86).addComponent(btnNewButton)
						.addContainerGap(129, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(25)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(botonWindows)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(botonLinux)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(botonMac).addGap(18)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(lblNewLabel_1).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(checkProgram)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(checkDesign)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(checkAdmin).addGap(18)
				.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblNewLabel_2).addGap(34)
				.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18).addComponent(btnNewButton).addContainerGap(23, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);

	}

	ActionListener evento = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

		}
	};
	private final ButtonGroup buttonGroup = new ButtonGroup();

}
