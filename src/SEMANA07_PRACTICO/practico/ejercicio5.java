/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07.practico;

import java.util.ArrayList;

/**
 *
 * @author DEYGLIS MIDDLEY
 */


interface a{
    
}

class add implements a{
    a A;
       
}
        
        
        
public class ejercicio5 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio5
     */
    
    ArrayList<Integer> examen1;
    ArrayList<Integer> examen2;
    ArrayList<Integer> examen3;
    ArrayList<Double> promedioEst;
    
    int numAl;
    int contador;
    public ejercicio5() {
        initComponents();
        examen1 = new ArrayList<>();
        examen2 = new ArrayList<>();
        examen3 = new ArrayList<>();
        promedioEst = new ArrayList<>();
        numAl = 0;
        contador = 0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPromExamen3 = new javax.swing.JTextField();
        txtMayorProm = new javax.swing.JTextField();
        txtNumEst = new javax.swing.JTextField();
        txtNumAprob = new javax.swing.JTextField();
        txtNumDesap = new javax.swing.JTextField();
        txtDesapExamen1 = new javax.swing.JTextField();
        txtNroOrden = new javax.swing.JTextField();
        txtExamen1 = new javax.swing.JTextField();
        txtExamen2 = new javax.swing.JTextField();
        txtExamen3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMuestra = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de orden del Estudiante: ");

        jLabel2.setText("Examne 1: ");

        jLabel3.setText("Examen 2: ");

        jLabel4.setText("Examen 3: ");

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

        jLabel5.setText("Promedio del Aula Examen 3: ");

        jLabel6.setText("Mayor Promedio: ");

        jLabel7.setText("Numero de Estudiantes: ");

        jLabel8.setText("Numero de Aprobados: ");

        jLabel9.setText("Numero de Desaprobados: ");

        jLabel10.setText("N° de Desaprobados Examen 1: ");

        txtDesapExamen1.setText(" ");

        txtExamen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamen1ActionPerformed(evt);
            }
        });

        txaMuestra.setColumns(20);
        txaMuestra.setRows(5);
        jScrollPane1.setViewportView(txaMuestra);

        jLabel11.setText("Cuadro Informativo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtExamen1)
                                        .addComponent(txtExamen3)
                                        .addComponent(txtExamen2)))))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumDesap)
                            .addComponent(txtNumAprob)
                            .addComponent(txtNumEst)
                            .addComponent(txtPromExamen3)
                            .addComponent(txtMayorProm)
                            .addComponent(txtDesapExamen1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnGrabar)
                        .addGap(76, 76, 76)
                        .addComponent(btnCalcular)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtExamen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtExamen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtExamen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPromExamen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtMayorProm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtNumEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNumAprob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtNumDesap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtDesapExamen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCalcular)
                                    .addComponent(btnGrabar)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

           
    public void addExamen1(){        
        if(examen1.size()<=numAl)                         
            examen1.add(Integer.parseInt(this.txtExamen1.getText()));               
    }    
    public void addExamen2(){
        if(examen2.size()<=numAl)
            examen2.add(Integer.parseInt(this.txtExamen2.getText()));                        
    }    
    public void addExamen3(){
        if(examen3.size()<=numAl)
            examen3.add(Integer.parseInt(this.txtExamen3.getText()));
    }
    
    public String verExamen1(){
        String cad = "";
        for(Integer i: examen1)
            cad+=i+"\n";
        return cad;
    }
    
    public String verExamen2(){
        String cad = "";
        for(Integer i: examen1)
            cad+=i+"\n";
        return cad;
    }
    public String verExamen3(){
        String cad = "";
        for(Integer i: examen2)
            cad+=i+"\n";
        return cad;
    }
    
    public String verNotas(){
        String cad = "";
        int a = 1;
        for(int i=0;i<numAl;i++){
            cad+="Promedio Alumno: "+a+"\nNotas: "+examen1.get(contador)+" , "+
                examen2.get(contador)+" , "+examen3.get(contador)+"\n";        
            contador++;
            a++;
        }
        return cad;
        
    }
    
    public double PromExamen3(){
        double suma = 0.0;
        for(Integer i: examen3)
            suma+=i;
        return suma/numAl;
    }
    
    private void PromedioExamenes(){
        double suma1 = 0.0;
        double suma2 = 0.0;
        double suma3 = 0.0;
        int tam = Integer.parseInt(txtNroOrden.getText());
        for(Integer i: examen1)
            suma1+=i;        
        for(Integer i: examen2)
            suma2+=i;
        for(Integer i: examen3)
            suma3+=i;
        double prom = (suma1+suma2+suma3)/3;
        promedioEst.add(prom);
    }
    
    public double MayorProm(){        
        double max = promedioEst.get(0);
        for(int i=0;i<promedioEst.size();i++)
            if(promedioEst.get(i)>max)
                max = promedioEst.get(i);
        
        return max;
    }
    
    public int numAprobados(){
        int cont=0;
        for(int i=0;i<promedioEst.size();i++){
            if(promedioEst.get(i)>=10.5)
                cont++;
        }
        return cont;
    }
    
    public int numDesap(){
        int cont=0;
        for(int i=0;i<promedioEst.size();i++){
            if(promedioEst.get(i)<10.5)
                cont++;
        }
        return cont;
    }
    
    public int desExamen1(){
        double suma = 0.0;
        double prom = 0.0;
        int cont=0;
        for(Integer i: examen1)
            suma+=i;
        prom = suma/examen1.size();        
        for(int i=0;i<examen1.size();i++)
            if(examen1.get(i)<10.5)
                cont++;       
        return cont;        
    }
    
    private int cont=0;
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        
        examen1.clear();
        examen2.clear();
        examen3.clear();
        promedioEst.clear();
        this.txtNroOrden.setEditable(false);       
        PromedioExamenes();
        cont++;
        numAl = Integer.parseInt(txtNroOrden.getText());
            
        addExamen1();                
        addExamen2();
        addExamen3();
        
        this.txtExamen1.setText("");
        this.txtExamen2.setText("");
        this.txtExamen3.setText("");    
        if(cont==numAl){
            btnGrabar.setEnabled(false);            
        }                    
        this.txaMuestra.setText("");
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        this.txtPromExamen3.setText(PromExamen3()+"");
        
        this.txtMayorProm.setText(MayorProm()+"");
        this.txtNumEst.setText(numAl+"");
        this.txtNumAprob.setText(numAprobados()+"");
        this.txtNumDesap.setText(numDesap()+"");
        this.txtDesapExamen1.setText(desExamen1()+"");
        String cad = verNotas();
        if(contador==numAl)
            this.txaMuestra.setText(cad);        
        this.txtNroOrden.setText("");
        this.btnGrabar.setEnabled(true);
        this.txtNroOrden.setEditable(true);
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtExamen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamen1ActionPerformed
        
    }//GEN-LAST:event_txtExamen1ActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ejercicio5().setVisible(true);
                ejercicio5 ej = new ejercicio5();
                ej.setVisible(true);
                ej.txtDesapExamen1.setEditable(false);
                ej.txtMayorProm.setEditable(false);
                ej.txtNumAprob.setEditable(false);
                ej.txtNumDesap.setEditable(false);
                ej.txtNumEst.setEditable(false);
                ej.txtPromExamen3.setEditable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaMuestra;
    private javax.swing.JTextField txtDesapExamen1;
    private javax.swing.JTextField txtExamen1;
    private javax.swing.JTextField txtExamen2;
    private javax.swing.JTextField txtExamen3;
    private javax.swing.JTextField txtMayorProm;
    private javax.swing.JTextField txtNroOrden;
    private javax.swing.JTextField txtNumAprob;
    private javax.swing.JTextField txtNumDesap;
    private javax.swing.JTextField txtNumEst;
    private javax.swing.JTextField txtPromExamen3;
    // End of variables declaration//GEN-END:variables
}
