/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Srijan
 */
public class DebitandCredit extends javax.swing.JFrame {

    /**
     * Creates new form DebitandCredit
     */
    public DebitandCredit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        submit1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        submit2 = new javax.swing.JButton();
        getbal = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("Enter ID :");

        tid.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Enter Credit Amount :");

        t1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        submit1.setText("Submit");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Enter Debit Amount :");

        t2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        submit2.setText("Submit");
        submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit2ActionPerformed(evt);
            }
        });

        getbal.setText("Get Balance");
        getbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getbalActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getbal)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(submit2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submit1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(home)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getbal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submit1)
                        .addGap(3, 3, 3)
                        .addComponent(submit2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(reset)
                        .addGap(18, 18, 18)
                        .addComponent(home)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getbalActionPerformed
        // TODO add your handling code here:
        Connection con;
        Statement st;
        ResultSet rs;
        String bal="";
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clients","root","");
            st=con.createStatement();
            rs=st.executeQuery("select balance from records where cl_id='"+tid.getText()+"';");
            while(rs.next())
            {
                bal=rs.getString(1);                
            }
            if(bal=="")
            {
                JOptionPane.showMessageDialog(this,"Record does not exist");
            }
            else
            {
                ta.setText("Current Balance : Rs "+bal);
            }
        }
        catch(Exception e)
        {
                
        }
    }//GEN-LAST:event_getbalActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        // TODO add your handling code here:
        Connection con;
        Statement st;
        ResultSet rs;
        String bal=new String();
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clients","root","");
            st=con.createStatement();
            rs=st.executeQuery("select balance from records where cl_id='"+tid.getText()+"';");
            while(rs.next())
            {
                bal=rs.getString(1);          
            }
            int b=Integer.parseInt(bal);
            int c=Integer.parseInt(t1.getText());
            b=b+c;
            st.executeUpdate("update records set balance='"+String.valueOf(b)+"',credit='"+t1.getText()+"' where cl_id='"+tid.getText()+"';");
            ta.setText("Balance : Rs "+String.valueOf(b));
            JOptionPane.showMessageDialog(this,"Balance Updated");
        }
        catch(Exception e)
        {
                
        }
    }//GEN-LAST:event_submit1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        tid.setText("");
        t1.setText("");
        t2.setText("");
        ta.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit2ActionPerformed
        // TODO add your handling code here:
        Connection con;
        Statement st;
        ResultSet rs2;
        String bal=new String();
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clients","root","");
            st=con.createStatement();
            rs2=st.executeQuery("select balance from records where cl_id='"+tid.getText()+"';");
            while(rs2.next())
            {
                bal=rs2.getString(1);          
            }
            int b=Integer.parseInt(bal);
            int d=Integer.parseInt(t2.getText());
            b=b-d;
            st.executeUpdate("update records set balance='"+String.valueOf(b)+"',debit='"+t2.getText()+"' where cl_id='"+tid.getText()+"';");
            ta.setText("Balance : Rs "+String.valueOf(b));
            JOptionPane.showMessageDialog(this,"Balance Updated");
        }
        catch(Exception e2)
        {
                JOptionPane.showMessageDialog(this,e2);
        }
    }//GEN-LAST:event_submit2ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Home ob=new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getbal;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit1;
    private javax.swing.JButton submit2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tid;
    // End of variables declaration//GEN-END:variables
}
