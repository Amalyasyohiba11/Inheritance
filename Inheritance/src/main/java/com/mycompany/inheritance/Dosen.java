
package com.mycompany.inheritance;

public class Dosen {
    private String nidn;
    private String nama;
    private String JenisKelamin;
    
    public Dosen (String nidn,String nama,String JenisKelamin){
        this.nidn = nidn;
        this.nama = nama;
        this.JenisKelamin = JenisKelamin;
        
    } 
    public void viewDosen(){
        System.out.println("NIDN              : "+nidn);
        System.out.println("Nama              : "+nama);
        System.out.println("Jenis Kelamin     : "+JenisKelamin);
    }
    
}
