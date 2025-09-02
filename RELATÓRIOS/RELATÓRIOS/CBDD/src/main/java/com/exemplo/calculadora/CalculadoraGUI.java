package com.exemplo.calculadora;
import javax.swing.*;
public class CalculadoraGUI {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(300, 250); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JTextField txtA = new JTextField(); txtA.setBounds(50, 20, 80, 25); frame.add(txtA);
        JTextField txtB = new JTextField(); txtB.setBounds(150, 20, 80, 25); frame.add(txtB);
        JButton btnSomar = new JButton("+"); btnSomar.setBounds(50, 60, 50, 25); frame.add(btnSomar);
        JButton btnDividir = new JButton("/"); btnDividir.setBounds(120, 60, 50, 25); frame.add(btnDividir);
        JLabel lblResultado = new JLabel("Resultado: "); lblResultado.setBounds(50, 100, 200, 25); frame.add(lblResultado);
        btnSomar.addActionListener(e -> { lblResultado.setText("Resultado: " + calc.somar(Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText()))); });
        btnDividir.addActionListener(e -> { try { lblResultado.setText("Resultado: " + calc.dividir(Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText()))); } catch(Exception ex) { lblResultado.setText("Erro: " + ex.getMessage()); } });
        frame.setVisible(true);
    }
}