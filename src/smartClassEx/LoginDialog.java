/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginDialog.java
 *
 * Created on May 29, 2014, 7:32:47 PM
 */
package smartClassEx;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import smartDB.Common;
import smartDB.DBWrapper;
import javax.swing.UIManager.*;

// Variables declaration - do not modify                     
/**
 *
 * @author JITHIN.P
 */
public class LoginDialog extends javax.swing.JDialog implements ActionListener
{

    /** Creates new form LoginDialog */
    public LoginDialog(java.awt.Frame parent, boolean modal) 
    {
       
        super(parent, modal);
        initComponents();
        //DBWrapper.initDBWrapper(); 
        initDialog(); 
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        domainComboBox = new javax.swing.JComboBox();
        userComboBox = new javax.swing.JComboBox();
        loginPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("The SmartClassEx");
        setName("loginDialog"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                loginDialogWindowOpened(evt);
            }
        });

        okButton.setText("OK");
        okButton.setMaximumSize(new java.awt.Dimension(65, 25));
        okButton.setMinimumSize(new java.awt.Dimension(65, 25));
        okButton.setPreferredSize(new java.awt.Dimension(65, 25));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.setPreferredSize(new java.awt.Dimension(65, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Domain");

        jLabel2.setText("User");

        jLabel3.setText("Password");

        domainComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Devoloper", "User" }));
        domainComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domainComboBoxActionPerformed(evt);
            }
        });

        userComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        loginPassword.setText("ioBlitz");
        loginPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addComponent(userComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE)
                    .addComponent(loginPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(domainComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domainComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

       String sDomain = String.valueOf(domainComboBox.getSelectedItem()) ; 
       String sUser = String.valueOf(userComboBox.getSelectedItem()) ; 
       String sPassword = loginPassword.getText();
       if(true ==DBWrapper.isValidPassword(sDomain,sUser,sPassword))
       {
            loginPassword.setForeground(Color.GREEN);
            this.hide();
            SmartClassMain smartClassMain = new SmartClassMain();
            smartClassMain.setVisible(true);
            
       }
       else
       {
           loginPassword.setForeground(Color.RED);
       }
    }//GEN-LAST:event_okButtonActionPerformed

    private void domainComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domainComboBoxActionPerformed
   
  String sDomain = String.valueOf(domainComboBox.getSelectedItem()) ; 
  if(sDomain!=null)
  {
      String[] sUsers=   DBWrapper.getUsers(sDomain );
      userComboBox.removeAllItems();
      int nI=0;
       if(null!=sUsers)
       {
           while(nI<sUsers.length)
           {
               if(null!=sUsers[nI])
               {
                    userComboBox.addItem(sUsers[nI]);
               }
              nI++;
           } 
       }
      
  }
        
    }//GEN-LAST:event_domainComboBoxActionPerformed

    private void loginDialogWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_loginDialogWindowOpened
        // TODO add your handling code here:
         
    }//GEN-LAST:event_loginDialogWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
 WindowEvent windowEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING );
 processWindowEvent(windowEvent);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void loginPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPasswordKeyTyped
        // TODO add your handling code here:
        loginPassword.setForeground(Color.BLACK);
    }//GEN-LAST:event_loginPasswordKeyTyped

    // Override JFrame implementation to exit if the close operation is set
// to EXIT_ON_CLOSE
@Override
protected void processWindowEvent(WindowEvent windowEvent) 
{
   
    if (WindowEvent.WINDOW_CLOSING == windowEvent.getID()  )
    {
      if(MessageResult.NO  == MessageBox.showMessage( this,"Do you really want to exit?","The new smartClassEx",JOptionPane.YES_NO_OPTION,MessageType.CONFIRM))
      {
         return;
      }
      else
      {
          System.exit(0);
      }
    }
    super.processWindowEvent(windowEvent);
    
}
 


 private void initDialog()
 {
     domainComboBox.setSelectedIndex(2); 
 }
 
     @Override
     protected void dialogInit()
     {    
         super.dialogInit();
     }
             
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        UIBlitz.setUIBlitz(false);
        UIBlitz.setLookAndFeelInfo(UIBlitz.NIMBUS);
        LoginDialog loginDialog = new LoginDialog(new javax.swing.JFrame(), true);
        Common.setPosition(loginDialog);
        loginDialog.setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox domainComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox userComboBox;
    // End of variables declaration//GEN-END:variables
}