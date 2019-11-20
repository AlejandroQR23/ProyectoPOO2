package vista;

import clases.*; // Clases
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 * 
 */
public class Recepcion extends javax.swing.JFrame {

    /** Crea nuevo formulario Sucursal */
    public Recepcion() { 
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTablaServicios();
        labelInformacion.setText("<html><body>Sucursal: "+Principal.opcion+"<br> Direccion:"+Principal.sucursal.getDireccion()+"</body></html>");
        
        /* IF SUCURSAL 1.ShowInfo LABELS */
        /* IF SUCURSAL 2.ShowInfo LABELS */
        /* IF SUCURSAL 3.ShowInfo LABELS */
    }

    private void PropiedadesTablaServicios(){
        String titulo[] = {"Prendas", "Precio"};
        List<Prenda> prendas = Principal.sucursal.getPrendas();
        /*   Mostrar los datos de la Sucursal en la tabla de Recepcion   */
        
        String list1[] = {prendas.get(0).getNombre(), String.valueOf(prendas.get(0).getPrecio())};
        String list2[] = {prendas.get(1).getNombre(), String.valueOf(prendas.get(1).getPrecio())};
        String list3[] = {prendas.get(2).getNombre(), String.valueOf(prendas.get(2).getPrecio())};
        String list4[] = {prendas.get(3).getNombre(), String.valueOf(prendas.get(3).getPrecio())};
        String list5[] = {prendas.get(4).getNombre(), String.valueOf(prendas.get(4).getPrecio())};
        
        DefaultTableModel dtm = new DefaultTableModel(null, titulo){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return (columnas == 20);
            }
        };
        
        dtm.addRow(list1);
        dtm.addRow(list2);
        dtm.addRow(list3);
        dtm.addRow(list4);
        dtm.addRow(list5);
        
        Tabla.setModel(dtm);
    }
    
    
    
    
    /** 
     * Inicializa el formulario
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        panel3 = new javax.swing.JPanel();
        labelAdquirir = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        panelLogo = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        labelNumeroNota = new javax.swing.JLabel();
        fieldNumeroNota = new javax.swing.JTextField();
        btnRecibir = new javax.swing.JButton();
        labelInformacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recepcion");

        panel.setBackground(new java.awt.Color(0, 153, 153));

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei Light", 1, 14))); // NOI18N

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Saco",  new Float(0.0)},
                {"Pantalon",  new Float(0.0)},
                {"Playera",  new Float(0.0)},
                {"Gorra",  new Float(0.0)}
            },
            new String [] {
                "Prendas", "Costo $"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        ScrollPane.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(1).setResizable(false);
        }

        org.jdesktop.layout.GroupLayout panel2Layout = new org.jdesktop.layout.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel2Layout.createSequentialGroup()
                .add(ScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panel3.setBackground(new java.awt.Color(255, 255, 255));

        labelAdquirir.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelAdquirir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdquirir.setText("Seleccione el o los servicios");
        labelAdquirir.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnAceptar.setBackground(new java.awt.Color(0, 153, 204));
        btnAceptar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panel3Layout = new org.jdesktop.layout.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelAdquirir, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(panel3Layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(btnAceptar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(labelAdquirir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnAceptar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(42, 42, 42))
        );

        panelLogo.setBackground(new java.awt.Color(0, 153, 153));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Logo.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout panelLogoLayout = new org.jdesktop.layout.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLogoLayout.createSequentialGroup()
                .add(19, 19, 19)
                .add(labelLogo)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelLogoLayout.createSequentialGroup()
                .add(0, 154, Short.MAX_VALUE)
                .add(labelLogo))
        );

        panel4.setBackground(new java.awt.Color(255, 255, 255));

        labelNumeroNota.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelNumeroNota.setText("Ingrese # Nota:");

        fieldNumeroNota.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N

        btnRecibir.setBackground(new java.awt.Color(0, 102, 102));
        btnRecibir.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnRecibir.setForeground(new java.awt.Color(255, 255, 255));
        btnRecibir.setText("Recibir");

        labelInformacion.setFont(new java.awt.Font("Microsoft YaHei Light", 2, 14)); // NOI18N
        labelInformacion.setText("Informacion");
        labelInformacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        org.jdesktop.layout.GroupLayout panel4Layout = new org.jdesktop.layout.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel4Layout.createSequentialGroup()
                .add(panel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panel4Layout.createSequentialGroup()
                        .add(panel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(panel4Layout.createSequentialGroup()
                                .add(35, 35, 35)
                                .add(panel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(fieldNumeroNota, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(labelNumeroNota)))
                            .add(panel4Layout.createSequentialGroup()
                                .add(55, 55, 55)
                                .add(btnRecibir)))
                        .add(0, 29, Short.MAX_VALUE))
                    .add(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(labelInformacion, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel4Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(labelNumeroNota)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(fieldNumeroNota, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(btnRecibir)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 59, Short.MAX_VALUE)
                .add(labelInformacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(56, 56, 56))
        );

        org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(panel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(panel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(panelLogo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(panel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(panelLayout.createSequentialGroup()
                        .add(0, 8, Short.MAX_VALUE)
                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(panel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(panelLayout.createSequentialGroup()
                                .add(panelLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(14, 14, 14)
                                .add(panel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        
        // Despues de agregar nota
        Login log = new Login();
        log.setVisible( true );
        this.dispose();
    }//GEN-LAST:event_btnAceptarMouseClicked

    /**
     * @param args argumentos
     */
    public static void Sucursal( /* TIPO DE SUCURSAL */ ) {
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
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Crea y muestra el Formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recepcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRecibir;
    private javax.swing.JTextField fieldNumeroNota;
    private javax.swing.JLabel labelAdquirir;
    private javax.swing.JLabel labelInformacion;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNumeroNota;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panelLogo;
    // End of variables declaration//GEN-END:variables

}
