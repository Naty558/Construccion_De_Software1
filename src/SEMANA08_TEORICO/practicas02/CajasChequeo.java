import javax.swing.*;
import java.awt.*;

public class CajasChequeo extends JFrame {

    public CajasChequeo() {
        super("Cajas Chequeo");
        try {
              UIManager. setLookAndFeel(
              //UIManager.getSystemLookAndFeelClassName());
            //UIManager.getCrossPlatformLookAndFeelClassName());
            //"com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
             // "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
               "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
               //"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");                 
              SwingUtilities. updateComponentTreeUI(this) ;
        } catch (Exception e) {
          System. out. println("No se ha podido configurar el look and feel:"+ e.getMessage( ));
          e. printStackTrace();
        }        
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox cursoJava = new JCheckBox("Curso de Java", true);
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash", true);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP", false);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby", false);
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