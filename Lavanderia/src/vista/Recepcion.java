package vista;

import clases.*; // Clases
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * 
 */
public class Recepcion extends javax.swing.JFrame {
    
    String prendaSeleccionada;
    String colorPrenda;

    /** Crea nuevo formulario Sucursal */
    public Recepcion() { 
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTablaServicios();
        
        /*   Detalles esteticos   */
        labelInformacion.setText("___ BIEVENIDO ___");
        labelInformacion1.setText("Sucursal " + Principal.opcion);
        labelInformacion2.setText("Info. Tel. 1234567");
    }

    private void PropiedadesTablaServicios(){
        String titulo[] = {"  Prendas", "  Precio $"};
        /*   Mostrar los datos de la Sucursal en la tabla de Servicios   */
        String list1[] = {"Saco", Principal.precios.get("Saco")};
        String list2[] = {"Pantalon", Principal.precios.get("Pantalon")};
        String list3[] = {"Abrigo", Principal.precios.get("Abrigo")};
        String list4[] = {"Camisa", Principal.precios.get("Camisa")};
        String list5[] = {"Playera", Principal.precios.get("Playera")};
        String list6[] = {"Corbata", Principal.precios.get("Corbata")};
        String list7[] = {"Chamarra", Principal.precios.get("Chamarra")};
        
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
        dtm.addRow(list6);
        dtm.addRow(list7);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPedido = new javax.swing.JList<>();
        btnAgregarCarrito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        labelGenerarNota = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        labelNumeroNota = new javax.swing.JLabel();
        fieldNumeroNota = new javax.swing.JTextField();
        btnRecibir = new javax.swing.JButton();
        labelInformacion = new javax.swing.JLabel();
        labelInformacion1 = new javax.swing.JLabel();
        labelInformacion2 = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recepcion");
        setResizable(false);

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

        listaPedido.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        listaPedido.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Saco", "Pantalon", "Abrigo", "Camisa", "Playera", "Corbata", "Chamarra" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPedido.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPedido.setAutoscrolls(false);
        listaPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaPedido.setName("Seleccione"); // NOI18N
        listaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaPedido);

        btnAgregarCarrito.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnAgregarCarrito.setText("Agregar a carrito");
        btnAgregarCarrito.setEnabled(false);
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        jLabel1.setText("Seleccione prenda a agregar");

        org.jdesktop.layout.GroupLayout panel2Layout = new org.jdesktop.layout.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel2Layout.createSequentialGroup()
                .add(panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(ScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel1)
                    .add(panel2Layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panel2Layout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(btnAgregarCarrito, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel2Layout.createSequentialGroup()
                .add(ScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnAgregarCarrito)
                .add(34, 34, 34))
        );

        panel3.setBackground(new java.awt.Color(204, 255, 255));

        labelGenerarNota.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelGenerarNota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGenerarNota.setText("GENERAR PEDIDO");
        labelGenerarNota.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnGenerar.setBackground(new java.awt.Color(0, 153, 204));
        btnGenerar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar");
        btnGenerar.setEnabled(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panel3Layout = new org.jdesktop.layout.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelGenerarNota, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .add(btnGenerar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(25, 25, 25))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(labelGenerarNota, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnGenerar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(42, 42, 42))
        );

        panel4.setBackground(new java.awt.Color(255, 255, 255));
        panel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recepción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei Light", 1, 14))); // NOI18N

        labelNumeroNota.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        labelNumeroNota.setText("Ingrese # Nota:");

        fieldNumeroNota.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        fieldNumeroNota.setToolTipText("Enter para habilitar RECIBIR");
        fieldNumeroNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumeroNotaActionPerformed(evt);
            }
        });

        btnRecibir.setBackground(new java.awt.Color(0, 102, 102));
        btnRecibir.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnRecibir.setForeground(new java.awt.Color(255, 255, 255));
        btnRecibir.setText("Recibir");
        btnRecibir.setEnabled(false);
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });

        labelInformacion.setFont(new java.awt.Font("Microsoft YaHei Light", 2, 14)); // NOI18N
        labelInformacion.setText("Informacion");
        labelInformacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelInformacion1.setFont(new java.awt.Font("Microsoft YaHei Light", 2, 14)); // NOI18N
        labelInformacion1.setText("Informacion");
        labelInformacion1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelInformacion2.setFont(new java.awt.Font("Microsoft YaHei Light", 2, 14)); // NOI18N
        labelInformacion2.setText("Informacion");
        labelInformacion2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        org.jdesktop.layout.GroupLayout panel4Layout = new org.jdesktop.layout.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel4Layout.createSequentialGroup()
                .add(panel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panel4Layout.createSequentialGroup()
                        .add(35, 35, 35)
                        .add(btnRecibir))
                    .add(panel4Layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(fieldNumeroNota, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panel4Layout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(labelNumeroNota))
                    .add(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(labelInformacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(labelInformacion1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(labelInformacion2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel4Layout.createSequentialGroup()
                .add(77, 77, 77)
                .add(labelNumeroNota)
                .add(18, 18, 18)
                .add(fieldNumeroNota, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btnRecibir)
                .add(59, 59, 59)
                .add(labelInformacion)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(labelInformacion1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(labelInformacion2)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Logo.png"))); // NOI18N

        btnCerrarSesion.setBackground(new java.awt.Color(255, 51, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(panel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelLayout.createSequentialGroup()
                        .add(31, 31, 31)
                        .add(panel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panelLayout.createSequentialGroup()
                        .add(41, 41, 41)
                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(btnCerrarSesion, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(labelLogo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .add(18, 18, 18)
                .add(panel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelLayout.createSequentialGroup()
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panelLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(panel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(panel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(panelLayout.createSequentialGroup()
                        .add(45, 45, 45)
                        .add(btnCerrarSesion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(labelLogo)
                        .add(18, 18, 18)
                        .add(panel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(56, 56, 56)))
                .add(73, 73, 73))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 463, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        Cliente c = Principal.sucursal.getCliente();
        String nota = fieldNumeroNota.getText();
        c.recibirRopa( nota );
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        Cliente c = Principal.sucursal.getCliente();
        String cad = c.getUsuario(); 
        String nombre_nota = "";
        int user = 0;
        for( int i = 0; i < cad.length(); i++ ){
            user += (int) cad.codePointAt(i);
        }
        int num = (int) (Math.random() * 20 + 1);
        nombre_nota += user + Integer.toString( num );
        
        Nota nota = new Nota( Principal.sucursal, nombre_nota );
        try{
            nota.crearNota();
            JOptionPane.showMessageDialog(null, "Pedido realizado Nota #"+nombre_nota);
        } catch( IOException e ){
            JOptionPane.showMessageDialog(null, "Número de nota incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
        prendaSeleccionada = listaPedido.getSelectedValue();
        colorPrenda = JOptionPane.showInputDialog("Ingresa el color de "+prendaSeleccionada+":");
        
        /*   Si ingreso el color   */
        if (colorPrenda != null){
            btnGenerar.setEnabled(true);
            Cliente c = Principal.sucursal.getCliente();
            float precio = Float.parseFloat( Principal.precios.get( prendaSeleccionada ) );
            c.seleccionarPrenda( prendaSeleccionada, colorPrenda, precio );
            JOptionPane.showMessageDialog(null, "Agregado al carrito :)");
        }
        
    }//GEN-LAST:event_btnAgregarCarritoActionPerformed

    private void listaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPedidoMouseClicked
        btnAgregarCarrito.setEnabled(true);
    }//GEN-LAST:event_listaPedidoMouseClicked

    private void fieldNumeroNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumeroNotaActionPerformed
        btnRecibir.setEnabled( true );
    }//GEN-LAST:event_fieldNumeroNotaActionPerformed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        Login log = new Login();
        log.setVisible( true );
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

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
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnRecibir;
    private javax.swing.JTextField fieldNumeroNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelGenerarNota;
    private javax.swing.JLabel labelInformacion;
    private javax.swing.JLabel labelInformacion1;
    private javax.swing.JLabel labelInformacion2;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNumeroNota;
    private javax.swing.JList<String> listaPedido;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    // End of variables declaration//GEN-END:variables

}
