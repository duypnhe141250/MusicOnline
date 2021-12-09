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

import model.Album;
import model.Song;

/**
 *
 * @author Administrator
 */
public class AlbumDAO extends DBContext{
    public List<Album> getAllAlbum() {
        List<Album> list = new ArrayList<>();
        String sql = "select * from Album";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
               Album a = new Album();
                a.setAlbumID(rs.getString("albumID"));
                a.setAlbumName(rs.getString("albumName"));
                a.setImg(rs.getString("img"));
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }
}
