package javinha.capitulo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author archwinlinu
 */
public class JavaPergunta3 extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public JavaPergunta3() {
        setUndecorated(true);
        initComponents();
        setSize(810, 580);
        setLocationRelativeTo(null);
        setTitle("Inicio");
        setResizable(false);
        setDefaultCloseOperation(JavaPergunta3.EXIT_ON_CLOSE);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelMain = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Voltar = new javax.swing.JLabel();
        Fechar = new javax.swing.JLabel();
        Superior = new javax.swing.JLabel();
        PanelLateral = new javax.swing.JPanel();
        Separador2 = new javax.swing.JSeparator();
        Capitulo2 = new javax.swing.JLabel();
        PanelTexto = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Button1 = new javax.swing.JRadioButton();
        Button2 = new javax.swing.JRadioButton();
        Button3 = new javax.swing.JRadioButton();
        Button4 = new javax.swing.JRadioButton();
        Button5 = new javax.swing.JRadioButton();
        Button = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();

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

        Capitulo2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Capitulo2.setForeground(new java.awt.Color(248, 152, 29));
        Capitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Capitulo2.setText("Checklist");
        Capitulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Capitulo2MouseClicked(evt);
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
                        .addComponent(Capitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelLateralLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(Capitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        PanelMain.add(PanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 270, 560));

        PanelTexto.setBackground(new java.awt.Color(255, 255, 255));

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java2.png"))); // NOI18N

        Texto1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Texto1.setForeground(new java.awt.Color(248, 152, 29));
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto1.setText("Pergunta:");
        Texto1.setToolTipText("");

        Texto2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto2.setText("Assinale a alternativa incorreta em relação ao conceito");
        Texto2.setToolTipText("");

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Button1);
        Button1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Button1.setText("Uma Classe é uma instancia de um Objeto");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Button2);
        Button2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Button2.setText("Um Objeto é uma contrução de software que encpasula um comportamento");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Button3);
        Button3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Button3.setText("Uma classe define os atributos compartilhados por um tipo de objeto ");

        Button4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Button4);
        Button4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Button4.setText("Em uma linguagem POO, tudo é um objeto, desde os tipos mais básicos");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Button5);
        Button5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Button5.setText("Um código em Orientação a Objetos seria um código sem nenhuma instancia");

        Button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao2.png"))); // NOI18N
        Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonMouseClicked(evt);
            }
        });

        Texto3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Texto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto3.setText("de classe e objeto em programação Orientada a Objetos");
        Texto3.setToolTipText("");

        javax.swing.GroupLayout PanelTextoLayout = new javax.swing.GroupLayout(PanelTexto);
        PanelTexto.setLayout(PanelTextoLayout);
        PanelTextoLayout.setHorizontalGroup(
            PanelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTextoLayout.createSequentialGroup()
                .addGroup(PanelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTextoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Texto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Texto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelTextoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelTextoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Texto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelTextoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelTextoLayout.setVerticalGroup(
            PanelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button5)
                .addGap(90, 90, 90)
                .addComponent(Button)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        PanelMain.add(PanelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 540, 560));

        getContentPane().add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));
        PanelMain.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        // TODO add your handling code here:
        JavaCapitulo2 j = new JavaCapitulo2();
        j.show();
        this.hide();
    }//GEN-LAST:event_VoltarMouseClicked

    private void FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FecharMouseClicked

    private void ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMouseClicked
        // TODO add your handling code here:
        Resultado r = new Resultado();
        r.Alternativas(4, Button1.isSelected(),Button2.isSelected() ,Button2.isSelected() ,Button4.isSelected(),Button5.isSelected());
        if(r.isStatus() == true){
            this.hide();
        }
    }//GEN-LAST:event_ButtonMouseClicked

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

    private void Capitulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Capitulo2MouseClicked
        // TODO add your handling code here:
        JavaChecklist2 j = new JavaChecklist2();
        j.show();
        this.hide();
    }//GEN-LAST:event_Capitulo2MouseClicked

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2ActionPerformed

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
            java.util.logging.Logger.getLogger(JavaPergunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaPergunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaPergunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaPergunta3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JavaPergunta3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button;
    private javax.swing.JRadioButton Button1;
    private javax.swing.JRadioButton Button2;
    private javax.swing.JRadioButton Button3;
    private javax.swing.JRadioButton Button4;
    private javax.swing.JRadioButton Button5;
    private javax.swing.JLabel Capitulo2;
    private javax.swing.JLabel Fechar;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelTexto;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JLabel Superior;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
