//Soal1Main//

package prak201_2110817320006_kamania.d.m;

public class Soal1Main {
    public static void main(String[] args){
        Mangga Arumanis = new Mangga ("Arumanis",5000,0.3f,13);
        Mangga Manalagi = new Mangga ("Manalagi",7500,0.5f,17);
        Mangga Madu = new Mangga ("Mangga Madu",6500,0.375f,12);
        
        Arumanis.resi();
        System.out.println("");
        Manalagi.resi();
        System.out.println("");
        Madu.resi();
    }
}