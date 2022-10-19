//Soal3Main//

package prak203_2110817320006_kamania.d.m;
import java.util.Scanner;

public class Soal3Main {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Pegawai p1 = new Pegawai();
        
        p1.nama = "Roi"; //memakai tanda ; agar tidak error//
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        
        p1.umur = 17; //agar output umur keluar//
        
        //System.out.println("Nama Pegawai: " + p1.getNama()); Perintah ini kurang sesuai dengan output yang ditentukan//
        
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        
        //System.out.println("Umur: " + p1.umur); kurang tepat //
        System.out.println("Umur: " + p1.umur + " tahun "); //untuk menghasilkan output umur yaitu 17//
    }
}