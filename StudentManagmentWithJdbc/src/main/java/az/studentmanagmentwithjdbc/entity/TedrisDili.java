/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.entity;

/**
 *
 * @author user
 */
public class TedrisDili {
    private int tedris_dili_id;
    private String tedris_dili;

    public TedrisDili() {
    }

    public TedrisDili(int tedris_dili_id) {
        this.tedris_dili_id = tedris_dili_id;
    }

    public TedrisDili(int tedris_dili_id, String tedris_dili) {
        this.tedris_dili_id = tedris_dili_id;
        this.tedris_dili = tedris_dili;
    }

    public int getTedris_dili_id() {
        return tedris_dili_id;
    }

    public void setTedris_dili_id(int tedris_dili_id) {
        this.tedris_dili_id = tedris_dili_id;
    }

    public String getTedris_dili() {
        return tedris_dili;
    }

    public void setTedris_dili(String tedris_dili) {
        this.tedris_dili = tedris_dili;
    }

    public TedrisDili(String tedris_dili) {
        this.tedris_dili = tedris_dili;
    }

    @Override
    public String toString() {
        return "TedrisDili{" + " tedris_dili = " + tedris_dili + '}';
    }
    

}
