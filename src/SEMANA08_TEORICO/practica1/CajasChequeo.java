/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA08_TEORICO.practica1;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author NATY
 */
public class CajasChequeo extends JFrame {
    public CajasChequeo() {
        super("Cajas Chequeo");
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox cursoJava = new JCheckBox("Curso de Java",true);
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash",true);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP",false);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby",false);
        FlowLayout dis = new FlowLayout();
        ButtonGroup cursos = new ButtonGroup();
        cursos.add(cursoJava);
        cursos.add(cursoFlash);
        cursos.add(cursoPHP);
        cursos.add(cursoRuby);
        setLayout(dis);
        add(cursoJava);
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        CajasChequeo app = new CajasChequeo();
    }
}
    

