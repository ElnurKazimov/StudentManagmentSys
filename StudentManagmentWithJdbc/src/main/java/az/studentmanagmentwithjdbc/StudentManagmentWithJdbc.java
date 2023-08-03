/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package az.studentmanagmentwithjdbc;

import az.studentmanagmentwithjdbc.config.Context;
import az.studentmanagmentwithjdbc.dao.Inter.MektebDaoInter;
import az.studentmanagmentwithjdbc.entity.Mekteb;

/**
 *
 * @author user
 */
public class StudentManagmentWithJdbc {

    public static void main(String[] args) {
    Mekteb m =new Mekteb(2, "53 sayli orta mekteb", "H.Cavid pr");
        MektebDaoInter mdao = Context.InstanceMektebDao();
        System.out.println(mdao.getAllMekteb());  ; 
    }
}
