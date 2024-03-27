/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author rajathemantdeore
 */
public class UserDao {
    public static void save(User user)
    {
        /*String query="insert into user(name,email,mobileNumber,address,password,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','true')";
        String query1="insert into register(name,code,e_name,email,mobileNumber,branch,year) values('"+user.getName()+"','"+user.getCode()+"','"+user.getE_name()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getBranch()+"','"+user.getYear()+"')";
        String query2="insert into addEvent(e_name,code,type,info) values('"+user.getE_name()+"','"+user.getCode()+"','"+user.getType()+"','"+user.getInfo()+"')";

        DbOperations.setDataOrDelete(query,"Registered Successfully! Wait for Admin Approval!");
        DbOperations.setDataOrDelete(query1,"Registered Successfully! Wait for Admin Approval!");
        DbOperations.setDataOrDelete(query2,"Registered Successfully! Wait for Admin Approval!");*/
        
    String query = "INSERT INTO user(name, email, mobileNumber, address, password, status) VALUES('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','true')"; // Note: Setting status to 'true'
    String query1 = "INSERT INTO register(name, code, e_name, email, mobileNumber, branch, year) VALUES('" + user.getName() + "','" + user.getCode() + "','" + user.getE_name() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getBranch() + "','" + user.getYear() + "')";
    String query2 = "INSERT INTO addEvent(e_name, code, type, info) VALUES('" + user.getE_name() + "','" + user.getCode() + "','" + user.getType() + "','" + user.getInfo() + "')";

    DbOperations.setDataOrDelete(query, "Registered Successfully!");
    DbOperations.setDataOrDelete(query1, "Registered Successfully!");
    DbOperations.setDataOrDelete(query2, "Registered Successfully!");


    }
    public static User login(String email,String password)
    {
        User user=null;
        try{
            ResultSet rs=DbOperations.getData("select * from user where email='"+email+"' and password='"+password+"'");
            while(rs.next())
            {
                user=new User();
                user.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static void update(User user) {
      String query = "UPDATE register SET name=?, code=?, e_name=?, email=?, mobileNumber=?, branch=?, year=? WHERE email=?";
    try {
        Connection con = ConnectionProvider.getCon();
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, user.getName());
        ps.setString(2, user.getCode());
        ps.setString(3, user.getE_name());
        ps.setString(4, user.getEmail());
        ps.setString(5, user.getMobileNumber());
        ps.setString(6, user.getBranch());
        ps.setString(7, user.getYear());
        ps.setString(8, user.getEmail()); // Setting email for WHERE clause
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Details updated successfully!");
        } else {
            System.out.println("No rows updated!");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    
    }
    public static void delete(String email) {
         String query = "DELETE FROM register WHERE email = ?";

        try (Connection con = ConnectionProvider.getCon();
             PreparedStatement ps = con.prepareStatement(query)) {
            // Set the email parameter for the query
            ps.setString(1, email);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("User details deleted successfully!");
            } else {
                System.out.println("No rows deleted! User not found.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
}
