package ventanas;


public class paginaPrincipal extends javax.swing.JFrame {

    public paginaPrincipal() {
        initComponents();
        inicializarValores();
    }

    private void inicializarValores() {
        String[] listaEspecies = {"Codorniz Común", "Codorniz japonesa Isabelle",
            "Codorniz japonesa Tuxedo", "Codorniz bobwhite", "Codorniz Texas White",
            "Codorniz de Gambel", "Codorniz de Montaña", "Codorniz California Valley",
            "Codorniz ocelada", "Codorniz escamosa", "Codorniz norteña",};

        for (String especie : listaEspecies) {
            cb_especieCodorniz.addItem(especie);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        ima_logo1 = new javax.swing.JLabel();
        ima_logo2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane_Principal = new javax.swing.JTabbedPane();
        jPanel_RegistroCodorniz = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_listaCodornices = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_agregarCodorniz = new javax.swing.JButton();
        tf_identificacionCodorniz = new javax.swing.JTextField();
        tf_nombreCodorniz = new javax.swing.JTextField();
        tf_edadCodorniz = new javax.swing.JTextField();
        cb_especieCodorniz = new javax.swing.JComboBox<>();
        tf_pesoCodorniz = new javax.swing.JTextField();
        tf_DueñoCodorniz = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_buscarCodorniz = new javax.swing.JTextField();
        btn_buscarCodorniz = new javax.swing.JButton();
        jPanel_RegistroCarrera = new javax.swing.JPanel();
        jPanel_ResultadoCarrera = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Codor Feliz 1.0");
        setLocationByPlatform(true);

        jLabel_titulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel_titulo.setText("Codor Feliz Run 1.0");

        ima_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N

        ima_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/codorniz.png"))); // NOI18N

        jTable_listaCodornices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombre", "Edad", "Especie", "Peso", "Dueño"
            }
        ));
        jScrollPane1.setViewportView(jTable_listaCodornices);

        jLabel1.setText("Numero de Identificación:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Edad:");

        jLabel4.setText("Especie:");

        jLabel5.setText("Peso:");

        jLabel6.setText("Nombre del Dueño:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Agregar Codorniz:");

        btn_agregarCodorniz.setText("Agregar");
        btn_agregarCodorniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCodornizActionPerformed(evt);
            }
        });

        tf_identificacionCodorniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_identificacionCodornizActionPerformed(evt);
            }
        });

        cb_especieCodorniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_especieCodornizActionPerformed(evt);
            }
        });

        tf_DueñoCodorniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_DueñoCodornizActionPerformed(evt);
            }
        });

        jLabel8.setText("Buscar:");

        tf_buscarCodorniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_buscarCodornizActionPerformed(evt);
            }
        });

        btn_buscarCodorniz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btn_buscarCodorniz.setText("Buscar");

        javax.swing.GroupLayout jPanel_RegistroCodornizLayout = new javax.swing.GroupLayout(jPanel_RegistroCodorniz);
        jPanel_RegistroCodorniz.setLayout(jPanel_RegistroCodornizLayout);
        jPanel_RegistroCodornizLayout.setHorizontalGroup(
            jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel_RegistroCodornizLayout.createSequentialGroup()
                .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RegistroCodornizLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7))
                    .addGroup(jPanel_RegistroCodornizLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_buscarCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarCodorniz))
                    .addGroup(jPanel_RegistroCodornizLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_edadCodorniz, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(tf_nombreCodorniz, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_identificacionCodorniz, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_RegistroCodornizLayout.createSequentialGroup()
                                .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_especieCodorniz, 0, 192, Short.MAX_VALUE)
                                    .addComponent(tf_pesoCodorniz)
                                    .addComponent(tf_DueñoCodorniz)))
                            .addGroup(jPanel_RegistroCodornizLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btn_agregarCodorniz)))))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel_RegistroCodornizLayout.setVerticalGroup(
            jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RegistroCodornizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(tf_identificacionCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_especieCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombreCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pesoCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(tf_edadCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_DueñoCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_agregarCodorniz)
                .addGap(18, 18, 18)
                .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_buscarCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarCodorniz))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane_Principal.addTab("Registro Codornices", jPanel_RegistroCodorniz);

        javax.swing.GroupLayout jPanel_RegistroCarreraLayout = new javax.swing.GroupLayout(jPanel_RegistroCarrera);
        jPanel_RegistroCarrera.setLayout(jPanel_RegistroCarreraLayout);
        jPanel_RegistroCarreraLayout.setHorizontalGroup(
            jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
        );
        jPanel_RegistroCarreraLayout.setVerticalGroup(
            jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        jTabbedPane_Principal.addTab("Registro de Carreras", jPanel_RegistroCarrera);

        javax.swing.GroupLayout jPanel_ResultadoCarreraLayout = new javax.swing.GroupLayout(jPanel_ResultadoCarrera);
        jPanel_ResultadoCarrera.setLayout(jPanel_ResultadoCarreraLayout);
        jPanel_ResultadoCarreraLayout.setHorizontalGroup(
            jPanel_ResultadoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
        );
        jPanel_ResultadoCarreraLayout.setVerticalGroup(
            jPanel_ResultadoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        jTabbedPane_Principal.addTab("Resultados de las carreras", jPanel_ResultadoCarrera);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(ima_logo2)
                .addGap(18, 18, 18)
                .addComponent(ima_logo1)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane_Principal)
                    .addComponent(jSeparator1))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ima_logo2)
                        .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ima_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarCodornizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCodornizActionPerformed
        
    }//GEN-LAST:event_btn_agregarCodornizActionPerformed

    private void tf_identificacionCodornizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_identificacionCodornizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_identificacionCodornizActionPerformed

    private void tf_DueñoCodornizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_DueñoCodornizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_DueñoCodornizActionPerformed

    private void cb_especieCodornizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_especieCodornizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_especieCodornizActionPerformed

    private void tf_buscarCodornizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_buscarCodornizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_buscarCodornizActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarCodorniz;
    private javax.swing.JButton btn_buscarCodorniz;
    private javax.swing.JComboBox<String> cb_especieCodorniz;
    private javax.swing.JLabel ima_logo1;
    private javax.swing.JLabel ima_logo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel_RegistroCarrera;
    private javax.swing.JPanel jPanel_RegistroCodorniz;
    private javax.swing.JPanel jPanel_ResultadoCarrera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane_Principal;
    private javax.swing.JTable jTable_listaCodornices;
    private javax.swing.JTextField tf_DueñoCodorniz;
    private javax.swing.JTextField tf_buscarCodorniz;
    private javax.swing.JTextField tf_edadCodorniz;
    private javax.swing.JTextField tf_identificacionCodorniz;
    private javax.swing.JTextField tf_nombreCodorniz;
    private javax.swing.JTextField tf_pesoCodorniz;
    // End of variables declaration//GEN-END:variables
}
