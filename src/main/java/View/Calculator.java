package View;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculator() {
        setVisible(true);
        setResizable(false);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        setTitle("Standard Calculator");
        jtx.setEditable(false);
        jtxacu.setEditable(false);
        jtxop.setEditable(false);
        jbtnsum.setActionCommand("addition");
        jbtnsub.setActionCommand("substract");
        jbtnmul.setActionCommand("multiply");
        jbtndiv.setActionCommand("division");
        jbtnequ.setActionCommand("equals");
        jbtn0.setActionCommand("0");
        jbtn1.setActionCommand("1");
        jbtn2.setActionCommand("2");
        jbtn3.setActionCommand("3");
        jbtn4.setActionCommand("4");
        jbtn5.setActionCommand("5");
        jbtn6.setActionCommand("6");
        jbtn7.setActionCommand("7");
        jbtn8.setActionCommand("8");
        jbtn9.setActionCommand("9");
        jbtnpoint.setActionCommand("point");
        jbtnclear.setActionCommand("clear");
        jtxop.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtx = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnsum = new javax.swing.JButton();
        jbtnsub = new javax.swing.JButton();
        jbtnmul = new javax.swing.JButton();
        jbtndiv = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnequ = new javax.swing.JButton();
        jtxacu = new javax.swing.JTextField();
        jtxop = new javax.swing.JTextField();
        jbtnpoint = new javax.swing.JButton();
        jbtnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtn1.setText("1");

        jbtn2.setText("2");

        jbtn3.setText("3");

        jbtn4.setText("4");

        jbtn5.setText("5");

        jbtn6.setText("6");

        jbtn7.setText("7");

        jbtn8.setText("8");

        jbtn9.setText("9");

        jbtnsum.setText("+");

        jbtnsub.setText("-");

        jbtnmul.setText("*");
        jbtnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmulActionPerformed(evt);
            }
        });

        jbtndiv.setText("/");

        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnequ.setText("=");

        jtxacu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxacuActionPerformed(evt);
            }
        });

        jtxop.setText("...");
        jtxop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxopActionPerformed(evt);
            }
        });

        jbtnpoint.setText(".");
        jbtnpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpointActionPerformed(evt);
            }
        });

        jbtnclear.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtx)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnpoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtnsum, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbtnequ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxacu, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxop)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxacu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtnsum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnpoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnequ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxacuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxacuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxacuActionPerformed

    private void jbtnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnmulActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jtxopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxopActionPerformed

    private void jbtnpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnpointActionPerformed

    public JButton getJbtn0() {
        return jbtn0;
    }

    public void setJbtn0(JButton jbtn0) {
        this.jbtn0 = jbtn0;
    }

    public JButton getJbtn1() {
        return jbtn1;
    }

    public void setJbtn1(JButton jbtn1) {
        this.jbtn1 = jbtn1;
    }

    public JButton getJbtn2() {
        return jbtn2;
    }

    public void setJbtn2(JButton jbtn2) {
        this.jbtn2 = jbtn2;
    }

    public JButton getJbtn3() {
        return jbtn3;
    }

    public void setJbtn3(JButton jbtn3) {
        this.jbtn3 = jbtn3;
    }

    public JButton getJbtn4() {
        return jbtn4;
    }

    public void setJbtn4(JButton jbtn4) {
        this.jbtn4 = jbtn4;
    }

    public JButton getJbtn5() {
        return jbtn5;
    }

    public void setJbtn5(JButton jbtn5) {
        this.jbtn5 = jbtn5;
    }

    public JButton getJbtn6() {
        return jbtn6;
    }

    public void setJbtn6(JButton jbtn6) {
        this.jbtn6 = jbtn6;
    }

    public JButton getJbtn7() {
        return jbtn7;
    }

    public void setJbtn7(JButton jbtn7) {
        this.jbtn7 = jbtn7;
    }

    public JButton getJbtn8() {
        return jbtn8;
    }

    public void setJbtn8(JButton jbtn8) {
        this.jbtn8 = jbtn8;
    }

    public JButton getJbtn9() {
        return jbtn9;
    }

    public void setJbtn9(JButton jbtn9) {
        this.jbtn9 = jbtn9;
    }

    public JButton getJbtndiv() {
        return jbtndiv;
    }

    public void setJbtndiv(JButton jbtndiv) {
        this.jbtndiv = jbtndiv;
    }

    public JButton getJbtnequ() {
        return jbtnequ;
    }

    public void setJbtnequ(JButton jbtnequ) {
        this.jbtnequ = jbtnequ;
    }

    public JButton getJbtnmul() {
        return jbtnmul;
    }

    public void setJbtnmul(JButton jbtnmul) {
        this.jbtnmul = jbtnmul;
    }

    public JButton getJbtnsub() {
        return jbtnsub;
    }

    public void setJbtnsub(JButton jbtnsub) {
        this.jbtnsub = jbtnsub;
    }

    public JButton getJbtnsum() {
        return jbtnsum;
    }

    public void setJbtnsum(JButton jbtnsum) {
        this.jbtnsum = jbtnsum;
    }

    public JTextField getJtx() {
        return jtx;
    }

    public void setJtx(JTextField jtx) {
        this.jtx = jtx;
    }

    public JTextField getJtxacu() {
        return jtxacu;
    }

    public void setJtxacu(JTextField jtxacu) {
        this.jtxacu = jtxacu;
    }

    public JTextField getJtxop() {
        return jtxop;
    }

    public void setJtxop(JTextField jtxop) {
        this.jtxop = jtxop;
    }

    public JButton getJbtnpoint() {
        return jbtnpoint;
    }

    public void setJbtnpoint(JButton jbtnpoint) {
        this.jbtnpoint = jbtnpoint;
    }

    public JButton getJbtnclear() {
        return jbtnclear;
    }

    public void setJbtnclear(JButton jbtnclear) {
        this.jbtnclear = jbtnclear;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnclear;
    private javax.swing.JButton jbtndiv;
    private javax.swing.JButton jbtnequ;
    private javax.swing.JButton jbtnmul;
    private javax.swing.JButton jbtnpoint;
    private javax.swing.JButton jbtnsub;
    private javax.swing.JButton jbtnsum;
    private javax.swing.JTextField jtx;
    private javax.swing.JTextField jtxacu;
    private javax.swing.JTextField jtxop;
    // End of variables declaration//GEN-END:variables
}
