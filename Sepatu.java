
package Remidi_PAT;

public class Sepatu {
    private String jenis,kategori,merk;
    //konstruktor
    public Sepatu (String jenis, String kategori, String merk){
        this.jenis = jenis;
        this.kategori = kategori;
        this.merk = merk;
    }

    //method
    public void data(){
        System.out.println("Jenis Sepatu    : " + this.jenis);
        System.out.println("Kategori Sepatu : " + this.kategori);
        System.out.println("Merk Sepatu     : " + this.merk);
    }   
}
