/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.entity;

/**
 *
 * @author user
 */
public class TehsilFormasi {
    private int tehsil_formasi_id;
    private String tehsil_formasi;

    public TehsilFormasi() {
    }

    public TehsilFormasi(int tehsil_formasi_id) {
        this.tehsil_formasi_id = tehsil_formasi_id;
    }

    public TehsilFormasi(int tehsil_formasi_id, String tehsil_formasi) {
        this.tehsil_formasi_id = tehsil_formasi_id;
        this.tehsil_formasi = tehsil_formasi;
    }

    public int getTehsil_formasi_id() {
        return tehsil_formasi_id;
    }

    public void setTehsil_formasi_id(int tehsil_formasi_id) {
        this.tehsil_formasi_id = tehsil_formasi_id;
    }

    public String getTehsil_formasi() {
        return tehsil_formasi;
    }

    public void setTehsil_formasi(String tehsil_formasi) {
        this.tehsil_formasi = tehsil_formasi;
    }

  
    

    @Override
    public String toString() {
        return "TehsilFormasi{" + " tehsil_formasi = " + tehsil_formasi + '}';
    }
    

}
