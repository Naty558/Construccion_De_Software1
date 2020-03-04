/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA08_TEORICO.practica1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author NATY
 */
public class AreaTexto extends JFrame {
    public AreaTexto(){
        super("AREA TEXTO");
        setSize(500, 180);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea comentarios = new JTextArea(8, 40);
       FlowLayout dis = new FlowLayout();
        setLayout(dis);
        add(comentarios);
        setVisible(true);
    }
    public static void main(String[] arguments) {
        AreaTexto app = new AreaTexto();
    }
}
    
    
