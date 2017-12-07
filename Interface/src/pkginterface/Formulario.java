/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sara
 */
public class Formulario extends JFrame implements ActionListener{
    private JLabel lblFahrenheit;
    private JLabel lblCelsius;
    private JTextField txtFahrenheit;
    private JButton btnCalcular; 
    
    public Formulario(){       
        txtFahrenheit = new JTextField("Informe a temperatura em Fahrenheit:");
        lblFahrenheit = new JLabel("Fahrenheit:");
        btnCalcular = new JButton("Calcular:");
        lblCelsius = new JLabel("Celsius:");        
        setLayout(new GridLayout(2, 2));
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(txtFahrenheit);
        add(lblFahrenheit);
        add(btnCalcular);
        add(lblCelsius);
        //definir o comportamento do botão
        btnCalcular.addActionListener(this);
        txtFahrenheit.addFocusListener(new ComportamentoTxtFahrenheit(this));
    }
    public void exibir(){
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            float f;
            f = Float.parseFloat(txtFahrenheit.getText());
            float c = ((f - 32)* 5 /8);
            lblCelsius.setText(c + "Celsius.");
        } catch(NumberFormatException a){
            JOptionPane.showMessageDialog(this, "Formato de numero inválido." + " Tente Novamente.");
        }
            
      
    }

    public JTextField getTxtFahrenheit() {
        return txtFahrenheit;
    }

   
    
    
}
