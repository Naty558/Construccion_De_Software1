/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package SEMANA08_TEORICO.practica1;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author NATY
 */
public class TrabajoInterfaz_Programar extends JFrame  {
 JButton ingresar;
    public TrabajoInterfaz_Programar(){
    super("BIENVENIDOS ");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    FlowLayout dis = new FlowLayout();
    setLayout(dis);
    JLabel saludo = new JLabel("-------------------INGRESE SUS DATOS ----------------------:",JLabel.RIGHT);
    //AQUI CREAS TU ARRAY LIST DE TIPO PERSONA
    ArrayList<Persona> arrayPersona = new ArrayList<Persona>();
        
 
    JLabel etiquetaNombre = new JLabel("Ingrese su nombre  :",JLabel.RIGHT);
    JTextField direccionNombre = new JTextField("",30);
    JLabel etiquetaPagina = new JLabel("Ingrese su edad : ",JLabel.RIGHT);
    JTextField direccionPagina = new JTextField("", 30);
    JLabel etiquetaDireccion = new JLabel("Ingrese direccion :",JLabel.RIGHT);
    JTextField direccion = new JTextField("",30);
    
    add(saludo);
    add(etiquetaNombre);
    add(direccionNombre);
    add(etiquetaPagina);
    add(direccionPagina);
    add(etiquetaDireccion);
    add(direccion);
    

    ingresar= new JButton("REGISTRAR ");

    ingresar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == ingresar) {
                JFrame ventana = new JFrame();
                ventana.setVisible(true);
                ventana.setSize(400,400);
                setVisible(false);
                //AQUI ES DONDE SE CREA EL OBJETO PERSONA
                Persona objectoPersona = new Persona();
                //AQUI SE LE ASIGNAN LOS VALORES QUE ESTES UTILIZANDO A CADA UNO DE SUS ATRIBUTOS, ACCEDES A ELLOS CON EL '.'
                //PSDT. AGREGA TODOS LO ATRIBUTOS QUE ESTES UTILIZANDO
               
                objectoPersona.nombre = direccionNombre.getText();
                objectoPersona.edad = direccionPagina.getText();
                objectoPersona.direccion=direccion.getText();
                //AQUI HACES EL PUSH AL ARRAY, OSEA LE AGREGAS EL OBJETO PERSONA AL ARREGLO
                arrayPersona.add(objectoPersona);
                //RECORRES TU ARRAY DE OBJETOS PODRIAS HACER UNA FUNCIONALIDAD PARA ALMACENAR VARIAS PERSONAS A LA VEZ
                  for (int i=0;i<arrayPersona.size();i++){
    //AQUI CAPTURAS AL OBJETO Y LLAMAS A SU METODO GET
               System.out.println(arrayPersona.get(i).getNombre());    
                    
                JLabel entrada=new JLabel("PERSONA REGISTRADA :");
                JLabel Nombre = new JLabel ("Hola "+arrayPersona);
                  }
              /*  JLabel Edad = new JLabel ("su edad es "+direccionPagina.getText(),JLabel.RIGHT);
                JLabel lblDireccion= new JLabel ("La direccion es "+direccion.getText(),JLabel.RIGHT);
                ventana.add(entrada);
                ventana.add(Nombre);
                ventana.add(Edad);*/
              ventana.add(arrayPersona);
                FlowLayout des = new FlowLayout();
                ventana.setLayout(dis);
              //  ventana.add(lblDireccion);
                ventana.setLocationRelativeTo(null);
		    }
        }
    });
    JButton salir = new JButton("SALIR");
    add(ingresar);
   
    add(salir);
    setVisible(true);
    setLocationRelativeTo(null);	
       
        
    }
    public static void main(String[] arguments) {
        TrabajoInterfaz_Programar app = new TrabajoInterfaz_Programar();
    }


}
    
    


