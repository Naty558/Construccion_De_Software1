/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07.practico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class ejercicio6 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio6
     */
    
    static ArrayList<String> MES;
    ArrayList<Double> ListaDulces;
    ArrayList<Double> ListaBebidas;
    ArrayList<Double> ListaConservas;
    int cont=0;
    
    public ejercicio6() {
        initComponents();
        MES = new ArrayList<>();
        ListaDulces = new ArrayList<>();
        ListaBebidas = new ArrayList<>();
        ListaConservas = new ArrayList<>();        
    }
    
    public void addMeses(){
        MES.add("Enero"); MES.add("Febrero");
        MES.add("Marzo"); MES.add("Abril");
        MES.add("Mayo"); MES.add("Junio");
        MES.add("Julio"); MES.add("Agosto");
        MES.add("Septiembre"); MES.add("Octubre");
        MES.add("Noviembre"); MES.add("Diciembre");
    }
    
    public void addListas(){        
        if(ListaDulces.size()<=12){
            if(ListaBebidas.size()<=12){
                if(ListaConservas.size()<=12){                    
                    ListaDulces.add(Double.parseDouble(this.txtDulce.getText()));
                    ListaBebidas.add(Double.parseDouble(this.txtBebidas.getText()));
                    ListaConservas.add(Double.parseDouble(this.txtConserva.getText()));                    
                }else{
                    throw new RuntimeException("Supera el limite");
                }
            }else{
                throw new RuntimeException("Supera el limite");
            }
        }else{
            throw new RuntimeException("Supera el limite");
        }
    }
    
    public boolean primerIf(){
            if(txtDulce.getText()!=null){
                if(txtBebidas.getText()!=null){
                    if(txtConserva.getText()!=null){
                        return true;
                    }else
                        return false;
                }else
                    return false;
            }else
                return false;
    }
    
    public boolean segundoIf(){
        if(!txtDulce.getText().equals(""))
            if(!txtBebidas.getText().equals(""))
                if(!txtConserva.getText().equals(""))
                    return true;
                else
                    return false;
            else
                return false;
        else
            return false;
    }
    
    public boolean tercerIf(){
        if(!Character.isDigit(Integer.parseInt(txtDulce.getText())))
            if(!Character.isDigit(Integer.parseInt(txtBebidas.getText())))
                if(!Character.isDigit(Integer.parseInt(txtConserva.getText())))
                    return true;
                else
                    return false;
            else
                return false;
        else
            return false;
    }
    
    public void addListasControl(){
        try{
            if(primerIf()){
                if(segundoIf()){
                    if(tercerIf()){
                        if(muestraMes()){
                            addListas();
                        }else
                            JOptionPane.showMessageDialog(null," Mes vacio o no existe");                        
                    }else
                        JOptionPane.showMessageDialog(null," Solo Numeros pliss");
                }else
                    JOptionPane.showMessageDialog(null," Campos vacios");
            }else
                JOptionPane.showMessageDialog(null," Solo Numeros pliss");            
                                                
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null," Campo nulo");
        }finally{
            
        }
        
    }
    
    public boolean muestraMes (){
        for(String s: MES)
            if(this.txtMes.getText().equalsIgnoreCase(s))
                return true;            
        return false;        
    }
    
    public void limpiarTxt(){        
        this.txtDulce.setText("");
        this.txtBebidas.setText("");
        this.txtConserva.setText("");
        if(cont==11)
            cont=0;        
        this.txtMes.setText(MES.get(cont));
        cont++;
    }
    
    
    public void MayProducDulces(){
        int indice=0;
        double max = ListaDulces.get(0);
        for(int i=0;i<ListaDulces.size();i++)
            if(ListaDulces.get(i)>=max)
                indice = i;                
        this.txtMayorDulces.setText(""+MES.get(indice));
    }                
    
    public void PromedioAnualBebidas(){
        double suma = 0.0;
        double promedio = 0.0;
        for(Double d: ListaBebidas)
            suma+=d;
        promedio = suma/ListaBebidas.size();
        this.txtAnualBebidas.setText(""+promedio);        
    }
    
    public void menorCostoBebidas(){
        double min = ListaBebidas.get(0);
        int indice=0;
        for(int i=0;i<ListaBebidas.size();i++)
            if(ListaBebidas.get(i)<=min)
                indice = i;
        this.txtMenorpBebidas.setText(MES.get(indice));
    }
    
    public void menorProduccionAgosto(){
               
        if(ListaBebidas.get(7)<=ListaConservas.get(7)){
            if(ListaBebidas.get(7)<=ListaDulces.get(7)){
                this.txtDepMenorAgosto.setText("Dep : BEBIDAS Menor Costo");
            }else if(ListaDulces.get(7)<=ListaConservas.get(7)){
                this.txtDepMenorAgosto.setText("Dep : DULCES Menor Costo");
            }else 
                this.txtDepMenorAgosto.setText("Dep : CONSERVAS Menor Costo");
        }else if(ListaConservas.get(7)<=ListaDulces.get(7)){
            this.txtDepMenorAgosto.setText("Dep : CONSERVAS Menor Costo");
        }else
            this.txtDepMenorAgosto.setText("Dep : DULCES Menor Costo");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtDulce = new javax.swing.JTextField();
        txtBebidas = new javax.swing.JTextField();
        txtConserva = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMayorDulces = new javax.swing.JTextField();
        txtAnualBebidas = new javax.swing.JTextField();
        txtMenorpBebidas = new javax.swing.JTextField();
        txtDepMenorAgosto = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mes:");

        jLabel2.setText("Dulces: ");

        jLabel3.setText("Bebidas: ");

        jLabel4.setText("Conservas: ");

        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });

        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel5.setText("MES DE MAYOR PRODUCCION DE DULCES: ");

        jLabel6.setText("PROMEDIO ANUAL DE LOS CONSTOS DE PRODUCCION BEBIDAS:  ");

        jLabel7.setText("EN QUE MES SE REGISTRO EL MENOR DE COSTO P.BEBIDAS: ");

        jLabel8.setText("CUAL FUE EL DEPARTAMENTO DE MENOR PRODUCCION EN AGOSTO:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGrabar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConserva, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDulce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                        .addComponent(txtBebidas, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(212, 212, 212))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCalcular)
                                .addGap(104, 104, 104))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMayorDulces, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnualBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDepMenorAgosto)
                                .addComponent(txtMenorpBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDulce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnGrabar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMayorDulces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAnualBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtMenorpBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDepMenorAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
                
        addListasControl();
        limpiarTxt();        
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:                
        
    }//GEN-LAST:event_txtMesActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        MayProducDulces();
        PromedioAnualBebidas();
        menorCostoBebidas();
        menorProduccionAgosto();
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ejercicio6 ej = new ejercicio6();
                ej.setVisible(true);
                ej.addMeses();                
                ej.txtMes.setEditable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAnualBebidas;
    private javax.swing.JTextField txtBebidas;
    private javax.swing.JTextField txtConserva;
    private javax.swing.JTextField txtDepMenorAgosto;
    private javax.swing.JTextField txtDulce;
    private javax.swing.JTextField txtMayorDulces;
    private javax.swing.JTextField txtMenorpBebidas;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}
