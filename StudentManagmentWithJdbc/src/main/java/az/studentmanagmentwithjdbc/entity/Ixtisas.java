/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.entity;

/**
 *
 * @author user
 */
public class Ixtisas {
    private int ixtisas_id;
    private String ixtisas_name;

    public Ixtisas() {
    }

    public Ixtisas(int ixtisas_id) {
        this.ixtisas_id = ixtisas_id;
    }

    public Ixtisas(int ixtisas_id, String ixtisas_name) {
        this.ixtisas_id = ixtisas_id;
        this.ixtisas_name = ixtisas_name;
    }

    public int getIxtisas_id() {
        return ixtisas_id;
    }

    public void setIxtisas_id(int ixtisas_id) {
        this.ixtisas_id = ixtisas_id;
    }

    public String getIxtisas_name() {
        return ixtisas_name;
    }

    public void setIxtisas_name(String ixtisas_name) {
        this.ixtisas_name = ixtisas_name;
    }

    public Ixtisas(String ixtisas_name) {
        this.ixtisas_name = ixtisas_name;
    }

    @Override
    public String toString() {
        return "Ixtisas{" + " ixtisas_name = " + ixtisas_name + '}';
    }


}
