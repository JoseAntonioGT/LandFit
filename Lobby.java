package LandFit;

import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Lobby extends javax.swing.JFrame {

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lobby frame = new Lobby();
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
	public Lobby() {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(InicioSesion.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		
		JLabel lblNewLabel = new JLabel("¿CUAL ES TU ESTADO ACTUAL?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel.setBounds(372, 27, 521, 42);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Bajo mi Peso");
        btnNewButton.setBounds(103, 170, 113, 23);
        getContentPane().add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Edad edad = new Edad();
                edad.setVisible(true);
                dispose(); 
            }
        });
		
		JButton btnNewButton_1 = new JButton("En forma");
		btnNewButton_1.setBounds(598, 170, 89, 23);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		        Edad Edad = new Edad(); 
		        Edad.setVisible(true);
		        dispose(); 
		       
		    }
		});
		
		JButton btnNewButton_2 = new JButton("Sobrepeso");
		btnNewButton_2.setBounds(1076, 170, 113, 23);
		getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		        Edad Edad = new Edad(); 
		        Edad.setVisible(true);
		        dispose(); 
		    }
		});
		
		JLabel lblFondo = new JLabel();
		lblFondo.setIcon(new
				ImageIcon(InicioSesion.class.getResource("/imagenes/Lobby.jpg")));
		lblFondo.setBounds(0, 0,1280, 720);
		getContentPane().add(lblFondo);
	}
}
