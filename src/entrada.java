
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soporte
 */
public class entrada extends javax.swing.JFrame {
    private Object combo;
    private Object cmdIngresar;
    private Object cmdbott_ingreso;
   
    /**
     * Creates new form entrada
     */
    public entrada() {
        initComponents();
        setLocationRelativeTo(null);// pantalla central
        setResizable(false);//desactivar maximisar
        setTitle("Mundo Biz S.A.S");//titulo de pantalla
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        selec_depart = new javax.swing.JComboBox();
        bott_ingreso = new javax.swing.JButton();
        fondo_inicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Departamento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, 30));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 240, -1));
        getContentPane().add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 100, 30));

        selec_depart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccion>", "Presidencia", "Suscripciones", "Logistica", "Contabilidad" }));
        selec_depart.setToolTipText("");
        selec_depart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_departActionPerformed(evt);
            }
        });
        getContentPane().add(selec_depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 240, -1));

        bott_ingreso.setAction(bott_ingreso.getAction());
        bott_ingreso.setText("Ingresar");
        bott_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bott_ingresoActionPerformed(evt);
            }
        });
        bott_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bott_ingresoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bott_ingresoKeyTyped(evt);
            }
        });
        getContentPane().add(bott_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 190, 30));

        fondo_inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_1/fondo_inicio.jpg"))); // NOI18N
        fondo_inicio.setToolTipText("");
        fondo_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(fondo_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void selec_departActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_departActionPerformed
        selec_depart.setEditable( false );
        JComboBox x=(JComboBox)evt.getSource();
        String pres="Presidencia";
        String log="Logistica";
        String susc="Suscripciones";
        String cont="Contabilidad";
        String str=(String)x.getSelectedItem();
        
        
    }//GEN-LAST:event_selec_departActionPerformed

    private void bott_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bott_ingresoActionPerformed
        
        if((txt_nombre.getText().equals(""))||(txt_contraseña.getText().equals(""))||("<Seleccion>" == selec_depart.getSelectedItem()))
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
            
            
        }//condicion para no dejar avanzar si los campos no se al llenado
        else{
            
        
        if(("Suscripciones" == selec_depart.getSelectedItem()))
        {
            suscripciones obj=new suscripciones();//me lleva a la ventana que quiero al dar clic en el boton y cierra la ventana
        obj.setVisible(true);
        dispose();
        }
        if(("Logistica" == selec_depart.getSelectedItem()))
        {
            logistica_1 obj=new logistica_1();//me lleva a la ventana que quiero al dar clic en el boton y cierra la ventana
        obj.setVisible(true);
        dispose();
        }
        
        }
    
        
        
        
    }//GEN-LAST:event_bott_ingresoActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        
        char c = evt.getKeyChar();// no acepta numeros en este espacio        
        if ((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
        
        char e=evt.getKeyChar();
        if (e==KeyEvent.VK_ENTER){
           bott_ingesoActionPerformed(null)
                   ;
        }
                
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void bott_ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bott_ingresoKeyTyped
        
    }//GEN-LAST:event_bott_ingresoKeyTyped

    private void bott_ingresoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bott_ingresoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bott_ingresoKeyPressed

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
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bott_ingreso;
    private javax.swing.JLabel fondo_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox selec_depart;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    private void Click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void bott_ingreso(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void bott_ingesoActionPerformed(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
