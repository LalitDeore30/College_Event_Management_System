package event_college;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import dao.ConnectionProvider; 
import java.awt.event.*;

public class viewDetails extends JFrame implements ActionListener {
    Choice cCodeno;
    JTable table;
    JButton search,back,cancel;
    
    
    
    viewDetails()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Search by Email : ");
        heading.setBounds(20, 40, 150, 20);
        add(heading);
        
        cCodeno=new Choice();
        cCodeno.setBounds(180,40,150,20);
        add(cCodeno);
        
        try{
            Connection con = ConnectionProvider.getCon(); // Use ConnectionProvider to get the connection
            PreparedStatement ps = con.prepareStatement("select * from register");
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
            Connection con = ConnectionProvider.getCon(); // Use ConnectionProvider to get the connection
            PreparedStatement ps = con.prepareStatement("select * from register");
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
                
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
        
         refreshData();
    }
    
    public void refreshData() {
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("select * from register");
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == search) {
        String query = "select * from register where code=?";
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
       Admin AdminPage = new Admin(); 
      AdminPage.setVisible(true); 
    } else {
        setVisible(false);
    }
}

    
    public static void main(String[] args)
    {
        new viewDetails();
    }
}
