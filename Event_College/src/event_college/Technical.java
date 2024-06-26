/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package event_college;

import dao.ConnectionProvider;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rajathemantdeore
 */
public class Technical extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Technical
     */
    Choice cCodeno;
    JTable table;
    JButton search,back,cancel,register;
    
    
    Technical()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Search by Event Code : ");
        heading.setBounds(20, 40, 150, 20);
        add(heading);
        
        cCodeno=new Choice();
        cCodeno.setBounds(180,40,150,20);
        add(cCodeno);
        
        try{
            Connection con = ConnectionProvider.getCon(); 
            PreparedStatement ps = con.prepareStatement("select * from addEvent where type='Tech'");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                cCodeno.add(rs.getString("code"));
            }
       }
        catch(Exception e)
        {
           e.printStackTrace();
        }
        
        table=new JTable();
        
         try{
            Connection con = ConnectionProvider.getCon(); 
            PreparedStatement ps = con.prepareStatement("select * from addEvent where type='Tech'");
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
         
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);
        
        search=new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);
        
       
        
        back=new JButton("Back");
        back.setBounds(120,70,80,20);
        back.addActionListener(this);
        add(back);
        
        
        cancel=new JButton("Cancel");
        cancel.setBounds(220,70,80,20);
        cancel.addActionListener(this);
        add(cancel);
        
        register = new JButton("Register");
        register.setBounds(320, 70, 100, 20);
        register.addActionListener(this);
        add(register);
                
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == search) {
        String query = "select * from addEvent where code=?";
        try {
            Connection con = ConnectionProvider.getCon(); 
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cCodeno.getSelectedItem());
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else if (ae.getSource() == back) {
      Home homePage = new Home(); 
      homePage.setVisible(true); 
        
    } else if(ae.getSource()==register)
    {
    Registration registrationPage = new Registration(); 
    registrationPage.setVisible(true); 
    }
    else {
        setVisible(false);
    }
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Technical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Technical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Technical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Technical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Technical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
