package com.exemplo.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculadoraUI extends JFrame {
    private final JTextField campoA = new JTextField(5);
    private final JTextField campoB = new JTextField(5);
    private final JLabel resultado = new JLabel("Resultado: ");
    private final Calculadora calculadora = new Calculadora();
    public CalculadoraUI() {
        super("Calculadora Maven");
        setLayout(new FlowLayout());
        add(new JLabel("Valor A:"));
        add(campoA);
        add(new JLabel("Valor B:"));
        add(campoB);
        JButton somarBtn = new JButton("Somar");
        somarBtn.addActionListener(this::somar);
        add(somarBtn);
        JButton subtrairBtn = new JButton("Subtrair");
        subtrairBtn.addActionListener(this::subtrair);
        add(subtrairBtn);
        JButton multiplicarBtn = new JButton("Multiplicar");
        multiplicarBtn.addActionListener(this::multiplicar);
        add(multiplicarBtn);
        JButton dividirBtn = new JButton("Dividir");
        dividirBtn.addActionListener(this::dividir);
        add(dividirBtn);
        add(resultado);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private double lerCampo(JTextField campo) {
        return Double.parseDouble(campo.getText());
    }
    private void somar(ActionEvent e) {
        double a = lerCampo(campoA);
        double b = lerCampo(campoB);
        resultado.setText("Resultado: " + calculadora.somar(a, b));
    }
    private void subtrair(ActionEvent e) {
        double a = lerCampo(campoA);
        double b = lerCampo(campoB);
        resultado.setText("Resultado: " + calculadora.subtrair(a, b));
    }
    private void multiplicar(ActionEvent e) {
        double a = lerCampo(campoA);
        double b = lerCampo(campoB);
        resultado.setText("Resultado: " + calculadora.multiplicar(a, b));
    }
    private void dividir(ActionEvent e) {
        try {
            double a = lerCampo(campoA);
            double b = lerCampo(campoB);
            resultado.setText("Resultado: " + calculadora.dividir(a, b));
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculadoraUI::new);
    }
}
