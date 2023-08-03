/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.config;

import az.studentmanagmentwithjdbc.dao.Impl.MektebDaoImpl;
import az.studentmanagmentwithjdbc.dao.Impl.TelebeDaoImpl;
import az.studentmanagmentwithjdbc.dao.Inter.MektebDaoInter;
import az.studentmanagmentwithjdbc.dao.Inter.TelebeDaoInter;

/**
 *
 * @author user
 */
public class Context {
    public static TelebeDaoInter InstanceTelebeDao(){
    return  (TelebeDaoInter) new TelebeDaoImpl();
    }
    public static MektebDaoInter InstanceMektebDao(){
        return new MektebDaoImpl();
    }
}
