/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.studentmanagmentwithjdbc.dao.Inter;

import az.studentmanagmentwithjdbc.entity.Telebe;
import java.util.List;

/**
 *
 * @author user
 */
public interface TelebeDaoInter {
  void insert(Telebe telebe);
   void update(Telebe telebe);
   void delete(int id);
   Telebe getTelebeByİd(int id);
   List<Telebe>getAllTelebe();   
}
