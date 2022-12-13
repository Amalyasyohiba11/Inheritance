
package com.mycompany.inheritance;


public class Kaprodi extends Dosen{
    private String jurusan;
    
public Kaprodi(String nidn,String nama,String JenisKelamin,String Jurusan){
    super(nidn,nama,JenisKelamin);
    this.jurusan = jurusan;
}
public void viewKaprodi(){
    System.out.println("Jurusan "+jurusan);
    
}
    
}
