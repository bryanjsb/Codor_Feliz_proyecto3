package ventanas;

import Logica.Carrera;
import Logica.Codorniz;
import java.util.ArrayList;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        btn_salir.setText("Salir");

        btn_nuevaCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar.png"))); // NOI18N
        btn_nuevaCarrera.setText("Nueva Carrea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btn_nuevaCarrera))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btn_nuevaCarrera)
                .addGap(42, 42, 42)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

            modelo.setValueAt("posicion", i, 0);
            modelo.setValueAt(ptr.getId(), i, 1);
            modelo.setValueAt(ptr.getNombre(), i, 2);
            modelo.setValueAt(ptr.getDueño(), i, 3);
            modelo.setValueAt(ptr.getTiempo(), i, 4);

        }
        
        this.jTable_resultado.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nuevaCarrera;
    private javax.swing.JButton btn_salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_resultado;
    // End of variables declaration//GEN-END:variables
}
