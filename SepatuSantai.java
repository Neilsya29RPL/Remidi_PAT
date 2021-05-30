
package Remidi_PAT;

public class SepatuSantai extends Sepatu {
    private String warna;
    private int ukuran;
    private double harga;
    
    public SepatuSantai(String jenis,String kategori,String merk, String warna,int ukuran, double harga){
        super(jenis,kategori,merk);
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
    }
    
    public void santai(){
        System.out.println("====== DETAIL SEPATU SANTAI ======");
        super.data();
        System.out.println("Warna Sepatu    : " + this.warna);
        System.out.println("Ukuran Sepatu   : " + this.ukuran);
        System.out.println("Harga Sepatu    : " + this.harga);
        }
}
