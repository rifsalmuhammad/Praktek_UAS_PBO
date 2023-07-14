import java.util.Scanner;
public class MinumanAksi {
    public static void main(String[] args)
    {

//        Meggunakan java scanner
        Scanner scan = new Scanner(System.in);
//        menampilkan menu minuman
        System.out.println("Menu Minuman : ");
        System.out.println("_________________________________");
        System.out.println("No Nama             Harga");
        System.out.println("1. Cocacola          Rp 6000,00");
        System.out.println("2. Teh pucuk         Rp 5000,00");
        System.out.println("3. Aqua              Rp 4000,00");
        System.out.println("");
//        declarasi harga awal
        int harga = 0;
//        decralasi harga menu
        int h1 = 10000, h2 = 5000, h3 = 4000;
        String menu;
        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
            System.out.println("_________________________________");
//        pengguna memasukkan nomor pesanan
            System.out.print("Masukkan Nomor Pesanan : ");
            int inNomor = scan.nextInt();
            System.out.println("___________________________________________________________________");
            if (inNomor == 1)
            {
//            jika nomor satu, maka minuman yang dipilih adalah cocacola
                menu = " Cocacola";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h1;
            }
            else if (inNomor == 2)
            {
//            jika nomor dua, maka minuman yang dipilih adalah Teh pucuk
                menu = " Teh pucuk";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2;
            }
            else if (inNomor == 3)
            {
//            jika nomor tiga, maka minuman yang dipilih adalah Aqua
                menu = " Aqua";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h3;
            }
            else
//            jika yang dimasukan nomornya tidak ada dalam pilihan maka "Nomor yang dipilih tidak ada di menu."
            {
                System.out.println("Nomor yang dipilih tidak ada di menu.");
            }
//            User diperintahkan untuk memilih lagi atau tidak
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();
        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");
    }
}

