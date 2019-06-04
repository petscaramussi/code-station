package javinha.capitulo3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javinha.capitulo2.*;
import javax.swing.JOptionPane;
import javinha.Javinha;
import javinha.capitulo1.JavaCapitulo1;

/**
 *
 * @author archwinlinu
 */
public class JavaCapitulo3 extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public JavaCapitulo3() {
        setUndecorated(true);
        initComponents();
        setSize(810, 580);
        setLocationRelativeTo(null);
        setTitle("Inicio");
        setResizable(false);
        setDefaultCloseOperation(JavaCapitulo3.EXIT_ON_CLOSE);
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
        Voltar = new javax.swing.JLabel();
        Fechar = new javax.swing.JLabel();
        Superior = new javax.swing.JLabel();
        PanelLateral = new javax.swing.JPanel();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        Separador3 = new javax.swing.JSeparator();
        Capitulo1 = new javax.swing.JLabel();
        Capitulo2 = new javax.swing.JLabel();
        Capitulo3 = new javax.swing.JLabel();
        PanelTexto = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        Texto4 = new javax.swing.JLabel();
        Texto5 = new javax.swing.JLabel();
        Texto6 = new javax.swing.JLabel();
        Texto7 = new javax.swing.JLabel();
        Texto8 = new javax.swing.JLabel();
        Texto9 = new javax.swing.JLabel();
        Texto10 = new javax.swing.JLabel();
        Texto11 = new javax.swing.JLabel();
        Texto12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        Voltar.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Voltar.setForeground(new java.awt.Color(171, 171, 171));
        Voltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Voltar.setText("<");
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });
        PanelMain.add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

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

        PanelLateral.setBackground(new java.awt.Color(255, 255, 255));
        PanelLateral.setForeground(new java.awt.Color(240, 240, 240));

        Capitulo1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Capitulo1.setForeground(new java.awt.Color(248, 152, 29));
        Capitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Capitulo1.setText("Capítulo 1");
        Capitulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Capitulo1MouseClicked(evt);
            }
        });

        Capitulo2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Capitulo2.setForeground(new java.awt.Color(248, 152, 29));
        Capitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Capitulo2.setText("Capítulo 2");

        Capitulo3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Capitulo3.setForeground(new java.awt.Color(248, 152, 29));
        Capitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Capitulo3.setText("Capítulo 3");
        Capitulo3.setEnabled(false);
        Capitulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Capitulo3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLateralLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(PanelLateralLayout.createSequentialGroup()
                        .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Capitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Capitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Capitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(Capitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Capitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Capitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        PanelMain.add(PanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 270, 560));

        PanelTexto.setBackground(new java.awt.Color(255, 255, 255));

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java2.png"))); // NOI18N

        Texto1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Texto1.setForeground(new java.awt.Color(248, 152, 29));
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto1.setText("Capítulo 3");
        Texto1.setToolTipText("");

        Texto2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto2.setText("Ouvi dizer que haveria objetos. No Capítulo 1, colocamos todo o código");
        Texto2.setToolTipText("");

        Texto3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto3.setText("no método main( ). Essa não exatamente uma abordagem orientada o objetos");
        Texto3.setToolTipText("");

        Texto4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto4.setText("Na verdade ela definitivamente não é orientada a objetos. Bem, usamos");
        Texto4.setToolTipText("");

        Texto5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto5.setText("alguns objetos, mas não desenvolvemos nenhum tipo de objeto por nossa ");
        Texto5.setToolTipText("");

        Texto6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto6.setText("própria conta. Portanto, agora temos que deixar esse universo procedimental");
        Texto6.setToolTipText("");

        Texto7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto7.setText("Seguidores devotados surgiram, enquanto os programadores combatiam os ");
        Texto7.setToolTipText("");

        Texto8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto8.setText("para trás, sair de main( ) e começar a criar alguns objetos por nossa ");
        Texto8.setToolTipText("");

        Texto9.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto9.setText("própria conta. Examinaremos o que torna o desenvolvimento orientado a ");
        Texto9.setToolTipText("");

        Texto10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto10.setText("objetos (OO) em java tão divertido. Discutiremos a diferença entre uma");
        Texto10.setToolTipText("");

        Texto11.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto11.setText("para fazer até o mesmo applet mais simples funcionar. Mas você pode");
        Texto11.setToolTipText("");

        Texto12.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Texto12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto12.setText("classe e um objeto. Examinaremos como os objetos podem melhorar sua vida");
        Texto12.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelTextoLayout = new javax.swing.GroupLayout(PanelTexto);
        PanelTexto.setLayout(PanelTextoLayout);
        PanelTextoLayout.setHorizontalGroup(
            PanelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Texto12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PanelTextoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelTextoLayout.setVerticalGroup(
            PanelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelMain.add(PanelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 540, 560));

        getContentPane().add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));
        PanelMain.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        // TODO add your handling code here:
        Javinha j = new Javinha();
        j.show();
        this.hide();
    }//GEN-LAST:event_VoltarMouseClicked

    private void FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FecharMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperiorMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_SuperiorMousePressed

    private void SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperiorMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_SuperiorMouseDragged

    private void Capitulo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Capitulo1MouseClicked
        // TODO add your handling code here:
        JavaCapitulo1 j2 = new JavaCapitulo1();
        j2.show();
        this.hide();
    }//GEN-LAST:event_Capitulo1MouseClicked

    private void Capitulo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Capitulo3MouseClicked
           // TODO add your handling code here:
           JOptionPane.showMessageDialog(null, "Este capítulo ainda não está disponível\nSentimos muito");
    }//GEN-LAST:event_Capitulo3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        JavaChecklist3 j = new JavaChecklist3();
        j.show();
        this.hide();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(JavaCapitulo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCapitulo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCapitulo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCapitulo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JavaCapitulo3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Capitulo1;
    private javax.swing.JLabel Capitulo2;
    private javax.swing.JLabel Capitulo3;
    private javax.swing.JLabel Fechar;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelTexto;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private javax.swing.JLabel Superior;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto10;
    private javax.swing.JLabel Texto11;
    private javax.swing.JLabel Texto12;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Texto4;
    private javax.swing.JLabel Texto5;
    private javax.swing.JLabel Texto6;
    private javax.swing.JLabel Texto7;
    private javax.swing.JLabel Texto8;
    private javax.swing.JLabel Texto9;
    private javax.swing.JLabel Voltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
