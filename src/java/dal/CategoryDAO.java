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
import model.Category;
import model.Song;

/**
 *
 * @author Administrator
 */
public class CategoryDAO extends DBContext{
   
     public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from Category";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCategoryID(rs.getString("categoryID"));
                c.setCategoryName(rs.getString("categoryName"));
                
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }
    
    public int addCategory(Category s){
        String sql="insert into Category values(?,?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, s.getCategoryID());
            st.setString(2, s.getCategoryName());
            
            return st.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int updateCategory(Category s){
        String sql="update Category set categoryName=?"
                + " where categoryID=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, s.getCategoryName());
            st.setString(2, s.getCategoryID());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
    public int delete(String categoryID){
        String sql="delete Category where categoryID=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, categoryID);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        CategoryDAO db = new CategoryDAO();
        int a = db.updateCategory(new Category("a", "123454"));
        System.out.println(a);
    }
}
