
import java.awt.Color;
import javax.swing.JOptionPane;


public class ServerUI extends javax.swing.JFrame {
    
    MyServer serverobj;
    boolean isserverrunning=false;

    public ServerUI() {
        initComponents();
        setSize(600,300);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbstop = new javax.swing.JButton();
        jbstart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 50, 180, 30);

        jbstop.setText("STOP");
        jbstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstopActionPerformed(evt);
            }
        });
        getContentPane().add(jbstop);
        jbstop.setBounds(310, 140, 140, 40);

        jbstart.setText("START");
        jbstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstartActionPerformed(evt);
            }
        });
        getContentPane().add(jbstart);
        jbstart.setBounds(140, 140, 140, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstartActionPerformed
       
        
// TODO add your handling code here:

  try{
      if(isserverrunning)
      {
          JOptionPane.showMessageDialog(this,"Server is already running");
      }
      else
      {
           serverobj = new MyServer(9000);
           jLabel1.setText("Server Started...");
           jLabel1.setForeground(Color.GREEN);
           isserverrunning=true;

      }      
        } 
        catch(Exception ex)
        {
            ex.printStackTrace(); 
            JOptionPane.showMessageDialog(this, ex.toString());
            
        }
    }//GEN-LAST:event_jbstartActionPerformed

    private void jbstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstopActionPerformed
        // TODO add your handling code here:
        
        serverobj.shutdown();
        jLabel1.setText("Server Stopped");
        jLabel1.setForeground(Color.RED);
        isserverrunning=false;

    }//GEN-LAST:event_jbstopActionPerformed

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
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbstart;
    private javax.swing.JButton jbstop;
    // End of variables declaration//GEN-END:variables
}
