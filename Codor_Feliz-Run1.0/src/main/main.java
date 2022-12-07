package main;

import ventanas.paginaPrincipal;

public class main {

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new paginaPrincipal().setVisible(true);
        });
    }

}


/*  

Referencias:

https://youtu.be/9zntX01nkvA
https://www.youtube.com/watch?v=2ZXiuh0rg3M&list=PLWtYZ2ejMVJkjOuTCzIk61j7XKfpIR74K
https://www.arquitecturajava.com/java-finally-y-el-cierre-de-recursos/
https://www.ionos.es/digitalguide/paginas-web/desarrollo-web/patron-singleton/
https://www.ecodeup.com/como-escribir-y-leer-archivos-de-texto-plano-en-java/
https://www.delftstack.com/es/howto/java/java-relative-path/
https://www.programiz.com/java-programming/bufferedwriter
https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

 */
