

package com.mycompany.inheritance;

public class Inheritance {

    public static void main(String[] args) {
    Ketua ketua =  new Ketua("2875678","cha eun woo","laki laki",2017,2);
    Kaprodi kaprodi = new Kaprodi("2345533","lola cantik","perempuan","RPL");
    
    ketua.viewDosen();
    ketua.viewKetua();
    
    kaprodi.viewDosen();
    kaprodi.viewKaprodi();
    }
}
