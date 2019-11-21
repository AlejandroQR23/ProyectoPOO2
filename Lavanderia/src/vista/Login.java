package vista;

import clases.Cliente;
import clases.Principal;
import logica.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame implements Runnable {
    List<Cliente> clientes;
    int hora, minutos, segundos;  
    Thread h1;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt usuario = new TextPrompt("Ingresa usuario", fieldUsuario);
        TextPrompt contrasena = new TextPrompt("Ingresa contraseña", fieldContrasena);
        h1 = new Thread(this);
        h1.start();
    }

    /**
     * Genera el Formulario Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelContrasena = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        fieldContrasena = new javax.swing.JPasswordField();
        labelHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        labelUsuario.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelUsuario.setText("Usuario:");

        labelContrasena.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelContrasena.setText("Contraseña:");

        fieldUsuario.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N

        btnLogin.setBackground(new java.awt.Color(255, 102, 51));
        btnLogin.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogin.setText("Iniciar Sesión");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegistro.setBackground(new java.awt.Color(255, 102, 51));
        btnRegistro.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnRegistro.setText("Registrar");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Logo.png"))); // NOI18N

        fieldContrasena.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        labelHora.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        labelHora.setForeground(new java.awt.Color(0, 102, 102));
        labelHora.setText("labelHora");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(fieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnLogin)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(labelLogo))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelContrasena)
                                .addComponent(labelUsuario))
                            .addGap(8, 8, 8)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(86, Short.MAX_VALUE)))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(fieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(30, 30, 30))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelUsuario)
                        .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addComponent(labelContrasena)
                    .addGap(18, 18, 18)
                    .addComponent(btnRegistro)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Lectura de campos (fields)
        String usuario = fieldUsuario.getText();
        char[] contrasenaChar = fieldContrasena.getPassword();
        String contrasena = String.copyValueOf(contrasenaChar);
        
        if( fieldUsuario.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Debes ingresar un Usuario", "Aviso", JOptionPane.WARNING_MESSAGE);
            fieldUsuario.requestFocus();
            return;
        }
        
        if( contrasena.length() == 0 ){
            JOptionPane.showMessageDialog(null, "Debes ingresar una Contrasena", "Aviso", JOptionPane.WARNING_MESSAGE);
            fieldContrasena.requestFocus();
            return;
        }
        
        /* Ingreso los datos correctamente */ 
        // Comparaciones con lista clientes.dat
        clientes = cCliente.AbrirLista();
        for( Cliente i : clientes ){
            String usuarioActual = i.getUsuario();
            String contrasenaActual = i.getContrasena();
            
            // Administrador unico
            if(usuario.equals("admin") && contrasena.equals("admin")){
                Administracion adm = new Administracion();
                adm.setVisible( true );
                i.iniciarSesion(Principal.sucursal);
                this.dispose();
                return;
            }
            if( usuarioActual.equals(usuario) && contrasenaActual.equals(contrasena)){
                Recepcion rec = new Recepcion();
                rec.setVisible( true );
                i.iniciarSesion(Principal.sucursal);
                this.dispose();
                return;
            }
        }
	JOptionPane.showMessageDialog(null, "Usuario o contrasena incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Registro reg = new Registro();
        reg.setVisible( true );
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    public static void login() {
        /*
        * Inicia la ventana con un estilo preestablecido
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    /**
     * Calcula la hora, minutos y segundos para el reloj
     * Usa una instancia de Calendar para obtener la hora actual
     */
    public void calcula (){
        Calendar calendario = new GregorianCalendar();
        hora = calendario.get( Calendar.HOUR_OF_DAY );
        minutos = calendario.get( Calendar.MINUTE );
        segundos = calendario.get( Calendar.SECOND );
    }      


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JPasswordField fieldContrasena;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel labelContrasena;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    /**
    * Sobrescribe el método run() de la interfaz Runnable
    * Aquí se ejecutan las operaciones del hilo reloj
    * La hora calculada por el hilo se coloca en la etiqueta de la interfaz
    */
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            this.labelHora.setText(hora + ":" + minutos + ":" + segundos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Manejar excepcion ?
            }
        }
    }
}
