/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Formulario extends JFrame {

    private JTextArea ta = new JTextArea(4, 30);
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JTextField t1 = new JTextField(10);
    private JButton b1 = new JButton("ABRIR Y GENERAR ARCHIVO");

    public JTextArea getTa() {
        return ta;
    }

    public JTextField getT1() {
        return t1;
    }

    public JButton getB1() {
        return b1;
    }

    public Formulario() {
        ConfigurarVentana();
        configurarObjetosGraficos();
    }

    private void ConfigurarVentana() {

        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        setLocationRelativeTo(null);

    }

    private void configurarObjetosGraficos() {

        add("North", p1);
        add("South", p2);
        p1.add(t1);
        p1.add(b1);
        p2.add(ta);

    }

}
