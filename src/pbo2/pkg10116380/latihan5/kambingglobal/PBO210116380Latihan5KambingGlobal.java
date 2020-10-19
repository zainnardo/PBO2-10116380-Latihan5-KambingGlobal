/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan5.kambingglobal;

/**
 * @author
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Kambing Global
 */
public class PBO210116380Latihan5KambingGlobal {
    //variabel jumlah kambing menjadi jumlah instance
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        PBO210116380Latihan5KambingGlobal kambingSusu = new 
        PBO210116380Latihan5KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //Mendambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
