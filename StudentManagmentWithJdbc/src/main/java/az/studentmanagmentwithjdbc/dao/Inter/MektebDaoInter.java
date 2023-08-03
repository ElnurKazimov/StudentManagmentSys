/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.studentmanagmentwithjdbc.dao.Inter;

import az.studentmanagmentwithjdbc.entity.Mekteb;
import java.util.List;

/**
 *
 * @author user
 */
public interface MektebDaoInter {
   void insert(Mekteb mekteb);
   void update(Mekteb mekteb);
   void delete(int id);
   Mekteb getMektebByİd(int id);
   List<Mekteb>getAllMekteb(); 
}
