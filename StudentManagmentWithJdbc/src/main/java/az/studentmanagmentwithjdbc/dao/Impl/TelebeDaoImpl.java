/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.dao.Impl;

import az.studentmanagmentwithjdbc.config.AbstractDao;
import az.studentmanagmentwithjdbc.dao.Inter.TelebeDaoInter;
import az.studentmanagmentwithjdbc.entity.Telebe;
import az.studentmanagmentwithjdbc.entity.Mekteb;
import az.studentmanagmentwithjdbc.entity.TedrisDili;
import az.studentmanagmentwithjdbc.entity.TehsilFormasi;
import az.studentmanagmentwithjdbc.entity.İxtisas;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class TelebeDaoImpl extends AbstractDao implements TelebeDaoInter{

    @Override
    public void insert(Telebe telebe) {
   try(Connection conn = connect() ){
       PreparedStatement st = conn.prepareStatement("insert into telebe (adı,soyadı,ata_adı,tevvellud,"
               + "bitirdiyi_mekteb_id,ixtisas_id,tehsil_forması_id,tedris_dili_id)values"
               + "(?,?,?,?,?,?,?,?)");
        st.setString(1, telebe.getAdı());
        st.setString(2, telebe.getSoyadı());
        st.setString(3, telebe.getAta_adı());
        st.setString(4, telebe.getTevvellud());
        st.setInt(5, telebe.getMekteb().getMekteb_id());
        st.setInt(6, telebe.getIxtisas().getIxtisas_id());
        st.setInt(7, telebe.getTehsil_forması().getTehsil_forması_id());
        st.setInt(8, telebe.getTedris_dili().getTedris_dili_id());
        st.execute();
   }    catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    
    }

    @Override
    public void update(Telebe telebe) {
     try(Connection conn = connect() ){
       PreparedStatement st = conn.prepareStatement("update telebe set adı=?,soyadı=?,ata_adı=?,tevvellud=?,"
               + "bitirdiyi_mekteb_id=?,ixtisas_id=?,tehsil_forması_id=?,tedris_dili_id=? where id=?"
  );
        st.setString(1, telebe.getAdı());
        st.setString(2, telebe.getSoyadı());
        st.setString(3, telebe.getAta_adı());
        st.setString(4, telebe.getTevvellud());
        st.setInt(5, telebe.getMekteb().getMekteb_id());
        st.setInt(6, telebe.getIxtisas().getIxtisas_id());
        st.setInt(7, telebe.getTehsil_forması().getTehsil_forması_id());
        st.setInt(8, telebe.getTedris_dili().getTedris_dili_id());
        st.setInt(9, telebe.getId());
        st.execute();
   }    catch (SQLException ex) {
            ex.printStackTrace();
    
    
    
    }}

    @Override
    public void delete(int id) {
    try(Connection conn = connect() ){
        Statement st = conn.createStatement();
        st.execute("delete from telebe where id="+id);
    
    
    }   catch (SQLException ex) {
            System.out.println("Silinme ugursuz oldu -->"+ex.getMessage());;
        }
    }
    @Override
    public Telebe getTelebeByİd(int id) {
   Telebe t= null;
        
        try(Connection conn = connect() ){
        Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery("select* from allinfo where id="+id);
    
        while(rs.next()){
            Mekteb m = new Mekteb(rs.getString("mekteb_name"));
            İxtisas i = new İxtisas(rs.getString("ixtisas_name"));
            TehsilFormasi tf = new TehsilFormasi(rs.getString("tehsil_forması"));
            TedrisDili td = new TedrisDili(rs.getString("tedris_dili"));
       t=new Telebe(rs.getInt("id"), rs.getString("adı"), rs.getString("soyadı"), rs.getString("ata_adı"), rs.getString("tevvellud"), m, i, tf, td);
        }
    
    }   catch (SQLException ex) {
           ex.printStackTrace();
        }
return t;


    }

    @Override
    public List<Telebe> getAllTelebe() {
  List<Telebe> list= new ArrayList<>();
        
        try(Connection conn = connect() ){
        Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery("select* from allinfo ");
    
        while(rs.next()){
            Mekteb m = new Mekteb(rs.getString("mekteb_name"));
            Ixtisas i = new xtisas(rs.getString("ixtisas_name"));
            TehsilFormasi tf = new TehsilFormasi(rs.getString("tehsil_forması"));
            TedrisDili td = new TedrisDili(rs.getString("tedris_dili"));
      Telebe t=new Telebe(rs.getInt("id"), rs.getString("adı"), rs.getString("soyadı"), rs.getString("ata_adı"), rs.getString("tevvellud"), m, i, tf, td);
        list.add(t);
        }
    
    }   catch (SQLException ex) {
           ex.printStackTrace();
        }
return list;    }

}
