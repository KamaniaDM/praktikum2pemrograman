//Pegawai//

package prak203_2110817320006_kamania.d.m;

//public class Employee {   Pada baris ini tidak bisa menggunakan public class employee karena nama file yang digunakan adalah Pegawai yaitu public class Pegawai. Jika ingin menggunakan public class Employee maka mengganti nama file menjadi Employee.java//




public class Pegawai {
    public String nama;
    //public char asal; dapat diubah tipe datanya menjadi String sehingga dapat menyimpan beberapa karakter sehingga menjadi public String asal;//
    
    public String asal; 
    public String jabatan;
    public int umur;
    public String getNama(){
        return nama;
    }
    public String getAsal(){
        return asal;
    }
    public void setJabatan(String j){ //memakai tipe data//
        this.jabatan = j;
    }
}