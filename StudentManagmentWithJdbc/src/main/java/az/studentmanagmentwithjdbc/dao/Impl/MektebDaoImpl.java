/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.dao.Impl;

import az.studentmanagmentwithjdbc.config.AbstractDao;
import static az.studentmanagmentwithjdbc.config.AbstractDao.connect;
import az.studentmanagmentwithjdbc.dao.Inter.MektebDaoInter;
import az.studentmanagmentwithjdbc.entity.Mekteb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MektebDaoImpl extends AbstractDao implements MektebDaoInter{

    @Override
    public void insert(Mekteb mekteb) {
         try(Connection conn = connect() ){
             PreparedStatement st = conn.prepareStatement("insert into mekteb(mekteb_id,mekteb_name,ünvan)"
                     + "values(?,?,?)");
             st.setInt(1, mekteb.getMekteb_id());
             st.setString(2, mekteb.getMekteb_name());
             st.setString(3, mekteb.getUnvan());
             st.execute();
                     
        
    }   catch (SQLException ex) {
       ex.printStackTrace();        }}

    @Override
    public void update(Mekteb mekteb) {
               try(Connection conn = connect() ){
             PreparedStatement st = conn.prepareStatement("update mekteb set mekteb_id=?,mekteb_name=?,ünvan=? where mekteb_id=?"
       );
             st.setInt(1, mekteb.getMekteb_id());
             st.setString(2, mekteb.getMekteb_name());
             st.setString(3, mekteb.getUnvan());
             st.setInt(4, mekteb.getMekteb_id());
             st.execute();
                     
        
    }   catch (SQLException ex) {
       ex.printStackTrace();     }}

    @Override
    public void delete(int id) {
 try(Connection conn = connect() ){
 
     Statement st = conn.createStatement();
     st.execute("delete from mekteb where mekteb_id="+id);
 
 }      catch (SQLException ex) {
            System.out.println("silinme ugursuz oldu-->"+ex.getMessage());;
        }    }

    @Override
    public Mekteb getMektebByİd(int id) {
    Mekteb m = null;
        try(Connection conn = connect() ){
    Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select*from mekteb where mekteb_id="+id);
            
     while(rs.next()){
         m = new Mekteb(rs.getInt("mekteb_id"), rs.getString("mekteb_name"), rs.getString("ünvan"));
         
     }
    
    
    }   catch (SQLException ex) {
            ex.printStackTrace();
        }
        return m;
    
    
    }

    @Override
    public List<Mekteb> getAllMekteb() {
     List<Mekteb> list = new ArrayList<>();
        try(Connection conn = connect() ){
    Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select*from mekteb ");
            
     while(rs.next()){
      Mekteb   m = new Mekteb(rs.getInt("mekteb_id"), rs.getString("mekteb_name"), rs.getString("ünvan"));
         list.add(m);
     }
    
    
    }   catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    
    }
    
}
