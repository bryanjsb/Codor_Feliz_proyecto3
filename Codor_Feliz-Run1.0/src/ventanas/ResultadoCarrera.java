package ventanas;

import Logica.Carrera;
import Logica.Codorniz;
import Logica.RegistroCarreras;
import java.util.ArrayList;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class ResultadoCarrera extends javax.swing.JFrame {

    Carrera carrera;

    public ResultadoCarrera() {
        initComponents();

    }

    public ResultadoCarrera(Carrera carrera) {

        this();
        this.carrera = carrera;
        actualizarTablaCarrera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_resultado = new javax.swing.JTable();
        btn_salir = new javax.swing.JButton();
        btn_nuevaCarrera = new javax.swing.JButton();
        img_trofeo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resultados");
        setLocationByPlatform(true);

        jTable_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Posicion", "ID Codorniz", "Nombre Codorniz", "Dueño", "Tiempo"
            }
        ));
        jScrollPane1.setViewportView(jTable_resultado);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btn_salir.setText("Salir del programa");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_nuevaCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar.png"))); // NOI18N
        btn_nuevaCarrera.setText("Nueva Carrera");
        btn_nuevaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaCarreraActionPerformed(evt);
            }
        });

        img_trofeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trofeo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(img_trofeo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_salir)
                            .addComponent(btn_nuevaCarrera))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(img_trofeo)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btn_nuevaCarrera)
                .addGap(50, 50, 50)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaCarreraActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_nuevaCarreraActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void actualizarTablaCarrera() {
        DefaultTableModel modelo = new DefaultTableModel(null,
                new String[]{
                    "Posicion", "ID Codorniz", "Nombre Codorniz", "Dueño", "Tiempo"
                });

        ArrayList<Codorniz> lista = carrera.getCodornices();
        Codorniz ptr;
        Object[] vec = null;

        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(vec);
            ptr = lista.get(i);

            modelo.setValueAt(ptr.getId(), i, 1);
            modelo.setValueAt(ptr.getNombre(), i, 2);
            modelo.setValueAt(ptr.getDueño(), i, 3);
            modelo.setValueAt(ptr.getTiempo(), i, 4);

        }

        modelo.setValueAt("Ganador, 1°", 0, 0);
        modelo.setValueAt("2°", 1, 0);
        modelo.setValueAt("3°", 2, 0);
        modelo.setValueAt("4°", 3, 0);
        modelo.setValueAt("5°", 4, 0);

        this.jTable_resultado.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nuevaCarrera;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel img_trofeo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_resultado;
    // End of variables declaration//GEN-END:variables
}
