/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author sara
 */
public class ComportamentoTxtFahrenheit implements FocusListener{
    Formulario form;
    
    public ComportamentoTxtFahrenheit(Formulario f){
        form = f;
    }
    @Override
    public void focusGained(FocusEvent e) {
        form.getTxtFahrenheit().setText("");
//hrow new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(form.getTxtFahrenheit().getText().equals(""))
             form.getTxtFahrenheit().setText("informe a temperatura em Fehrenheit.");
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
