/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikbejonv;

/**
 *
 * @author Kirana
 */
public class KeramikBejoNV {

    int uk,hrg,isi;
    
    KeramikBejoNV (int a, int b, int c){
        this.uk  = a;
        this.hrg = b;
        this.isi = c; 
    }
    
    int ukuran(){
        int luas = 1000000/this.uk;
        return luas;
    }
    
    int jmlBox(){
        int bykBox = this.ukuran()/this.isi;
        return bykBox;
    }
    
    void jmlHarga(){
        int totHrg = this.jmlBox()*this.hrg;
        System.out.println("Total Box Keramik : " + this.jmlBox()+ "Box");
        System.out.println("Total Harga Keramik : " + totHrg + "Rupiah");
    }
    
    public static void main(String[] args) {
    
        KeramikBejoNV A = new KeramikBejoNV(30*30, 54000, 10);
        A.jmlHarga();
        
        KeramikBejoNV B = new KeramikBejoNV(40*40, 65000, 5);
        B.jmlHarga();
        
        KeramikBejoNV C = new KeramikBejoNV(30*40, 60000, 8);
        C.jmlHarga();
    
    }
    
}
