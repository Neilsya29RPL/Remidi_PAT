
package Remidi_PAT;

public class SepatuKantoran extends Sepatu{
    private String warna;
    private int ukuran;
    private double harga;
    
    public SepatuKantoran (String jenis,String kategori,String merk, String warna,int ukuran, double harga){
        super(jenis,kategori,merk);
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
    }
    
    public void kantoran(){
        System.out.println("==== DETAIL SEPATU KANTORAN ====");
        super.data();
        System.out.println("Warna Sepatu    : " + this.warna);
        System.out.println("Ukuran Sepatu   : " + this.ukuran);
        System.out.println("Harga Sepatu    : " + this.harga);
        }
}
