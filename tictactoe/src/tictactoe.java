
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANISH
 */
public class tictactoe extends javax.swing.JFrame {

    /**
     * Creates new form tictactoe
     */
    public tictactoe() {
        initComponents();
    }
     int turn =2;
     int buttonused[]={0,0,0,0,0,0,0,0,0};
     int pl1[]={0,0,0,0,0,0,0,0,0};
     int pl2[]={0,0,0,0,0,0,0,0,0};
     
     
      int winner1()
     {
       if(pl1[0]==1 && pl1[1]==1 && pl1[2]==1) 
       {
           return 1;
           
       }
       if(pl1[3]==1 && pl1[4]==1 && pl1[5]==1) 
       {
           return 1;
           
       }
       if(pl1[6]==1 && pl1[7]==1 && pl1[8]==1) 
       {
           return 1;
           
       }
       if(pl1[0]==1 && pl1[3]==1 && pl1[6]==1) 
       {
           return 1;
           
       }
       if(pl1[1]==1 && pl1[4]==1 && pl1[7]==1) 
       {
           return 1;
           
       }
       if(pl1[2]==1 && pl1[5]==1 && pl1[8]==1) 
       {
           return 1;
           
       }
       if(pl1[0]==1 && pl1[5]==1 && pl1[8]==1) 
       {
           return 1;
           
       }
       if(pl1[2]==1 && pl1[4]==1 && pl1[6]==1) 
       {
           return 1;
           
       }
       
       return 0;
     }
      
      
      
      int winner2()
     {
       if(pl2[0]==1 && pl2[1]==1 && pl2[2]==1) 
       {
           return 1;
           
       }
       if(pl2[3]==1 && pl2[4]==1 && pl2[5]==1) 
       {
           return 1;
           
       }
       if(pl2[6]==1 && pl2[7]==1 && pl2[8]==1) 
       {
           return 1;
           
       }
       if(pl2[0]==1 && pl2[3]==1 && pl2[6]==1) 
       {
           return 1;
           
       }
       if(pl2[1]==1 && pl2[4]==1 && pl2[7]==1) 
       {
           return 1;
           
       }
       if(pl2[2]==1 && pl2[5]==1 && pl2[8]==1) 
       {
           return 1;
           
       }
       if(pl2[0]==1 && pl2[5]==1 && pl2[8]==1) 
       {
           return 1;
           
       }
       if(pl2[2]==1 && pl2[4]==1 && pl2[6]==1) 
       {
           return 1;
           
       }
       
       return 0;
     }
      
       int win1 = winner1();
       int win2 = winner2();
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        lblturn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel2.setText("wohooo!!!! winner wins...");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setPreferredSize(new java.awt.Dimension(1031, 707));
        setSize(new java.awt.Dimension(1025, 631));
        getContentPane().setLayout(null);

        start.setBackground(new java.awt.Color(0, 153, 153));
        start.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 18)); // NOI18N
        start.setText("start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start);
        start.setBounds(150, 310, 131, 60);

        bt1.setBackground(new java.awt.Color(0, 204, 204));
        bt1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(530, 150, 131, 117);

        bt2.setBackground(new java.awt.Color(0, 204, 204));
        bt2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(670, 150, 131, 117);

        bt3.setBackground(new java.awt.Color(0, 204, 204));
        bt3.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(810, 150, 131, 117);

        bt6.setBackground(new java.awt.Color(0, 204, 204));
        bt6.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6);
        bt6.setBounds(810, 270, 131, 117);

        bt5.setBackground(new java.awt.Color(0, 204, 204));
        bt5.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5);
        bt5.setBounds(670, 270, 131, 117);

        bt4.setBackground(new java.awt.Color(0, 204, 204));
        bt4.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4);
        bt4.setBounds(530, 270, 131, 117);

        bt7.setBackground(new java.awt.Color(0, 204, 204));
        bt7.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt7);
        bt7.setBounds(530, 390, 131, 117);

        bt8.setBackground(new java.awt.Color(0, 204, 204));
        bt8.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        getContentPane().add(bt8);
        bt8.setBounds(670, 390, 131, 117);

        bt9.setBackground(new java.awt.Color(0, 204, 204));
        bt9.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        getContentPane().add(bt9);
        bt9.setBounds(810, 390, 131, 117);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("TIC-TAC-TOE by ~MP~");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 36, 470, 80);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Player 1 ~'X' :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 166, 150, 30);
        getContentPane().add(txt2);
        txt2.setBounds(220, 230, 170, 40);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Player 2 ~ 'O' :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 230, 160, 30);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1);
        txt1.setBounds(220, 160, 170, 40);

        reset.setBackground(new java.awt.Color(0, 153, 153));
        reset.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 18)); // NOI18N
        reset.setText("Play Again");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(680, 540, 131, 60);

        lblturn.setFont(new java.awt.Font("Heebo", 3, 18)); // NOI18N
        getContentPane().add(lblturn);
        lblturn.setBounds(210, 420, 90, 100);

        jLabel6.setFont(new java.awt.Font("Heebo", 3, 18)); // NOI18N
        jLabel6.setText("Turn");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(71, 416, 90, 100);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        String p1=txt1.getText();
        String p2=txt2.getText();
        
       
    }//GEN-LAST:event_startActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        if(buttonused[4]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
            bt5.setText("X");
            lblturn.setText("player 1");
            buttonused[4]=1;
            pl1[4]=1; 
             
            
            if(win1==1)
            {
                JOptionPane.showMessageDialog(rootPane," player 1 won");

            }

            else if(win2==1)    
            {
            JOptionPane.showMessageDialog(rootPane,"player 2 won");
            
            }
            else{
            turn++;
            lblturn.setText("player 2");
            bt5.setText("O");
            buttonused[4]=1;
            pl2[0]=1;
            }
        }
        }
        else
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                }   
    }//GEN-LAST:event_bt5ActionPerformed
    
    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        if(buttonused[3]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
           lblturn.setText("player 1"); 
            bt4.setText("X");
            buttonused[3]=1;
           pl1[3]=1;
            
        }
        else{
            turn++;
            lblturn.setText("player 2");
            bt4.setText("O");
               buttonused[3]=1;
               pl2[3]=1;
        }
        }
        else
        
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                    
                 }              
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
         if(buttonused[6]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
            lblturn.setText("player 1");
            bt7.setText("X");
            buttonused[6]=1;
           pl1[6]=1;
            
        }
        else{
            turn++;
            lblturn.setText("player 2");
            bt7.setText("O");
               buttonused[6]=1;
               pl2[6]=1;
        }
        }
        else
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                    
    }              
        
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
        if(buttonused[7]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
           lblturn.setText("player 1"); 
            bt8.setText("X");
            buttonused[7]=1;
           pl1[7]=1;
            
        }
        else{
            turn++;
            lblturn.setText("player 2");
            bt8.setText("O");
               buttonused[7]=1;
               pl1[7]=1;
        }
        }
        else
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                    
    }              
        
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
         if(buttonused[0]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
           lblturn.setText("player 1"); 
            bt1.setText("X");
            buttonused[0]=1;
           pl1[0]=1;
            
        }
        else{
            turn++;
            lblturn.setText("player 2");
            bt1.setText("O");
               buttonused[0]=1;
               pl2[0]=1;
        }
        }
        else
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                    
    }              
        
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
         if(buttonused[8]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
            lblturn.setText("player 1");
            bt9.setText("X");
            buttonused[8]=1;
           pl1[8]=1;
            
        }
        else{
            turn++;
           lblturn.setText("player 2"); 
            bt9.setText("O");
               buttonused[8]=1;
               pl2[8]=1;
        }
        }
        else
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                    
    }              
        
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        if(buttonused[2]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
            lblturn.setText("player 1");
            bt3.setText("X");
            buttonused[2]=1;
           pl1[2]=1;
            
        }
        else{
            turn++;
            lblturn.setText("player 2");
            bt3.setText("O");
               buttonused[2]=1;
               pl2[2]=1;
        }
        }
        else
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                    
    }              
        
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
        if(buttonused[5]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
            lblturn.setText("player 1");
            bt6.setText("X");
            buttonused[5]=1;
           pl1[5]=1;
            
        }
        else{
            turn++;
            lblturn.setText("player 2");
            bt6.setText("O");
               buttonused[5]=1;
               pl2[5]=1;
        }
        }
        else
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                    
    }              
        
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        if(buttonused[1]==0)
        {
            
        
        if(turn%2==1)
        {
            turn++;
           lblturn.setText("name1"); 
            bt2.setText("X");
            buttonused[1]=1;
           pl1[1]=1;
            
        }
        else{
            turn++;
            lblturn.setText("player 2");
            bt2.setText("O");
               buttonused[1]=1;
               pl2[1]=1;
        }
        }
        else
                {
                    JOptionPane.showMessageDialog(rootPane, "please select another cell");
                    
    }              
        
    }//GEN-LAST:event_bt2ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        turn=2;
        
         bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        
        
        for(int i =0;i<10;i++)
        {
        buttonused[i]=0;
        pl1[i]=0;
        pl2[i]=0;
        }
       
        
    }//GEN-LAST:event_resetActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
        String name1 = txt1.getText();
    }//GEN-LAST:event_txt1ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblturn;
    private javax.swing.JButton reset;
    private javax.swing.JButton start;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
