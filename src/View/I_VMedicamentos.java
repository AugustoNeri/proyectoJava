/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MySQLDB;
import static Controller.MySQLDB.conectar;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author GuillermoAugusto
 */
public class I_VMedicamentos extends javax.swing.JFrame {

    ListSelectionModel medicamentos;
    int filas;

    /**
     * Creates new form I_Insumos
     */
    public I_VMedicamentos() {
        initComponents();
         DefaultTableModel model = new DefaultTableModel();
         jLabel4.setVisible(true);
        MySQLDB mysql = new MySQLDB();
        System.out.println("INICIO DE EJECUCIÓN.");
        model.addColumn("Nombre");
        model.addColumn("Tipo medicamento");
        model.addColumn("Administracion");
        model.addColumn("Descripcion");
       
        MySQLDB.conectar();
        Statement st = MySQLDB.conexion();
 
        // Se elimina la tabla "personal" en caso de existir.
        String cadena="Select Nombre,Tipo,Administracion,Presentacion from medicamento where Cantidad_Disp>0 order by Nombre asc";
        ResultSet rs = MySQLDB.consultaQuery(st, cadena);
         if (rs != null) {
           
              try {
                   
                   
                  while (rs.next()) {
                        Object dato[]=new Object[4];
                        for(int i=0;i<4;i++){
                            dato[i]=rs.getString(i+1);
                        }
                        model.addRow(dato);
                      
                      
                      System.out.println("- ");
                  } 
              this.jTable1.setModel(model);
              } catch (SQLException ex) {
                  //Logger.getLogger(I_VMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                  System.out.println(ex);
              }
            MySQLDB.cerrar1(rs);
        }
        MySQLDB.cerrar(st);
        
        MySQLDB.conectar();
        Statement st1 = MySQLDB.conexion();
 
        // Se elimina la tabla "personal" en caso de existir.
        String cadena1="Select num_cama from cat_cama where status=1";
        ResultSet rs1 = MySQLDB.consultaQuery(st1, cadena1);
         if (rs1 != null) {
           
              try {
                   
                   
                  while (rs1.next()) {
                            this.combCama.addItem(rs1.getString("num_cama"));
                  } 
              
              } catch (SQLException ex) {
                  //Logger.getLogger(I_VMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                  System.out.println(ex);
              }
            MySQLDB.cerrar1(rs);
        }
        MySQLDB.cerrar(st);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combCama = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(361, 482));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecciona una cama");

        combCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combCamaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Nombre del medicamento");

        jLabel9.setText("Regresar");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel5.setText("Venta de medicamento");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(combCama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(combCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String nombre=jTextField1.getText();
        buscarInsumo(nombre);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
public void buscarIdMedicamento(String nombre){
        MySQLDB mysql = new MySQLDB();
        System.out.println("INICIO DE EJECUCIÓN.");
       
        MySQLDB.conectar();
        Statement st = MySQLDB.conexion();
 
        // Se elimina la tabla "personal" en caso de existir.
        String cadena="Select ID from medicamento where Nombre = '"+nombre+"'";

        ResultSet rs = MySQLDB.consultaQuery(st, cadena);
       
        
         if (rs != null) {
           
              try {
                   
                   
                  while (rs.next()) {
                        Object dato[]=new Object[4];
                        
                            jLabel4.setText(rs.getString("ID"));
                        
                  } 
             
              } catch (SQLException ex) {
                  //Logger.getLogger(I_VMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                  System.out.println(ex);
              }
            MySQLDB.cerrar1(rs);
        }
        MySQLDB.cerrar(st);
}
    private void combCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combCamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combCamaActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new IMenu_Venta().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccionar=jTable1.getSelectedRow();
        int desicion,decision2;
        jLabel2.setText(jTable1.getValueAt(seleccionar,0).toString());
        if(combCama.getSelectedItem().toString() == "Seleccione una cama"){
            JOptionPane.showMessageDialog(null,"Seleccione una cama","Error",JOptionPane.ERROR_MESSAGE);
        }else{
           JOptionPane.showMessageDialog(null,"Nombre del medicamento: "+jTable1.getValueAt(seleccionar,0).toString()+
                                                "\nDescripcion: "+jTable1.getValueAt(seleccionar,1).toString()+
                                                "\nCosto_venta: "+jTable1.getValueAt(seleccionar,2).toString()+
                                                "\nPresentacion:"+jTable1.getValueAt(seleccionar,3).toString());
        desicion=JOptionPane.showConfirmDialog(null,"Desea añadir el medicamento "+jTable1.getValueAt(seleccionar,0).toString()+" a la cama "+combCama.getSelectedItem().toString());
             if(desicion==0){
                 //JOptionPane.showMessageDialog(null, "Se añadio el medicamento  a la cama "+combCama.getSelectedItem().toString());
                
                 Calendar fecha=new GregorianCalendar();
                 int anio = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH)+1;
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                String cadenafe=""+anio+"-"+mes+"-"+dia;
                  MySQLDB.conectar();
                    Statement st = MySQLDB.conexion();
                    // Se elimina la tabla "personal" en caso de existir.
                    buscarIdMedicamento(jTable1.getValueAt(seleccionar,0).toString());
                    String id=jLabel4.getText();
                    String cadena="insert into cama_medicamento values("+combCama.getSelectedItem().toString()+","+jLabel4.getText()+",'"+cadenafe+"')";
                    MySQLDB.consultaActualiza(st, cadena);
                     st = MySQLDB.conexion();
                    cadena="update medicamento set Cantidad_Disp=Cantidad_Disp-1 where ID='"+id+"'";
                    MySQLDB.consultaActualiza(st, cadena);
                 decision2=JOptionPane.showConfirmDialog(null,"Desea añadir otro medicamento");
                 
                 if(decision2==1){
                     this.dispose();
                     new IMenu_Venta().setVisible(true);
                 }
             }else{
                 if(desicion==1){
                     
                 }else{
                     
                 }
             }
        }
                                       
        //new InfoMed().setVisible(true);
        filas=seleccionar;
        
    }//GEN-LAST:event_jTable1MouseClicked

    public void buscarInsumo(String nombre){
         DefaultTableModel model = new DefaultTableModel();
         
        MySQLDB mysql = new MySQLDB();
        System.out.println("INICIO DE EJECUCIÓN.");
        model.addColumn("Nombre");
        model.addColumn("Tipo medicamento");
        model.addColumn("Administracion");
        model.addColumn("Descripcion");
       
        MySQLDB.conectar();
        Statement st = MySQLDB.conexion();
 
        // Se elimina la tabla "personal" en caso de existir.
        String cadena="Select Nombre,Tipo,Administracion,Presentacion from medicamento where Cantidad_Disp>0 and Nombre like '%"+nombre+"%' order by Nombre asc";

        ResultSet rs = MySQLDB.consultaQuery(st, cadena);
       
        
         if (rs != null) {
           
              try {
                   
                   
                  while (rs.next()) {
                        Object dato[]=new Object[4];
                        for(int i=0;i<4;i++){
                            dato[i]=rs.getString(i+1);
                        }
                        model.addRow(dato);
                      
                      
                      System.out.println("- ");
                  } 
              this.jTable1.setModel(model);
              } catch (SQLException ex) {
                  //Logger.getLogger(I_VMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                  System.out.println(ex);
              }
            MySQLDB.cerrar1(rs);
        }
        MySQLDB.cerrar(st);
    }
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
            java.util.logging.Logger.getLogger(I_VMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_VMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_VMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_VMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_VMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combCama;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
