/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codestation.desenvolvedores;

/**
 *
 * @author archwinlinu
 */
public class ContatoDev extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public ContatoDev() {
        setUndecorated(true);
        initComponents();
        setSize(410, 290);
        setLocationRelativeTo(null);
        setTitle("Inicio");
        setResizable(false);
        setDefaultCloseOperation(ContatoDev.EXIT_ON_CLOSE);
    }

    int xx, xy;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        Fechar = new javax.swing.JLabel();
        Superior = new javax.swing.JLabel();
        Texto5 = new javax.swing.JLabel();
        Texto7 = new javax.swing.JLabel();
        Texto8 = new javax.swing.JLabel();
        Texto9 = new javax.swing.JLabel();
        Texto10 = new javax.swing.JLabel();
        Texto11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(410, 290));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(410, 290));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMain.setBackground(new java.awt.Color(255, 255, 255));
        PanelMain.setMinimumSize(new java.awt.Dimension(410, 290));
        PanelMain.setPreferredSize(new java.awt.Dimension(410, 290));
        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fechar.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Fechar.setForeground(new java.awt.Color(171, 171, 171));
        Fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fechar.setText("X");
        Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FecharMouseClicked(evt);
            }
        });
        PanelMain.add(Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 20));

        Superior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/minimazaExpandeFecha.png"))); // NOI18N
        Superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                SuperiorMouseDragged(evt);
            }
        });
        Superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SuperiorMousePressed(evt);
            }
        });
        PanelMain.add(Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        Texto5.setBackground(new java.awt.Color(111, 197, 216));
        Texto5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto5.setText("baianorfudido@tocomsono.dormi");
        PanelMain.add(Texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 390, -1));

        Texto7.setBackground(new java.awt.Color(111, 197, 216));
        Texto7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto7.setText("victordalacorte@hotmail.com");
        PanelMain.add(Texto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 390, -1));

        Texto8.setBackground(new java.awt.Color(111, 197, 216));
        Texto8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto8.setText("juliofack007@hotmail.com");
        PanelMain.add(Texto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 390, -1));

        Texto9.setBackground(new java.awt.Color(111, 197, 216));
        Texto9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto9.setText("peterson.silva55@etec.sp.gov.br");
        PanelMain.add(Texto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 390, -1));

        Texto10.setBackground(new java.awt.Color(111, 197, 216));
        Texto10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto10.setText("guisantosfernandes14@gmail.com");
        PanelMain.add(Texto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 390, -1));

        Texto11.setBackground(new java.awt.Color(111, 197, 216));
        Texto11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto11.setText("caiocalado2009@gmail.com");
        PanelMain.add(Texto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 390, -1));

        getContentPane().add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 290));
        PanelMain.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperiorMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_SuperiorMousePressed

    private void SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperiorMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_SuperiorMouseDragged

    private void FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseClicked
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_FecharMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContatoDev.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContatoDev.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContatoDev.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContatoDev.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ContatoDev().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fechar;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JLabel Superior;
    private javax.swing.JLabel Texto10;
    private javax.swing.JLabel Texto11;
    private javax.swing.JLabel Texto5;
    private javax.swing.JLabel Texto7;
    private javax.swing.JLabel Texto8;
    private javax.swing.JLabel Texto9;
    // End of variables declaration//GEN-END:variables
}
