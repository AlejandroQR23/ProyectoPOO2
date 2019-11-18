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
    public Recepcion( String sucursal/* SUCURSAL */  ) { 
        initComponents();
        setLocationRelativeTo(null);
        
        /*  IF SUCURSAL 1.ShowInfo LABELS*/
        //Creamos el mediador
        LinkedList precios = new LinkedList();
        Lavanderia lv = new Lavanderia("Acoxpa","Acoxpa", precios);

        //Asociamos el mediador a los colaboradores
        Nota nota = new Nota( lv );
        Cliente cliente = new Cliente( "Lola Mento", "Av. Portuano", "7471673185" );

        //inicio de sesion
        cliente.iniciarSesion( lv );

        //imprimir nota
        try{
            nota.crearNota();
        } catch( IOException e ){
            System.out.println("");
        }
        
        /*
        IF SUCURSAL 2.ShowInfo LABELS
        IF SUCURSAL 3.ShowInfo LABELS
        */
    }

    private void PropiedadesTabla(){
        String titulo[] = {"Prendas", "Precio"};
        String list1[] = {"Prenda", "$100"};
        String list2[] = {"Prenda", "$100"};
        String list3[] = {"Prenda", "$100"};
        String list4[] = {"Prenda", "$100"};
        String list5[] = {"Prenda", "$100"};
        
        DefaultTableModel dtm = new DefaultTableModel(null, titulo){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return (columnas == 8)? true : false;
                
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicio");

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
            .add(ScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(panel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(panel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                new Recepcion( ""/* TIPO DE SUCURSAL */ ).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables

}
