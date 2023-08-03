/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.studentmanagmentwithjdbc.entity;

/**
 *
 * @author user
 */
public class Telebe {
   private int id;
   private String adi;
   private String soyadi;
   private String ata_adi;
   private String tevvellud;
   private  Mekteb mekteb;
   private Ixtisas ixtisas;
   private TehsilFormasi tehsil_formasi;
   private TedrisDili tedris_dili;

    public Telebe() {
    }

    public Telebe(int id, String adi, String soyadi, String ata_adi, String tevvellud, Mekteb mekteb, Ixtisas ixtisas, TehsilFormasi tehsil_formasi, TedrisDili tedris_dili) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.ata_adi = ata_adi;
        this.tevvellud = tevvellud;
        this.mekteb = mekteb;
        this.ixtisas = ixtisas;
        this.tehsil_formasi = tehsil_formasi;
        this.tedris_dili = tedris_dili;
    }

    public Telebe(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getAta_adi() {
        return ata_adi;
    }

    public void setAta_adi(String ata_adi) {
        this.ata_adi = ata_adi;
    }

    public String getTevvellud() {
        return tevvellud;
    }

    public void setTevvellud(String tevvellud) {
        this.tevvellud = tevvellud;
    }

    public Mekteb getMekteb() {
        return mekteb;
    }

    public void setMekteb(Mekteb mekteb) {
        this.mekteb = mekteb;
    }

    public Ixtisas getIxtisas() {
        return ixtisas;
    }

    public void setIxtisas(Ixtisas ixtisas) {
        this.ixtisas = ixtisas;
    }

    public TehsilFormasi getTehsil_formasi() {
        return tehsil_formasi;
    }

    public void setTehsil_formasi(TehsilFormasi tehsil_formasi) {
        this.tehsil_formasi = tehsil_formasi;
    }

    public TedrisDili getTedris_dili() {
        return tedris_dili;
    }

    public void setTedris_dili(TedrisDili tedris_dili) {
        this.tedris_dili = tedris_dili;
    }

   


    @Override
    public String toString() {
        return "Telebe{" + "id = " + id + ", ad = " + adi + ", soyad = " + soyadi + ", ata_adi = " + ata_adi + ", tevvellud = " + tevvellud + ", mekteb = " + mekteb + ", ixtisas = " + ixtisas + ", tehsil_formas = " + tehsil_formasi + ", tedris_dili = " + tedris_dili + '}';
    }

   
   
}
