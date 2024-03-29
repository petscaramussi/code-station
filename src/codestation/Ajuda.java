/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codestation;

import codestation.desenvolvedores.ConhecendoDevs;
import codestation.desenvolvedores.ContatoDev;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author archwinlinu
 */
public class Ajuda extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Ajuda() {
        setUndecorated(true);
        initComponents();
        setSize(810, 580);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(Ajuda.EXIT_ON_CLOSE);
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
        Minimizar = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        Fechar = new javax.swing.JLabel();
        Superior = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Texto5 = new javax.swing.JLabel();
        Texto6 = new javax.swing.JLabel();
        Texto7 = new javax.swing.JLabel();
        Texto8 = new javax.swing.JLabel();
        Texto9 = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        Imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 580));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(810, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMain.setBackground(new java.awt.Color(255, 255, 255));
        PanelMain.setMinimumSize(new java.awt.Dimension(810, 580));
        PanelMain.setPreferredSize(new java.awt.Dimension(810, 580));
        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(171, 171, 171));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setText("-");
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        PanelMain.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 20, 20));

        Help.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Help.setForeground(new java.awt.Color(171, 171, 171));
        Help.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Help.setText("<");
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
        });
        PanelMain.add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        Fechar.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Fechar.setForeground(new java.awt.Color(171, 171, 171));
        Fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fechar.setText("X");
        Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FecharMouseClicked(evt);
            }
        });
        PanelMain.add(Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 20, 20));

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
        PanelMain.add(Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Texto5.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        Texto5.setForeground(new java.awt.Color(111, 197, 216));
        Texto5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto5.setText("Gostaria de acessar o site do Code Station");
        Texto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Texto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Texto5MouseClicked(evt);
            }
        });

        Texto6.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        Texto6.setForeground(new java.awt.Color(111, 197, 216));
        Texto6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto6.setText("Gostaria de acessar o Git do Code Station");
        Texto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Texto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Texto6MouseClicked(evt);
            }
        });

        Texto7.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        Texto7.setForeground(new java.awt.Color(111, 197, 216));
        Texto7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto7.setText("Gostaria de obter mais informações sobre o software");
        Texto7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Texto7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Texto7MouseClicked(evt);
            }
        });

        Texto8.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        Texto8.setForeground(new java.awt.Color(111, 197, 216));
        Texto8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto8.setText("Gostaria de entrar em contato com os desenvolvedores");
        Texto8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Texto8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Texto8MouseClicked(evt);
            }
        });

        Texto9.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        Texto9.setForeground(new java.awt.Color(111, 197, 216));
        Texto9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto9.setText("Gostaria de conhecer os desenvolvedores");
        Texto9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Texto9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Texto9MouseClicked(evt);
            }
        });

        Texto1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto1.setForeground(new java.awt.Color(111, 197, 216));
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto1.setText("Outros (Desativado)");
        Texto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Texto1.setEnabled(false);
        Texto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Texto1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto5)
                .addGap(18, 18, 18)
                .addComponent(Texto6)
                .addGap(18, 18, 18)
                .addComponent(Texto7)
                .addGap(18, 18, 18)
                .addComponent(Texto8)
                .addGap(18, 18, 18)
                .addComponent(Texto9)
                .addGap(18, 18, 18)
                .addComponent(Texto1)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        PanelMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 570, 310));

        Texto2.setBackground(new java.awt.Color(111, 197, 216));
        Texto2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        Texto2.setForeground(new java.awt.Color(111, 197, 216));
        Texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto2.setText("Bem-vindo");
        PanelMain.add(Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, -1));

        Texto3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Texto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto3.setText("Como nós poderiamos te ajudar?");
        PanelMain.add(Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 790, -1));

        Imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/codestation.png"))); // NOI18N
        PanelMain.add(Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 790, -1));

        getContentPane().add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));
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
        System.exit(0);
    }//GEN-LAST:event_FecharMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        // TODO add your handling code here:
        Main m = new Main();
        m.show();
        this.hide();
    }//GEN-LAST:event_HelpMouseClicked

    private void Texto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Texto5MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            URI u = new URI("https://codestation.cf");
            java.awt.Desktop.getDesktop().browse(u);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Texto5MouseClicked

    private void Texto6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Texto6MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            URI u = new URI("https://github.com/dalacorte/code-station");
            java.awt.Desktop.getDesktop().browse(u);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Texto6MouseClicked

    private void Texto7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Texto7MouseClicked
        // TODO add your handling code here:
        InformacoesSoftware i = new InformacoesSoftware();
        i.show();
    }//GEN-LAST:event_Texto7MouseClicked

    private void Texto8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Texto8MouseClicked
        // TODO add your handling code here:
        ContatoDev c = new ContatoDev();
        c.show();
    }//GEN-LAST:event_Texto8MouseClicked

    private void Texto9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Texto9MouseClicked
        // TODO add your handling code here:
        ConhecendoDevs c = new ConhecendoDevs();
        c.show();
    }//GEN-LAST:event_Texto9MouseClicked

    private void Texto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Texto1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Função indisponível no momento\nSentimos muito");
    }//GEN-LAST:event_Texto1MouseClicked

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
            java.util.logging.Logger.getLogger(Ajuda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajuda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ajuda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fechar;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JLabel Superior;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Texto5;
    private javax.swing.JLabel Texto6;
    private javax.swing.JLabel Texto7;
    private javax.swing.JLabel Texto8;
    private javax.swing.JLabel Texto9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
