package ventanas;

public class paginaPrincipal extends javax.swing.JFrame {

    public paginaPrincipal() {
        initComponents();
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
        jPanel_RegistroCarrera = new javax.swing.JPanel();
        jPanel_ResultadoCarrera = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel_titulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel_titulo.setText("Codor Feliz Run 1-0");

        ima_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N

        ima_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/codorniz.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_RegistroCodornizLayout = new javax.swing.GroupLayout(jPanel_RegistroCodorniz);
        jPanel_RegistroCodorniz.setLayout(jPanel_RegistroCodornizLayout);
        jPanel_RegistroCodornizLayout.setHorizontalGroup(
            jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        jPanel_RegistroCodornizLayout.setVerticalGroup(
            jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        jTabbedPane_Principal.addTab("Registro Codornices", jPanel_RegistroCodorniz);

        javax.swing.GroupLayout jPanel_RegistroCarreraLayout = new javax.swing.GroupLayout(jPanel_RegistroCarrera);
        jPanel_RegistroCarrera.setLayout(jPanel_RegistroCarreraLayout);
        jPanel_RegistroCarreraLayout.setHorizontalGroup(
            jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
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
            .addGap(0, 927, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane_Principal)
                    .addComponent(jSeparator1))
                .addContainerGap(66, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ima_logo1;
    private javax.swing.JLabel ima_logo2;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel_RegistroCarrera;
    private javax.swing.JPanel jPanel_RegistroCodorniz;
    private javax.swing.JPanel jPanel_ResultadoCarrera;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane_Principal;
    // End of variables declaration//GEN-END:variables
}
