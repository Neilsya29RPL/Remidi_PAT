
package Remidi_PAT;

import java.util.Scanner;

public class UjiKasir {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        String namaKasir;
        int tanggal,jumlahBeli,noPilihan;
        double harga = 0,total = 0,diskon1,diskon2,bayar;
        
        System.out.println("<=======   TOKO JAYA BARU   ========>");
        System.out.print("Nama Kasir : ");
        namaKasir = input.nextLine();
        System.out.println("Tanggal    : 29 Mei 2021" );
        
        System.out.println("");
        System.out.println("==== STOK SEPATU YANG TERSEDIA ====");
        //pilihan sepatu
        String merkSepatu[] = {",","Sepatu Olahraga","Sepatu Lari","Sepatu Santai","Sepatu Kantoran"};
        for(int i=1; i < merkSepatu.length; i++){
            System.out.println(i+ ". " + merkSepatu[i]);
        }
        
        //memilih nomor
        System.out.print("Masukkan Pilihan Nomor : ");
        noPilihan = input.nextInt();
        System.out.println("");
        
        switch (noPilihan){
            case 1:
                SepatuOlahraga Olga = new SepatuOlahraga ("Cowok","Olahraga","Nike","Blue",27,700000);
                Olga.olahraga();
                harga = 700000;
                break;
            case 2:
                SepatuLari Lari = new SepatuLari ("Cowok","Lari","Adidas","Black",25,400000);
                Lari.lari();
                harga = 400000;
                break;
            case 3:
                SepatuSantai Santai = new SepatuSantai ("Cewek","Santai","Fila","Orange",32,600000);
                Santai.santai();
                harga = 600000;
                break;
            case 4:
                SepatuKantoran Kantor = new SepatuKantoran ("Cewek","Kantoran","Converse","Black",34,900000);
                Kantor.kantoran();
                harga = 900000;
                break;
            default:
                System.out.println("Nomor Pilihan tidak tersedia");
        }
        System.out.println("");
        System.out.println("< Maksimal pembelian 3 pasang sepatu >");
        System.out.print("Jumlah Pembelian : ");
        jumlahBeli = input.nextInt();
        
        System.out.println("");
        
        //hitungTotal
        System.out.println("========= PEMBAYARAN ===========");
        if(jumlahBeli == 2){
            diskon1 = 50000;
            total = (harga*jumlahBeli - diskon1);
            System.out.println("Total : " + total);
        } else if(jumlahBeli == 3){
            diskon2 = 100000;
            total = (harga*jumlahBeli - diskon2);
            System.out.println("Total : " + total);
        }else{
            total = harga*jumlahBeli;
            System.out.println("Total : " + total);
        }
        
        //pembayaran
        System.out.print("Bayar : ");
        bayar = input.nextDouble();
    
        if(bayar == total){
        System.out.println("Terimakasih Uang Anda Pas, Tidak Ada Pengembalian ");       
        }else if(bayar > total){
        System.out.println("Ada Pengembalian Sebesar : Rp. " + (bayar-total));
        }else{
        System.out.println("Maaf Uang anda Tidak Mencukupi");
        }
    }
    
}
