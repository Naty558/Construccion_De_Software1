/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package SEMANA08_TEORICO.practica1;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.function.Consumer;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NATY
 */
public class TrabajoInterfaz_Programar extends JFrame  {
    JButton ingresar;
    public TrabajoInterfaz_Programar(){
    super("BIENVENIDOS ");

    JButton registrar= new JButton("Registrar");


    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    FlowLayout dis = new FlowLayout();
    setLayout(dis);
    ArrayList<Persona> arrayPersona = new ArrayList<Persona>();
    JLabel saludo = new JLabel("-------------------INGRESE SUS DATOS ----------------------:",JLabel.RIGHT);
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
    

    ingresar= new JButton("Ingresar ");

    ingresar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingresar) {
          Persona objectoPersona = new Persona();
          objectoPersona.nombre = direccionNombre.getText();
          objectoPersona.edad = direccionPagina.getText();
          objectoPersona.direccion=direccion.getText();
          arrayPersona.add(objectoPersona);
          direccionNombre.setText("");
          direccionPagina.setText("");
          direccion.setText("");
        }
      }
    });
   
    JButton mostrar = new JButton("Mostrar");
    add(ingresar);
    mostrar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      JFrame ventana = new JFrame();
      ventana.setVisible(true);
      ventana.setSize(400,400);
      setVisible(false);
      FlowLayout des = new FlowLayout();
      ventana.setLayout(dis);
      //ventana.add(lblDireccion);
      ventana.setLocationRelativeTo(null);
      JPanel mipanel = new JPanel ();
      JTable mitabla = new JTable();
      DefaultTableModel modelo = new  DefaultTableModel();
      ArrayList<Object> nombreColum = new ArrayList<Object>();
      nombreColum.add("Nombre");
      nombreColum.add("Edad");
      nombreColum.add("Direccion");
      for(Object columna : nombreColum){
        modelo.addColumn(columna);
      }
      mitabla.setModel(modelo);
      ArrayList<Object[]> datos = new ArrayList<Object[]>();
      for (int i = 0; i < arrayPersona.size(); i++) {
        Object[]informacion = new Object[]{arrayPersona.get(i).getNombre(),arrayPersona.get(i).getEdad(),arrayPersona.get(i).getDireccion()};
        datos.add(informacion);
      }
      for (Object[]datoss : datos) {
          modelo.addRow(datoss);
      }
      mitabla.setModel(modelo);
      mipanel.add(mitabla);
      ventana.add(mipanel);

      JButton volver = new JButton("Volver");
      volver.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
          setVisible(true);
          ventana.setVisible(false);
        }
      });
      ventana.add(volver);
    } 
   });

    add(mostrar);  
    setVisible(true);
    setLocationRelativeTo(null);	
    }
    public static void main(String[] arguments) {
        TrabajoInterfaz_Programar app = new TrabajoInterfaz_Programar();
    }


}