/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;

/**
 *
 * @author Administrator
 */
public class AccountDAO extends DBContext {

  
    
    public Account getAccount( String username, String password ) {
        String sql = "select username,password from Account where username=? and password=? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql); 
            
            st.setString(1, username);
            st.setString(2, password);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Account(username,password);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public int create(Account a) {
        String sql = "Insert into Account values(?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getUsername());
            st.setString(2, a.getPassword());
            st.setInt(3, a.getRoleID());
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public int getRoleAccount(String username, String password){
        String sql = "select roleID from Account where username='"+username+"' and password='"+password+"'";
        Account acc = new Account();
        try {
            PreparedStatement st = connection.prepareStatement(sql); 
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
               acc.setRoleID(rs.getInt("roleID"));
               return acc.getRoleID();
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
  
    public static void main(String[] args) {
        AccountDAO db = new AccountDAO();
        int role = db.getRoleAccount("mrb", "123");
        System.out.println(role);
    }
}
