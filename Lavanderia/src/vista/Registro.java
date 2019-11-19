
package vista;

import clases.Cliente;
import clases.Principal;
import logica.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
    
    List<Cliente> clientes;
    
    /**
     * Crea formulario Registro
     */
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt nombre = new TextPrompt("Ingresa nombre", fieldNombre);
        TextPrompt usuario = new TextPrompt("Ingresa usuario", fieldUsuario);
        TextPrompt contrasena = new TextPrompt("Ingresa contrasena", fieldContrasena);
        TextPrompt direccion = new TextPrompt("Ingresa direccion", fieldDireccion);
        TextPrompt telefono = new TextPrompt("Ingresa telefono", fieldTelefono);
    }

    /**
     * Creando el formulario Registro.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        fieldDireccion = new javax.swing.JTextField();
        fieldTelefono = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        labelRegistro = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        fieldContrasena = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        labelNombre.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelNombre.setText("Nombre");

        labelDireccion.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelDireccion.setText("Dirección");

        fieldNombre.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        fieldDireccion.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        fieldTelefono.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        labelTelefono.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelTelefono.setText("Teléfono");

        btnRegistro.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnRegistro.setText("Registrarse");
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });

        labelRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/registro.png"))); // NOI18N

        fieldUsuario.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        labelUsuario.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelUsuario.setText("Usuario");

        labelNombre2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelNombre2.setText("Contraseña");

        fieldContrasena.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(btnAtras))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelDireccion)
                                            .addComponent(labelNombre)
                                            .addComponent(labelTelefono))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(labelUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnRegistro)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(labelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistro)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre2)
                    .addComponent(fieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro)
                    .addComponent(btnAtras))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
        // Lectura de campos (fields)
        String nombre = fieldNombre.getText();
        String usuario = fieldUsuario.getText();
        String contrasena = fieldContrasena.getText();
        String direccion = fieldDireccion.getText();
        String telefono = fieldTelefono.getText();
        
        if( nombre.length() == 0 ){
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre", "Aviso", JOptionPane.WARNING_MESSAGE);
            fieldNombre.requestFocus();
            return;
        }
        if( usuario.length() == 0 ){
            JOptionPane.showMessageDialog(null, "Debes ingresar un Usuario", "Aviso", JOptionPane.WARNING_MESSAGE);
            fieldUsuario.requestFocus();
            return;
        }
        if( contrasena.length() == 0 ){
            JOptionPane.showMessageDialog(null, "Debes ingresar una Contrasena", "Aviso", JOptionPane.WARNING_MESSAGE);
            fieldContrasena.requestFocus();
            return;
        }
        if( direccion.length() == 0 ){
            JOptionPane.showMessageDialog(null, "Debes ingresar una Direccion", "Aviso", JOptionPane.WARNING_MESSAGE);
            fieldDireccion.requestFocus();
            return;
        }
        if( telefono.length() == 0 ){
            JOptionPane.showMessageDialog(null, "Debes ingresar un Telefono", "Aviso", JOptionPane.WARNING_MESSAGE);
            fieldTelefono.requestFocus();
            return;
        }
        
        /* Ingreso los datos correctamente */        
        Cliente cliente = new Cliente( nombre, usuario, contrasena, direccion, telefono );
        
        clientes = new LinkedList<>();
        
        // Si el archivo no existe
        File fichero = new File("clientes.dat");
        if( fichero.exists() == false ){
            clientes = new LinkedList<>();
            clientes.add( cliente );
            cCliente.GuardarLista(clientes);
        }
        else{ // Si el archivo existe
            clientes = cCliente.AbrirLista();
            clientes.add( cliente );
            cCliente.GuardarLista( clientes );
        }
        
        JOptionPane.showMessageDialog(null, "Registrado correctamente");
        Login log = new Login();
        log.setVisible( true );
        this.dispose();
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        Login log = new Login();
        log.setVisible( true );
        this.dispose();
    }//GEN-LAST:event_btnAtrasMouseClicked

    public static void registro(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JTextField fieldContrasena;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
