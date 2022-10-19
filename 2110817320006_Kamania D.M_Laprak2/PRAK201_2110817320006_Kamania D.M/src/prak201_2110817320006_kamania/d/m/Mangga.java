//Mangga//

package prak201_2110817320006_kamania.d.m;

public class Mangga {
    String nama;
    float berat;
    int beli;
    int harga;
    
    public Mangga (String n, int h, float br, int bl) {
        nama = n;
        harga = h;
        berat = br;
        beli = bl;
    }
    public void resi () {
        System.out.println("Nama Mangga : " + nama);
        System.out.println("Berat : " + berat + " kg ");
        System.out.println("Jumlah Beli : " + beli);
        System.out.println("Total berat : " + (berat*beli) + " kg ");
        System.out.println("Total harga : Rp. " + (harga*beli));
    }
}