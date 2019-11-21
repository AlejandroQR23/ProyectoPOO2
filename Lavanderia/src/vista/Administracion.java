/*

 */

package vista;

import clases.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.cCliente;

/**
 *
 * @author ASUS
 */
public class Administracion extends javax.swing.JFrame {

    List<Cliente> clientes;
    
    /** Crea nuevo formulario Administracion */
    public Administracion() {
        initComponents();
        PropiedadesTablaUsuarios();
        setLocationRelativeTo(null);
    }

    private void PropiedadesTablaUsuarios(){
        String titulo[] = {"Nombre", "Telefono","Direccion"};
        /*   Mostrar los datos de los clientes en la tabla de Usuarios   */
        clientes = cCliente.AbrirLista();
        int numClientes = clientes.size();
        
        DefaultTableModel dtm = new DefaultTableModel(null, titulo){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return (columnas == numClientes);
            }
        };
        
        for( Cliente i : clientes ){
            String fila[] = {i.getNombre(), i.getTelefono(), i.getDireccion()};
            dtm.addRow(fila);
        }
        
        tablaUsuarios.setModel(dtm);
    }
    
    
    
    /** 
     * Inicializa el formulario
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        panel2 = new javax.swing.JPanel();
        labelAcoxpa = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaNotas = new javax.swing.JTextArea();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administracion");
        setAlwaysOnTop(true);

        panelFondo.setBackground(new java.awt.Color(102, 153, 0));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        jLabel4.setText("Usuarios");

        tablaUsuarios.setAutoCreateRowSorter(true);
        tablaUsuarios.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Telefono", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .add(jLabel4)
                .add(146, 146, 146))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 277, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelAcoxpa.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        labelAcoxpa.setText("Ganancias Totales: $0.00");

        org.jdesktop.layout.GroupLayout panel2Layout = new org.jdesktop.layout.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelAcoxpa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelAcoxpa)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        jLabel5.setText("Notas");

        areaNotas.setColumns(20);
        areaNotas.setRows(5);
        jScrollPane2.setViewportView(areaNotas);

        org.jdesktop.layout.GroupLayout panel3Layout = new org.jdesktop.layout.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel3Layout.createSequentialGroup()
                .add(77, 77, 77)
                .add(jLabel5)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panel3Layout.createSequentialGroup()
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCerrarSesion.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelFondoLayout = new org.jdesktop.layout.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .add(panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(panelFondoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelFondoLayout.createSequentialGroup()
                        .add(panelFondoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(panel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(panel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panelFondoLayout.createSequentialGroup()
                        .add(btnCerrarSesion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(58, 58, 58))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelFondoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(panelFondoLayout.createSequentialGroup()
                        .add(0, 15, Short.MAX_VALUE)
                        .add(btnCerrarSesion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(panel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(panel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(panelFondo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelFondo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        Login log = new Login();
        log.setVisible( true );
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    /**
     * @param args argumentos
     */
    public static void main(String args[]) {
        /* Muestra ventana estilo NIMBUS (Java SE 6)
         * Para mas detalles see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y muestra el Formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNotas;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAcoxpa;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

}
