/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public abstract class AbstractDao {
    public static Connection connect() throws SQLException{
     Connection conn =   DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagmentsys", "elnur", "1234");
   return conn;
             
             }
}
