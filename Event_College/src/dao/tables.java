/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author rajathemantdeore
 */
public class tables {
    public static void main(String[] args)
    {
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),status varchar(20),UNIQUE (email))";
            String RegisterTable="create table register(name varchar(200),code varchar(200),e_name varchar(200),email varchar(200),mobileNumber varchar(10),branch varchar(200),year varchar(20),UNIQUE (email))";
            String AddEventTable="create table addEvent(e_name varchar(200),code varchar(200),type varchar(2000),info varchar(2000))";
            String adminDetails="insert into user(name,email,mobileNumber,address,password,status) values('Admin','admin@gmail.com','1234567890','India','admin','true')";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(RegisterTable, "Register Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Addded Successfully");
            DbOperations.setDataOrDelete(AddEventTable, "Add event table create successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
