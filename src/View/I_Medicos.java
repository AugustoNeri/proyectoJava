/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MySQLDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GuillermoAugusto
 */
public class I_Medicos extends javax.swing.JFrame {

    /**
     * Creates new form I_Medicos
     */
    public I_Medicos() {
        initComponents();
            DefaultTableModel model = new DefaultTableModel();
           MySQLDB mysql = new MySQLDB();
        System.out.println("INICIO DE EJECUCIÓN.");
        model.addColumn("Nombre");
        model.addColumn("Ape_pat");
        model.addColumn("Ape_mat");
        model.addColumn("rfc");
        //jLabel4.setVisible(false);
       
        MySQLDB.conectar();
        Statement st = MySQLDB.conexion();
            String cadena="Select nombre,apellido,apellidos,rfc_medico from medicos order by nombre asc";
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
                  //Logger.getLogger(I_Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(325, 434));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Nombre del medico");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Medicos");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
        String nombre=jTextField1.getText();
        buscarMedico(nombre);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int seleccionar=jTable1.getSelectedRow();
        int desicion,decision2;
        double precio;
        String id_c;
         desicion = JOptionPane.showConfirmDialog(null,"Nombre: "+jTable1.getValueAt(seleccionar,0).toString()+
                                                "\nApellido1: "+jTable1.getValueAt(seleccionar,1).toString()+
                                                "\nApellido2: "+jTable1.getValueAt(seleccionar,2).toString()+
                                                "\nrfc:"+jTable1.getValueAt(seleccionar,3).toString()+"\n"
                                                        + "Desea Seleccionar a ese medico?");
         if(desicion==0){
             precio=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio que recibira el medico"));
             id_c= I_VCirugia.jLabel8.getText();
              MySQLDB.conectar();
              Statement st = MySQLDB.conexion();
               String cadena="insert into cirugia_medico values('"+id_c+"','"+jTable1.getValueAt(seleccionar,3).toString()+"',"+precio+")";
                    MySQLDB.consultaActualiza(st, cadena);
                    st = MySQLDB.conexion();
                    
               decision2=JOptionPane.showConfirmDialog(null,"Desea añadir otro medico");
               if(desicion==1){
                   this.dispose();
                   new I_VMaterialesCir().setVisible(true);
                   
               }
             
         }
        
        
    }//GEN-LAST:event_jTable1MouseClicked
 public void buscarMedico(String nombre){
         DefaultTableModel model = new DefaultTableModel();
         
        MySQLDB mysql = new MySQLDB();
        System.out.println("INICIO DE EJECUCIÓN.");
        model.addColumn("Nombre");
        model.addColumn("Ape_pat");
        model.addColumn("Ape_mat");
        model.addColumn("rfc");
       
        MySQLDB.conectar();
        Statement st = MySQLDB.conexion();
 
        // Se elimina la tabla "personal" en caso de existir.
        String cadena="Select nombre,apellido,apellidos,rfc_medico from medicos  where nombre like '%"+nombre+"%' or apellido like '%"+nombre+"%' or apellidos like '%"+nombre+"%' order by nombre asc";

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
                  //Logger.getLogger(I_Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(I_Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_Medicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}