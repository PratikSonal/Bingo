
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class FinalGame extends javax.swing.JFrame {
    static int win=0;
    static int bb;
    static int uuu=1;
    static int maxb=75;
    static int minb=1;
    static int loopb=0;
    static int countb=0;
    static int[] arrb=new int[75];
    /**
     * Creates new form FinalGame
     */
    public FinalGame() {
        initComponents();
    }
    boolean checkb(int z){
        loopb++;
        if(loopb==1){
            arrb[0]=z;
        }
        else{
            for(int i=0;i<25;i++){
                if(z==arrb[i]){
                    return false;
                }
            }
            countb++;
            arrb[countb]=z;
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(280, 60, 100, 80);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Your Number:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(244, 10, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Backgroundforcall.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 0, 200, 260);

        jButton27.setText("Start the Call Board");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);
        jButton27.setBounds(40, 100, 130, 30);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FREE");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(330, 210, 40, 20);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(320, 170, 73, 23);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(320, 130, 73, 23);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(320, 250, 73, 23);

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(320, 300, 73, 23);

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(410, 210, 80, 23);

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(510, 210, 80, 23);

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(220, 210, 80, 23);

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(130, 210, 80, 23);

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(410, 170, 80, 23);

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(510, 170, 79, 23);

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);
        jButton11.setBounds(410, 130, 79, 23);

        jButton12.setText("jButton12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(510, 130, 79, 23);

        jButton13.setText("jButton13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(410, 250, 79, 23);

        jButton14.setText("jButton14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(510, 250, 79, 23);

        jButton15.setText("jButton15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);
        jButton15.setBounds(410, 300, 79, 23);

        jButton16.setText("jButton16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);
        jButton16.setBounds(510, 300, 79, 23);

        jButton17.setText("jButton17");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);
        jButton17.setBounds(220, 170, 79, 23);

        jButton18.setText("jButton18");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);
        jButton18.setBounds(220, 130, 79, 23);

        jButton19.setText("jButton19");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);
        jButton19.setBounds(220, 250, 79, 23);

        jButton20.setText("jButton20");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);
        jButton20.setBounds(220, 300, 79, 23);

        jButton21.setText("jButton21");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);
        jButton21.setBounds(130, 170, 79, 23);

        jButton22.setText("jButton22");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);
        jButton22.setBounds(130, 130, 79, 23);

        jButton23.setText("jButton23");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23);
        jButton23.setBounds(130, 250, 79, 23);

        jButton24.setText("jButton24");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);
        jButton24.setBounds(130, 300, 79, 23);

        jLabel4.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BINGO!");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(200, 80, 310, 40);

        jButton25.setText("REFRESH THE BINGO CARD");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25);
        jButton25.setBounds(60, 50, 560, 23);

        jButton26.setText("Call Bingo!");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26);
        jButton26.setBounds(300, 350, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Background.jpg")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        while(uuu<=24){
            bb=minb+(int)(Math.random()*(maxb-minb+1));
            if(checkb(bb)){
            switch(uuu){
            case 1: jButton1.setText(Integer.toString(bb));
                    break;
            case 2: jButton2.setText(Integer.toString(bb));
                    break;
            case 3: jButton3.setText(Integer.toString(bb));
                    break;
            case 4: jButton4.setText(Integer.toString(bb));
                    break;
            case 5: jButton5.setText(Integer.toString(bb));
                    break;
            case 6: jButton6.setText(Integer.toString(bb));
                    break;
            case 7: jButton7.setText(Integer.toString(bb));
                    break;
            case 8: jButton8.setText(Integer.toString(bb));
                    break;
            case 9: jButton9.setText(Integer.toString(bb));
                    break;
            case 10: jButton10.setText(Integer.toString(bb));
                    break;
            case 11: jButton11.setText(Integer.toString(bb));
                    break;
            case 12: jButton12.setText(Integer.toString(bb));
                    break;
            case 13: jButton13.setText(Integer.toString(bb));
                    break;
            case 14: jButton14.setText(Integer.toString(bb));
                    break;
            case 15: jButton15.setText(Integer.toString(bb));
                    break;
            case 16: jButton16.setText(Integer.toString(bb));
                    break;
            case 17: jButton17.setText(Integer.toString(bb));
                    break;
            case 18: jButton18.setText(Integer.toString(bb));
                    break;
            case 19: jButton19.setText(Integer.toString(bb));
                    break;
            case 20: jButton20.setText(Integer.toString(bb));
                    break;
            case 21: jButton21.setText(Integer.toString(bb));
                    break;
            case 22: jButton22.setText(Integer.toString(bb));
                    break;
            case 23: jButton23.setText(Integer.toString(bb));
                    break;
            case 24: jButton24.setText(Integer.toString(bb));
                    break;
            default: JOptionPane.showMessageDialog(rootPane,"Over");
            }
        uuu++;
            }
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton22.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton18.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton2.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton11.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton12.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton21.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton17.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton1.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton9.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton10.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton8.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton7.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton5.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton6.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton23.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton19.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton3.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton13.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton14.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton24.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton20.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton4.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton15.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(jButton16.getText())){
            jButton1.setText("X");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "False click \n You Lose");
            Lose ll=new Lose();
            ll.setVisible(true);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.err.println(e);
            }
        jTextField1.setText(Integer.toString(17));
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        win++;
    }//GEN-LAST:event_jButton26ActionPerformed

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
            java.util.logging.Logger.getLogger(FinalGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
