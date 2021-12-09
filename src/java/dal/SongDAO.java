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
import model.Song;

/**
 *
 * @author Administrator
 */
public class SongDAO extends DBContext {

    public List<Song> getAllSong() {
        List<Song> list = new ArrayList<>();
        String sql = "select * from Song";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Song s = new Song();
                s.setSongID(rs.getInt("songID"));
                s.setSongName(rs.getString("songName"));
                s.setAccountID(rs.getInt("accountID"));
                s.setCategoryID(rs.getString("categoryID"));
                s.setAlbumID(rs.getString("albumID"));
                s.setImage(rs.getString("image"));
                s.setSource(rs.getString("source"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }
    
    public List<Song> getSongById(int songId) {
        List<Song> list = new ArrayList<>();
        String sql = "select * from Song where songID ='"+songId+"'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Song s = new Song();
                s.setSongID(rs.getInt("songID"));
                s.setSongName(rs.getString("songName"));
                s.setAccountID(rs.getInt("accountID"));
                s.setCategoryID(rs.getString("categoryID"));
                s.setAlbumID(rs.getString("albumID"));
                s.setImage(rs.getString("image"));
                s.setSource(rs.getString("source"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }
    
    public List<Song> getSongByAlbum(int album) {
        List<Song> list = new ArrayList<>();
        String sql = "select * from Song where albumID ='"+album+"'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Song s = new Song();
                s.setSongID(rs.getInt("songID"));
                s.setSongName(rs.getString("songName"));
                s.setAccountID(rs.getInt("accountID"));
                s.setCategoryID(rs.getString("categoryID"));
                s.setAlbumID(rs.getString("albumID"));
                s.setImage(rs.getString("image"));
                s.setSource(rs.getString("source"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }

   
    public List<Song> getSongByPage(List<Song> list, int start, int end){
        List<Song> s = new ArrayList<>();
        for(int i= start;i<end;i++){
            s.add(list.get(i));
        }
        return s;
    }
    
    public List<Song> searchSong(String searchText) {
        List<Song> list = new ArrayList<>();
        String sql1 = "select * from Song where songName like '"+searchText+"%' ";
        try {
            PreparedStatement st = connection.prepareStatement(sql1);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Song s = new Song();
                s.setSongID(rs.getInt("songID"));
                s.setSongName(rs.getString("songName"));
                s.setAccountID(rs.getInt("accountID"));
                s.setCategoryID(rs.getString("categoryID"));
                s.setAlbumID(rs.getString("albumID"));
                s.setImage(rs.getString("image"));
                s.setSource(rs.getString("source"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println("looioo");
        }
        return list;
    }

     public int addSong(Song s){
        String sql="insert into Song values(?,?,?,?,?,?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);           
            st.setString(1, s.getSongName());
            st.setInt(2, s.getAccountID());
            st.setString(3, s.getCategoryID());
            st.setString(4, s.getAlbumID());
            st.setString(5, s.getImage());
            st.setString(6, s.getSource());
            
            return st.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
    public List<Song> getSongByCate(String cateID) {
        List<Song> list = new ArrayList<>();
        String sql = "select * from Song where categoryID ='"+cateID+"'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Song s = new Song();
                s.setSongID(rs.getInt("songID"));
                s.setSongName(rs.getString("songName"));
                s.setAccountID(rs.getInt("accountID"));
                s.setCategoryID(rs.getString("categoryID"));
                s.setAlbumID(rs.getString("albumID"));
                s.setImage(rs.getString("image"));
                s.setSource(rs.getString("source"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }
    
    public int delete(String songID){
        String sql="delete Song where songID=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, songID);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    //update
    public int updateSong(String songname,String categoryID,String albumid,int accid){
        String sql="update Song set songName=?,categoryID=?,albumID=?"
                + " where songID=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, songname);
            st.setString(2, categoryID);
            st.setString(3, albumid);         
            st.setInt(5, accid);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public static void main(String[] args) {
        SongDAO db = new SongDAO();
        List a = db.getSongById(1);
        System.out.println(a.size());
        
    }
}
