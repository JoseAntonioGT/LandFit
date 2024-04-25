package LandFit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InicioSesion extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private final JLabel lblFondo = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	public InicioSesion() {
		
		
				
		setTitle("Inicio Sesión");
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setDefaultCloseOperation(InicioSesion.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("Elige una opción");
		lblNewLabel_4.setBounds(551, 421, 104, 14);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("Land Fit");
		lblNewLabel.setBounds(551, 158, 104, 41);
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesión");
        btnIniciarSesion.setBounds(538, 364, 133, 23);
        add(btnIniciarSesion);
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] inputPassword = passwordField.getPassword(); 
                String input = new String(inputPassword); 

                if (input.equals("admin")) {
                    Lobby lobby = new Lobby();
                    lobby.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE); 
                   
                    passwordField.setText("");
                }
            }
        });
		passwordField = new JPasswordField();
		passwordField.setBounds(553, 305, 104, 20);
		contentPane.add(passwordField);
		passwordField.setText("admin");
		
		
		textField = new JTextField();
		textField.setBounds(553, 240, 104, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(461, 243, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setBounds(461, 308, 71, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Cambiar Contraseña");
		btnNewButton_1.setBounds(415, 457, 165, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Crear cuenta");
		btnNewButton_2.setBounds(654, 457, 115, 23);
		contentPane.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(372, 152, 481, 332);
		contentPane.add(panel_1);
		
		
		
		lblFondo.setIcon(new
				ImageIcon(InicioSesion.class.getResource("/imagenes/Fondo App.jpg")));
		lblFondo.setBounds(0, 0,1280, 720);
		contentPane.add(lblFondo);
		
		JPanel panel = new JPanel();
		panel.setBounds(362, 157, 494, 323);
		contentPane.add(panel);
		
		
		
		
	}
}