package ventanas;

import Logica.Carrera;
import Logica.Codorniz;
import Logica.RegistroCarreras;
import Logica.RegistroCodornices;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class paginaPrincipal extends javax.swing.JFrame {

    RegistroCodornices registroCodornices;
    RegistroCarreras registroCarreras;
    Carrera carrera;

    public paginaPrincipal() {
        initComponents();

        carrera = new Carrera();
        registroCodornices = RegistroCodornices.obtenerInstancia();
        registroCarreras = RegistroCarreras.obtenerInstancia();

        inicializarValores();
        registroCodornices.cargar();
        //registroCarreras.cargar();
        
        actualizarTablaCodorniz();
        inicializarResultadosCarrera();
    }

    private void inicializarResultadosCarrera(){
        
        ta_infoCarreras.setText(registroCarreras.toString());
        
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
        btn_eliminarCodorniz = new javax.swing.JButton();
        jPanel_RegistroCarrera = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_idCodornizCarrera = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_infoCodorCarrera = new javax.swing.JTextArea();
        btn_buscarCodornizCarrera = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_codornicesCarrera = new javax.swing.JTable();
        btn_iniciarCarrera = new javax.swing.JButton();
        btn_agregarCodornizCarrera = new javax.swing.JButton();
        tf_idCarrera = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel_ResultadoCarrera = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_infoCarreras = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Codor Feliz 1.0");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel_titulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel_titulo.setText("Codor Feliz Run 1.0");

        ima_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N

        ima_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/codorniz.png"))); // NOI18N

        jTable_listaCodornices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        btn_agregarCodorniz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btn_agregarCodorniz.setText("Agregar");
        btn_agregarCodorniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCodornizActionPerformed(evt);
            }
        });

        jLabel8.setText("Buscar:");

        btn_buscarCodorniz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btn_buscarCodorniz.setText("Buscar");
        btn_buscarCodorniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarCodornizActionPerformed(evt);
            }
        });

        btn_eliminarCodorniz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btn_eliminarCodorniz.setText("Eliminar");
        btn_eliminarCodorniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarCodornizActionPerformed(evt);
            }
        });

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
                .addContainerGap(359, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RegistroCodornizLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_eliminarCodorniz)
                .addGap(433, 433, 433))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btn_agregarCodorniz)
                .addGap(18, 18, 18)
                .addGroup(jPanel_RegistroCodornizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_buscarCodorniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarCodorniz))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarCodorniz)
                .addGap(14, 14, 14))
        );

        jTabbedPane_Principal.addTab("Registro Codornices", jPanel_RegistroCodorniz);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Carreras de codornices:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Agregar Codorniz:");

        jLabel11.setText("Identificación del codorniz:");

        tf_idCodornizCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idCodornizCarreraActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Informacion del codorniz:");

        ta_infoCodorCarrera.setColumns(20);
        ta_infoCodorCarrera.setRows(5);
        jScrollPane2.setViewportView(ta_infoCodorCarrera);

        btn_buscarCodornizCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btn_buscarCodornizCarrera.setText("Buscar");
        btn_buscarCodornizCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarCodornizCarreraActionPerformed(evt);
            }
        });

        jTable_codornicesCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Codorniz", "Nombre Codorniz", "Peso", "Nombre Dueño"
            }
        ));
        jScrollPane3.setViewportView(jTable_codornicesCarrera);

        btn_iniciarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar.png"))); // NOI18N
        btn_iniciarCarrera.setText("Iniciar Carrera");
        btn_iniciarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarCarreraActionPerformed(evt);
            }
        });

        btn_agregarCodornizCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btn_agregarCodornizCarrera.setText("Agregar Codorniz");
        btn_agregarCodornizCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCodornizCarreraActionPerformed(evt);
            }
        });

        tf_idCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idCarreraActionPerformed(evt);
            }
        });

        jLabel13.setText("Identificación Carrera:");

        javax.swing.GroupLayout jPanel_RegistroCarreraLayout = new javax.swing.GroupLayout(jPanel_RegistroCarrera);
        jPanel_RegistroCarrera.setLayout(jPanel_RegistroCarreraLayout);
        jPanel_RegistroCarreraLayout.setHorizontalGroup(
            jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                .addGroup(jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                                .addGroup(jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_idCodornizCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscarCodornizCarrera)
                                .addGap(96, 96, 96))
                            .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_idCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btn_agregarCodornizCarrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RegistroCarreraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_iniciarCarrera)
                .addGap(428, 428, 428))
        );
        jPanel_RegistroCarreraLayout.setVerticalGroup(
            jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                .addGroup(jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_RegistroCarreraLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_idCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_RegistroCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tf_idCodornizCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscarCodornizCarrera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregarCodornizCarrera)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_iniciarCarrera)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane_Principal.addTab("Registro de Carreras", jPanel_RegistroCarrera);

        ta_infoCarreras.setColumns(20);
        ta_infoCarreras.setRows(5);
        jScrollPane4.setViewportView(ta_infoCarreras);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Historico de las carreras:");

        javax.swing.GroupLayout jPanel_ResultadoCarreraLayout = new javax.swing.GroupLayout(jPanel_ResultadoCarrera);
        jPanel_ResultadoCarrera.setLayout(jPanel_ResultadoCarreraLayout);
        jPanel_ResultadoCarreraLayout.setHorizontalGroup(
            jPanel_ResultadoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel_ResultadoCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(716, Short.MAX_VALUE))
        );
        jPanel_ResultadoCarreraLayout.setVerticalGroup(
            jPanel_ResultadoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ResultadoCarreraLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel14)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane_Principal.addTab("Resultados de las carreras", jPanel_ResultadoCarrera);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane_Principal)
                    .addComponent(jSeparator1))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(ima_logo2)
                .addGap(18, 18, 18)
                .addComponent(ima_logo1)
                .addGap(90, 90, 90))
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
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarCodornizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCodornizActionPerformed
        String nombre = tf_nombreCodorniz.getText();
        int edad = Integer.parseInt(tf_edadCodorniz.getText());
        String especie = cb_especieCodorniz.getSelectedItem().toString();
        double peso = Double.parseDouble(tf_pesoCodorniz.getText());
        int id = Integer.parseInt(tf_identificacionCodorniz.getText());
        String nombreDueño = tf_DueñoCodorniz.getText();

        try {

            if (registroCodornices.existe(id)) {
                throw new Exception("El codorniz ya existe, intente nuevamente");
            }

            Codorniz codor = new Codorniz(id, nombre, edad, especie, peso, nombreDueño);
            System.out.println(codor);
            codor.guardar();
            actualizarTablaCodorniz();

        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_btn_agregarCodornizActionPerformed

    private void btn_eliminarCodornizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarCodornizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarCodornizActionPerformed

    private void btn_buscarCodornizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarCodornizActionPerformed

        int id = Integer.parseInt(tf_buscarCodorniz.getText());

        try {

            if (!registroCodornices.existe(id)) {
                throw new Exception("El codorniz con el ID: " + id + " no existe");
            }
            Codorniz codor = registroCodornices.obtener(id);

            tf_identificacionCodorniz.setText(String.valueOf(codor.getId()));
            tf_nombreCodorniz.setText(String.valueOf(codor.getNombre()));
            tf_edadCodorniz.setText(String.valueOf(codor.getEdad()));
            tf_pesoCodorniz.setText(String.valueOf(codor.getPeso()));
            tf_DueñoCodorniz.setText(String.valueOf(codor.getDueño()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_buscarCodornizActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        registroCodornices.guardar();
    }//GEN-LAST:event_formWindowClosing

    private void tf_idCodornizCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idCodornizCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idCodornizCarreraActionPerformed

    private void btn_buscarCodornizCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarCodornizCarreraActionPerformed
        int id = Integer.parseInt(tf_idCodornizCarrera.getText());

        try {
            if (!registroCodornices.existe(id)) {
                throw new Exception("El codorniz con el ID: " + id + " no existe");
            }
            Codorniz codor = registroCodornices.obtener(id);
            ta_infoCodorCarrera.setText(codor.InfoCodorniz());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_buscarCodornizCarreraActionPerformed

    private void btn_iniciarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarCarreraActionPerformed
        //carrera.setId(Integer.parseInt(tf_idCarrera.getText()));
         RegistroCarreras.obtenerInstancia().agregar(carrera);
        JFrame resultado = new ResultadoCarrera(carrera);
        resultado.setVisible(true);

    }//GEN-LAST:event_btn_iniciarCarreraActionPerformed

    private void btn_agregarCodornizCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCodornizCarreraActionPerformed
        int idCodorniz = Integer.parseInt(tf_idCodornizCarrera.getText());
        
         try {
            if (!registroCodornices.existe(idCodorniz) ) {
                throw new Exception("El codorniz con el ID: " + idCodorniz + " no existe, intente nuevamente");
            }
            if( carrera.existe(idCodorniz)){
                throw new Exception("El codorniz con el ID: " + idCodorniz + " ya fue agregado, intente nuevamente");
            }
            
            Codorniz codor = registroCodornices.obtener(idCodorniz);
            
            try{
                if(carrera.jugadoresCompletos()){
                    throw new Exception("La lista de jugadores esta completo iniciar carrera");
                }
                carrera.agregar(codor);
            }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
        actualizarTablaCarrera();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
    }//GEN-LAST:event_btn_agregarCodornizCarreraActionPerformed

    private void tf_idCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idCarreraActionPerformed

    private void actualizarTablaCarrera() {
        DefaultTableModel modelo = new DefaultTableModel(null,
                new String[]{
                    "ID Codorniz", "Nombre Codorniz", "Peso", "Nombre Dueño"
                });

        ArrayList<Codorniz> lista = carrera.getCodornices();
        Codorniz ptr;
        Object[] vec = null;

        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(vec);
            ptr = lista.get(i);

            modelo.setValueAt(ptr.getId(), i, 0);
            modelo.setValueAt(ptr.getNombre(), i, 1);
            modelo.setValueAt(ptr.getPeso(), i, 2);
            modelo.setValueAt(ptr.getDueño(), i, 3);

        }

        this.jTable_codornicesCarrera.setModel(modelo);
    }

    private void actualizarTablaCodorniz() {
        DefaultTableModel modelo = new DefaultTableModel(null,
                new String[]{
                    "Identificación", "Nombre", "Edad", "Especie", "Peso", "Dueño"
                });

        ArrayList<Codorniz> lista = registroCodornices.listar();

        Codorniz ptr;
        Object[] vec = null;
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(vec);
            ptr = lista.get(i);
            modelo.setValueAt(ptr.getId(), i, 0);
            modelo.setValueAt(ptr.getNombre(), i, 1);
            modelo.setValueAt(ptr.getEdad(), i, 2);
            modelo.setValueAt(ptr.getEspecie(), i, 3);
            modelo.setValueAt(ptr.getPeso(), i, 4);
            modelo.setValueAt(ptr.getDueño(), i, 5);

        }

        this.jTable_listaCodornices.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarCodorniz;
    private javax.swing.JButton btn_agregarCodornizCarrera;
    private javax.swing.JButton btn_buscarCodorniz;
    private javax.swing.JButton btn_buscarCodornizCarrera;
    private javax.swing.JButton btn_eliminarCodorniz;
    private javax.swing.JButton btn_iniciarCarrera;
    private javax.swing.JComboBox<String> cb_especieCodorniz;
    private javax.swing.JLabel ima_logo1;
    private javax.swing.JLabel ima_logo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel_RegistroCarrera;
    private javax.swing.JPanel jPanel_RegistroCodorniz;
    private javax.swing.JPanel jPanel_ResultadoCarrera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane_Principal;
    private javax.swing.JTable jTable_codornicesCarrera;
    private javax.swing.JTable jTable_listaCodornices;
    private javax.swing.JTextArea ta_infoCarreras;
    private javax.swing.JTextArea ta_infoCodorCarrera;
    private javax.swing.JTextField tf_DueñoCodorniz;
    private javax.swing.JTextField tf_buscarCodorniz;
    private javax.swing.JTextField tf_edadCodorniz;
    private javax.swing.JTextField tf_idCarrera;
    private javax.swing.JTextField tf_idCodornizCarrera;
    private javax.swing.JTextField tf_identificacionCodorniz;
    private javax.swing.JTextField tf_nombreCodorniz;
    private javax.swing.JTextField tf_pesoCodorniz;
    // End of variables declaration//GEN-END:variables
}
