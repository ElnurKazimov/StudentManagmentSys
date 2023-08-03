/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.entity;

/**
 *
 * @author user
 */
public class Mekteb {
    private int mekteb_id;
    private String mekteb_name;
    private String unvan;

    public Mekteb() {
    }

    public Mekteb(int mekteb_id) {
        this.mekteb_id = mekteb_id;
    }

    public Mekteb(int mekteb_id, String mekteb_name, String unvan) {
        this.mekteb_id = mekteb_id;
        this.mekteb_name = mekteb_name;
        this.unvan = unvan;
    }

    public int getMekteb_id() {
        return mekteb_id;
    }

    public void setMekteb_id(int mekteb_id) {
        this.mekteb_id = mekteb_id;
    }

    public String getMekteb_name() {
        return mekteb_name;
    }

    public void setMekteb_name(String mekteb_name) {
        this.mekteb_name = mekteb_name;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String Unvan) {
        this.unvan = unvan;
    }

    public Mekteb(String mekteb_name) {
        this.mekteb_name = mekteb_name;
    }

    @Override
    public String toString() {
        return "mekteb{" + " mekteb_name = " + mekteb_name +  '}';
    }

}
