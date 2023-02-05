/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JFrame frame;
	private JTextField numero1;
	private JTextField numero2;
	
	public Calculadora() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 200, 135);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblNumero = new JLabel("Número 1:");
		GridBagConstraints gbc_lblNumero = new GridBagConstraints();
		gbc_lblNumero.anchor = GridBagConstraints.EAST;
		gbc_lblNumero.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero.gridx = 1;
		gbc_lblNumero.gridy = 1;
		panel.add(lblNumero, gbc_lblNumero);

		numero1 = new JTextField();
		GridBagConstraints gbc_numero1 = new GridBagConstraints();
		gbc_numero1.insets = new Insets(0, 0, 5, 0);
		gbc_numero1.fill = GridBagConstraints.HORIZONTAL;
		gbc_numero1.gridx = 2;
		gbc_numero1.gridy = 1;
		panel.add(numero1, gbc_numero1);
		numero1.setColumns(10);

		JLabel lblNumero_1 = new JLabel("Número 2:");
		GridBagConstraints gbc_lblNumero_1 = new GridBagConstraints();
		gbc_lblNumero_1.anchor = GridBagConstraints.EAST;
		gbc_lblNumero_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero_1.gridx = 1;
		gbc_lblNumero_1.gridy = 2;
		panel.add(lblNumero_1, gbc_lblNumero_1);

		numero2 = new JTextField();
		GridBagConstraints gbc_numero2 = new GridBagConstraints();
		gbc_numero2.insets = new Insets(0, 0, 5, 0);
		gbc_numero2.fill = GridBagConstraints.HORIZONTAL;
		gbc_numero2.gridx = 2;
		gbc_numero2.gridy = 2;
		panel.add(numero2, gbc_numero2);
		numero2.setColumns(10);

		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(numero1.getText());
					int num2 = Integer.parseInt(numero2.getText());
					
					// Validação dos valores
					if (num1 < 0 || num2 < 0) {
						throw new NumberFormatException();
					}
					
					int resultado = num1 + num2;
					
					JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Erro! Os valores informados não são válidos!");
				}
			}
		});
		GridBagConstraints gbc_btnSomar = new GridBagConstraints();
		gbc_btnSomar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSomar.gridx = 1;
		gbc_btnSomar.gridy = 4;
		panel.add(btnSomar, gbc_btnSomar);

		JButton btnSubtrair = new JButton("Subtrair");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(numero1.getText());
					int num2 = Integer.parseInt(numero2.getText());
					
					// Validação dos valores
					if (num1 < 0 || num2 < 0) {
						throw new NumberFormatException();
					}
					
					int resultado = num1 - num2;
					
					JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Erro! Os valores informados não são válidos!");
				}
			}
		});
		GridBagConstraints gbc_btnSubtrair = new GridBagConstraints();
		gbc_btnSubtrair.gridx = 2;
		gbc_btnSubtrair.gridy = 4;
		panel.add(btnSubtrair, gbc_btnSubtrair);
                
                
                JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(numero1.getText());
					int num2 = Integer.parseInt(numero2.getText());
					
					// Validação dos valores
					if (num1 < 0 || num2 < 0) {
						throw new NumberFormatException();
					}
					
					int resultado = num1 * num2;
					
					JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Erro! Os valores informados não são válidos!");
				}
			}
		});
		GridBagConstraints gbc_btnMultiplicar = new GridBagConstraints();
		gbc_btnMultiplicar.insets = new Insets(0, 0, 0, 4);
		gbc_btnMultiplicar.gridx = 1;
		gbc_btnMultiplicar.gridy = 5;
		panel.add(btnMultiplicar, gbc_btnMultiplicar);
                
                
                JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(numero1.getText());
					int num2 = Integer.parseInt(numero2.getText());
					
					// Validação dos valores
					if (num1 < 0 || num2 <= 0) {
						throw new NumberFormatException();
					}
					
					int resultado = num1 / num2;
					
					JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Erro! Os valores informados não são válidos!");
				}
			}
		});
		GridBagConstraints gbc_btnDividir = new GridBagConstraints();
		gbc_btnDividir.gridx = 2;
		gbc_btnDividir.gridy = 5;
		panel.add(btnDividir, gbc_btnDividir);
	}
        
        

}