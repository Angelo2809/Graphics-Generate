
package desenhar.linhaxy;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.swing.*;

public class DesenharLinhaXY extends javax.swing.JFrame {

   public Graphics g;
   public int tam = 0;
   public int x[], y[];
   public char eq[];
   
   
   
    public DesenharLinhaXY() {
        setTitle("Sei la");
        setSize(640,480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        initComponents();
        g = tela.getGraphics();
        tela.paintComponents(g);
        
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        xTxt = new javax.swing.JTextField();
        eqTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tela = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("principal");
        setBackground(new java.awt.Color(200, 200, 200));
        setPreferredSize(new java.awt.Dimension(640, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("Adicionar x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gerar Gráfico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("X");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("Equação de primeiro grau");

        tela.setBackground(new java.awt.Color(255, 255, 255));
        tela.setPreferredSize(new java.awt.Dimension(240, 300));

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Angelo Queiroz");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("SL3002705");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X", "Y"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4))
                    .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(xTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //tela.repaint();
        int number_rows = jTable3.getRowCount();
        if(number_rows >= 2){
            jLabel5.setText("");
            quadriculado(g);
            base(g);
            
        int xmin = Integer.parseInt(jTable3.getValueAt(0, 0).toString());
        int ymin  = Integer.parseInt(jTable3.getValueAt(0, 1).toString());
        int xmax = Integer.parseInt(jTable3.getValueAt(0, 0).toString());
        int ymax = Integer.parseInt(jTable3.getValueAt(0, 1).toString());
        for( int i = 0; i < number_rows; i++){
            if(Integer.parseInt(jTable3.getValueAt(i, 0).toString()) > xmax){
                xmax = Integer.parseInt(jTable3.getValueAt(i, 0).toString());
            }
            else if (Integer.parseInt(jTable3.getValueAt(i, 0).toString()) < xmin){
                xmin = Integer.parseInt(jTable3.getValueAt(i, 0).toString());
            }
            
            if(Integer.parseInt(jTable3.getValueAt(i, 1).toString()) > ymax){
                ymax = Integer.parseInt(jTable3.getValueAt(i,1).toString());
            }
            else if (Integer.parseInt(jTable3.getValueAt(i, 1).toString()) < ymin){
                ymin = Integer.parseInt(jTable3.getValueAt(i,1).toString());
            }
        }
        linha(g, xmin, ymin, xmax, ymax);
        }else{
            jLabel5.setText("Precisa de mais ponto");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        jLabel5.setText("");
        try{
       DefaultTableModel dtmPanel = (DefaultTableModel) jTable3.getModel();
       var yInsert = eqTxt.getText();
       var xInsert = xTxt.getText();
       yInsert = yInsert.replace(" ", "");
       if(!yInsert.startsWith("y=")){
           throw new Exception("Nao corresponde a formula y = ax + c");
       }
       yInsert = yInsert.substring(2);
       int a = yInsert.indexOf('x');
       int aNumber = Integer.parseInt(yInsert.substring(0, a));
       int cNumber = Integer.parseInt(yInsert.substring(a+1));
       int result = aNumber * Integer.parseInt(xInsert) + cNumber;
       Object[] dados = {xInsert, Integer.toString(result)}; 
       dtmPanel.addRow(dados);
       }
       catch(RuntimeException e){
           jLabel5.setText("Nao corresponde a formula y = ax + c");
       } catch (Exception ex) { // do not starts with y=
           jLabel5.setText("Nao inicia com y =");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       g.dispose();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(DesenharLinhaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesenharLinhaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesenharLinhaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesenharLinhaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesenharLinhaXY().setVisible(true);
              
            }
        });
        
    }
    
    public void quadriculado(java.awt.Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(1));
        
        for (int x=0; x<240; x=x+10)
            for (int y=0; y<300; y=y+10)
        {
            g2.drawLine(x, y, 240-x, y);
             
        }
        for (int y=0; y<300; y=y+10)
            for (int x=0; x<240; x=x+10)
        {
            g2.drawLine(x, y, x, 300-y);
             
        }
        
    }
    
    public void base(java.awt.Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(0, 160, 240, 160);
        g2.drawLine(100, 0, 100, 300);
        
        // y
        g2.drawString("1", 90, 145);
        g2.drawString("2", 90, 125);
        g2.drawString("3", 90, 105);
        g2.drawString("4", 90, 85);
        g2.drawString("5", 90, 65);
        g2.drawString("6", 90, 45);
        g2.drawString("7", 90, 25);
        
        // -y 
        g2.drawString("-1", 87, 185);
        g2.drawString("-2", 87, 205);
        g2.drawString("-3", 87, 225);
        g2.drawString("-4", 87, 245);
        g2.drawString("-5", 87, 265);
        g2.drawString("-6", 87, 285);
        
        // x
         g2.drawString("1", 115, 170);
        g2.drawString("2", 135, 170);
        g2.drawString("3", 155, 170);
        g2.drawString("4", 175, 170);
        g2.drawString("5", 195, 170);
        g2.drawString("6", 215, 170);
        g2.drawString("7", 235, 170);
        
        // -x
        g2.drawString("-1", 75, 170);
        g2.drawString("-2", 55, 170);
        g2.drawString("-3", 35, 170);
        g2.drawString("-4", 15, 170);
        
        
    }
    
    public void linha(java.awt.Graphics g, int x1, int y1, int x2, int y2){
        g.setColor(Color.blue);
        g.drawLine(x1*20 +100, (-y1*20)+160, x2*20 +100, (-y2 * 20)+160);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eqTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel tela;
    private javax.swing.JTextField xTxt;
    // End of variables declaration//GEN-END:variables
}
