/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Persistencia;
import Modelo.Procesoclima;
import Vista.Formulario;

public class Control implements ActionListener {

    private Formulario objetoFormulario = new Formulario();
    private Procesoclima objetoClima = new Procesoclima();
   
    public void iniciarProceso() {
        objetoFormulario.getB1().addActionListener(this);
        objetoFormulario.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objetoFormulario.getB1()) {
            Persistencia objetoP = new Persistencia();
            objetoP.abrir(objetoFormulario.getT1().getText());
            objetoClima = objetoP.leer();
            objetoP.guardar(objetoClima.TempMenor(), objetoClima.TempMayor(), objetoClima.lluvias(), objetoClima.nieve(), 
                    objetoClima.PuestaMenor(),objetoClima.OcultaMenor(),objetoClima.TempMenor14(), objetoClima.TempMayor14(), objetoClima.TempMenor20(),objetoClima.TempMayor20());
            objetoP.guardarconversion(objetoClima);
            objetoP.cerrar();
            objetoFormulario.getTa().setText("Archivo generado con exito");

        }

    }

}
