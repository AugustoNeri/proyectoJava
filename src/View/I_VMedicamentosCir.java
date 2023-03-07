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
public class I_VMedicamentosCir extends javax.swing.JFrame {

    ListSelectionModel medicamentos;
    int filas;

    /**
     * Creates new form I_Insumos
     */
    public I_VMedicamentosCir() {
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
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(361, 482));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Nombre del medicamento");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel3.setText("Medicamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
           int seleccionar=jTable1.getSelectedRow();
        int desicion,decision2;
        double precio;
        jLabel2.setText(jTable1.getValueAt(seleccionar,0).toString());
     
           JOptionPane.showMessageDialog(null,"Nombre del insumo: "+jTable1.getValueAt(seleccionar,0).toString()+
                                                "\nDescripcion: "+jTable1.getValueAt(seleccionar,1).toString()+
                                                "\nCosto_venta: "+jTable1.getValueAt(seleccionar,2).toString()+
                                                "\nPresentacion:"+jTable1.getValueAt(seleccionar,3).toString()+
                                                "\nId:"+jTable1.getValueAt(seleccionar,4).toString());
        desicion=JOptionPane.showConfirmDialog(null,"Desea añadir el medicamento "+jTable1.getValueAt(seleccionar,0).toString());
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
                    String id_c= I_VCirugia.jLabel8.getText();
                    String cadena="insert into cirugia_medicamento values('"+id_c+"',"+jLabel4.getText()+")";
                    MySQLDB.consultaActualiza(st, cadena);
                     st = MySQLDB.conexion();
                    cadena="update medicamento set Cantidad_Disp=Cantidad_Disp-1 where ID='"+jTable1.getValueAt(seleccionar,4).toString()+"'";
                    MySQLDB.consultaActualiza(st, cadena);
                 decision2=JOptionPane.showConfirmDialog(null,"Desea añadir otro medicamento");
                 
                 if(decision2==1){
                   

                     JOptionPane.showMessageDialog(null,"Venta de Cirugia terminada");
                     this.dispose();
                     new IMenu_Venta().setVisible(true);
                 }
             }else{
                 if(desicion==1){
                     
                 }else{
                     
                 }
             }
        
                                       
        //new InfoMed().setVisible(true);
        filas=seleccionar;
        
    }//GEN-LAST:event_jTable1MouseClicked
public void buscarIdMedicamento(String nombre){
        MySQLDB mysql = new MySQLDB();
        System.out.println("INICIO DE EJECUCIÓN.");
       
        MySQLDB.conectar();
        Statement st = MySQLDB.conexion();
 
        // Se elimina la tabla "personal" en caso de existir.
        String cadena="Select ID from medicamento where Cantidad_Disp>0 and Nombre = '"+nombre+"'";

        ResultSet rs = MySQLDB.consultaQuery(st, cadena);
       
        
         if (rs != null) {
           
              try {
                   
                   
                  while (rs.next()) {
                        
                        
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
    public void buscarInsumo(String nombre){
         DefaultTableModel model = new DefaultTableModel();
         
        MySQLDB mysql = new MySQLDB();
        System.out.println("INICIO DE EJECUCIÓN.");
        model.addColumn("Nombre");
        model.addColumn("Tipo medicamento");
        model.addColumn("Administracion");
        model.addColumn("Descripcion");
            model.addColumn("id");
        MySQLDB.conectar();
        Statement st = MySQLDB.conexion();
 
        // Se elimina la tabla "personal" en caso de existir.
        String cadena="Select Nombre,Tipo,Administracion,Presentacion from medicamento where Cantidad_Disp>0  and Nombre like '%"+nombre+"%' order by Nombre asc";

        ResultSet rs = MySQLDB.consultaQuery(st, cadena);
       
        
         if (rs != null) {
           
              try {
                   
                   
                  while (rs.next()) {
                        Object dato[]=new Object[5];
                        for(int i=0;i<5;i++){
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
            java.util.logging.Logger.getLogger(I_VMedicamentosCir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_VMedicamentosCir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_VMedicamentosCir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_VMedicamentosCir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_VMedicamentosCir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}