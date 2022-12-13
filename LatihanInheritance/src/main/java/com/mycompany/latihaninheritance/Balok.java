
package com.mycompany.latihaninheritance;

public class Balok extends PersegiPanjang{
    private int tinggi;
    public void setTinggi(int t){
        tinggi=t;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int Volume(){
        int v=getPanjang()*getLebar()*tinggi;
    return v;
    }
   
        
    }
    

