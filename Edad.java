package LandFit;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JButton;

public class Edad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edad frame = new Edad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Edad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECCIONA TU EDAD");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 31));
		lblNewLabel.setBounds(440, 36, 352, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("16-25");
		btnNewButton.setBounds(156, 161, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("26-35");
		btnNewButton_1.setBounds(577, 161, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">36");
		btnNewButton_2.setBounds(1051, 161, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new
				ImageIcon(InicioSesion.class.getResource("/imagenes/Edad.jpg")));
		lblFondo.setBounds(0, 0,1280, 720);
		getContentPane().add(lblFondo);
		
	}
}
