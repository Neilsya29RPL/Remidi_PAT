
package Remidi_PAT;

public class SepatuOlahraga extends Sepatu {
    private String warna;
    private int ukuran;
    private double harga;
    
    public SepatuOlahraga(String jenis,String kategori,String merk, String warna,int ukuran, double harga){
        super(jenis,kategori,merk);
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
    }
    
    public void olahraga(){
        System.out.println("==== DETAIL SEPATU OLAHRAGA ====");
        super.data();
        System.out.println("Warna Sepatu    : " + this.warna);
        System.out.println("Ukuran Sepatu   : " + this.ukuran);
        System.out.println("Harga Sepatu    : " + this.harga);
        }
    }

