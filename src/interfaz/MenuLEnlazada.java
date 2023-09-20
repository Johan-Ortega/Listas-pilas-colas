
package interfaz;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lógica.*;

/**
 * 
 * @author maste
 */
public final class MenuLEnlazada extends javax.swing.JFrame {
    
    
    public MenuLEnlazada() {
        initComponents();
    }
    
    public void ActualizarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Posicion");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Edad");
        
          
        for(int i=0; i<Global.lEnlazada.getTamaño(); i++)  {
            Object [] fila = new Object[4];
            fila[0] = i;
            fila[1] = Global.lEnlazada.getNodo(i).getDato().getNombre(); 
            fila[2] = Global.lEnlazada.getNodo(i).getDato().getTelefono();
            fila[3] = Global.lEnlazada.getNodo(i).getDato().getEdad();
            modelo.addRow(fila); 
        }
        datos.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbtnAñadir = new javax.swing.JMenu();
        mbtnEliminar = new javax.swing.JMenu();
        mbtnModificar = new javax.swing.JMenu();
        mbtnConsultar = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(750, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Posicion", "Nombre", "Telefono", "Edad"
            }
        ));
        datos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(datos);

        mbtnAñadir.setText("Añadir");
        mbtnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbtnAñadirMouseClicked(evt);
            }
        });
        mbtnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtnAñadirActionPerformed(evt);
            }
        });
        jMenuBar1.add(mbtnAñadir);

        mbtnEliminar.setText("Eliminar");
        mbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbtnEliminarMouseClicked(evt);
            }
        });
        mbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtnEliminarActionPerformed(evt);
            }
        });
        jMenuBar1.add(mbtnEliminar);

        mbtnModificar.setText("Modificar");
        mbtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbtnModificarMouseClicked(evt);
            }
        });
        jMenuBar1.add(mbtnModificar);

        mbtnConsultar.setText("Consultar");
        mbtnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbtnConsultarMouseClicked(evt);
            }
        });
        jMenuBar1.add(mbtnConsultar);

        jMenu5.setText("Ordenar");

        jMenuItem1.setText("Nombre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem3.setText("Edad");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Global.lEnlazada.OrdenarEnlazadaNombre(Global.lEnlazada); 
        JOptionPane.showMessageDialog(jMenuItem1,"Lista Ordenada por nombre"); 
        ActualizarTabla();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbtnEliminarActionPerformed

    private void mbtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtnAñadirActionPerformed
        
    }//GEN-LAST:event_mbtnAñadirActionPerformed

    private void mbtnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbtnAñadirMouseClicked
        AgregarContactoLE AgContacto = new AgregarContactoLE();
        AgContacto.setVisible(true);
        AgContacto.pack();
        ActualizarTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_mbtnAñadirMouseClicked

    private void mbtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbtnEliminarMouseClicked
        String index = JOptionPane.showInputDialog("Introduzca la posicion del contacto: ");
        if(Integer.parseInt(index)<Global.lEnlazada.getTamaño()){
            String aux = Global.lEnlazada.getNodo(Integer.parseInt(index)).getDato().getNombre();
            JOptionPane.showMessageDialog(jMenu5, "Eliminando el Contacto " + aux);
            Global.lEnlazada.eliminar(Integer.parseInt(index));
        }else{
            JOptionPane.showMessageDialog(jMenu5,"No se ha encontrado el contacto");
        }
    
    }//GEN-LAST:event_mbtnEliminarMouseClicked

    private void mbtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbtnModificarMouseClicked
        ModificarContactoLE MContacto = new ModificarContactoLE();
        MContacto.setVisible(true);
        MContacto.pack();
        ActualizarTabla();
               // TODO add your handling code here:
    }//GEN-LAST:event_mbtnModificarMouseClicked

    private void mbtnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbtnConsultarMouseClicked
        String index = JOptionPane.showInputDialog("Introduzca la posicion del contacto: ");
        if(Integer.parseInt(index)<=Global.lEnlazada.getTamaño()){    
            Contacto aux = Global.lEnlazada.getNodo(Integer.parseInt(index)).getDato();
            JOptionPane.showMessageDialog(jMenu5,"Contacto Consultado" + "\nNombre: " + aux.getNombre()+"\nTelefono: " + aux.getTelefono() + "\nEdad: " + aux.getEdad());
        }else{
            JOptionPane.showMessageDialog(jMenu5,"No existe ese contacto");
        }   // TODO add your handling code here:
    }//GEN-LAST:event_mbtnConsultarMouseClicked

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Global.lEnlazada.OrdenarEnlazadaEdad(Global.lEnlazada); 
        JOptionPane.showMessageDialog(jMenuItem3,"Lista Ordenada por edad");
        ActualizarTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ActualizarTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(MenuLEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLEnlazada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable datos;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mbtnAñadir;
    private javax.swing.JMenu mbtnConsultar;
    private javax.swing.JMenu mbtnEliminar;
    private javax.swing.JMenu mbtnModificar;
    // End of variables declaration//GEN-END:variables
}
