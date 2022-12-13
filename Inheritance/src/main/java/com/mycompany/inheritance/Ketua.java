
package com.mycompany.inheritance;

public class Ketua extends Dosen {
    private int tahunMulai;
    private int jabatanKe;
    
public Ketua (String nidn,String nama,String JenisKelamin, int tahunMulai,int jabatanKe){
    super(nidn,nama,JenisKelamin);
    this.tahunMulai=tahunMulai;
    this.jabatanKe=jabatanKe;
}
public void viewKetua(){
    System.out.println("Tahun mulai jabtaan : "+tahunMulai);
    System.out.println("Jabatan Ketua Ke-   :"+jabatanKe);
    
}
    
}
