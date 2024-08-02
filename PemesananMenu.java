package PemesananMakanan;


public class PemesananMenu {
    
    public static String[] makanan = new String[3];
    public static String[] minuman = new String[3];
    
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static int hargaMkn=0,hargaMnm=0,ttl = 0;
    public static void main(String[] args) {
        tampilMenu();
    }
    
    public static void menu(){
        System.out.println("1. Pesan Makanan");
        System.out.println("2. Pesan Minuman");
        System.out.println("3. Lihat  Pesanan");
        System.out.println("4. Bayar");
        System.out.println("x. Tidak Jadi");
    }
    
    public static String input(String perintah){
      
        System.out.print(perintah + " : ");
      var nomer= scanner.nextLine(); 
      
      return nomer;
      
      }
      

    public static void tesInputMakanan(){
        input("Pilih Makanan");
    }
    
    public static void pesanMakanan(){
        
        System.out.println("Menu Makanan: ");
        System.out.println("1. Nasi Goreng - 15.000");
        System.out.println("2. Bakso - 12.000");
        System.out.println("3. Roti Bakar - 10.000");
    }
    
    public static void pesanMinuman(){
        System.out.println("Menu Minuman: ");
        System.out.println("1. Es Teh - 5.00");
        System.out.println("2. Kopi - 3.000");
        System.out.println("3. Es Kelapa - 7.000");
    }
    
    public static void invoice(){
        var nomor=1;
        
        System.out.println("MENU YANG DIPESAN");
        System.out.println("Makanan: ");
        if(makanan != null){
        for(var i=0; i<makanan.length;i++){
            if(makanan[i] != null){
            System.out.println(nomor + ". "+ makanan[i]);
            nomor++;
        }
        }
        }else{
            System.out.println("Anda tidak memesan menu makanan");    
            }
        
        System.out.println();
        System.out.println("Minuman: ");
        nomor=1;
        if(minuman != null){
        for(var i=0;i<minuman.length;i++){
            if(minuman[i] !=null){
            System.out.println(nomor + ". " + minuman[i]);
            nomor++;
        }
        }
        }else{
            System.out.println("Anda tidak memesan menu minuman");
        }
    }
    
    public static void bayarPesanan(){
    invoice();
        ttl=hargaMkn+hargaMnm;
        System.out.println("Total harga : " +ttl);
    }
    
    public static void tampilMenu(){
        while(true){
        System.out.println("RUMAH MAKAN AL-FREDY");
        System.out.println("SEDIA MENU : ");
        System.out.println();
        pesanMakanan();
        System.out.println();
        pesanMinuman();
        System.out.println();
        menu();
        var pilihan = input("Masukkan pilihan (x untuk berhenti)");
        if(pilihan.equals("1")){
        tampilPesanMakanan();
        }else if(pilihan.equals("2")){
        tampilPesanMinuman();
        }else if(pilihan.equals("3")){
        tampilInvoice();
        }else if(pilihan.equals("4")){
            tampilBayarPesanan();
        }else if(pilihan.equals("x")){
            System.out.println("Terimakasih telah berkunjung!");
        break;
        }else{
            System.out.println("Anda salah memasukan pilihan, pilihan "+ pilihan + " tidak tersedia");
        }
    }
    }
    public static void tampilPesanMakanan(){
    
        while(true){
        System.out.println(); 
      pesanMakanan();
      var pilihanMakanan = input("Pilih nomor makanan pada menu (Ketik x untuk ke tampilan awal)");
      
      
      String NmMkn;
      int jumlah=0;
      
      if(pilihanMakanan.equals("x")){
          break;
      }
      
      var isFull = true;
      for(var i=0;i<makanan.length;i++){
      if(makanan[i]==null){
          isFull = false;
          break;
      }
      }
      
      if(isFull){
      var temp = makanan;
      makanan = new String[(makanan.length*2)];
      for(var i=0;i<temp.length;i++){
          makanan[i] = temp[i];
      }
      }
      
      for(var i=0;i<makanan.length;i++){
      
      if(makanan[i] == null){
        if(pilihanMakanan.equals("1")){
          NmMkn = "Nasi Goreng";
          String jml = String.valueOf(jumlah);
          jml = input("Masukan banyaknya "+NmMkn+" yang ingin dipesan");
          makanan[i] = NmMkn + " - x" + jml;
          hargaMkn += 15_000 * Integer.valueOf(jml);
          System.out.println("Pesanan berhasil ditambahkan! Silahkan masukkan pesanan selanjutnya");
          jumlah = 0;
          break;
        }else if(pilihanMakanan.equals("2")){
        NmMkn = "Bakso";
        String jml = String.valueOf(jumlah);
          jml = input("Masukan banyaknya "+NmMkn+" yang ingin dipesan");
          makanan[i] = NmMkn + " - x" + jml;
        hargaMkn += 12_000 * Integer.valueOf(jml); 
        System.out.println("Pesanan berhasil ditambahkan! Silahkan masukkan pesanan selanjutnya");
        jumlah = 0;
        break;
        }else if(pilihanMakanan.equals("3")){
        NmMkn = "Roti Bakar";
        String jml = String.valueOf(jumlah);
          jml = input("Masukan banyaknya "+NmMkn+" yang ingin dipesan");
          makanan[i] = NmMkn + " - x" + jml;
        hargaMkn = 10_000 * Integer.valueOf(jml);
        System.out.println("Pesanan berhasil ditambahkan! Silahkan masukkan pesanan selanjutnya");
        jumlah = 0;
        break;
        }else{
            System.out.println("Tidak ada nomor pesanan yang dimaksud, mohon isi dengan benar");
            break;
        }
        }
    }    
    }
    }
    
    public static void tampilPesanMinuman(){
        while (true){
        System.out.println();
        pesanMinuman();
         var pesanMinuman = input("Pilih nomer Minuman (ketik x untuk ke tampilan awal) ");
         
         if(pesanMinuman.equals("x")){
             break;
         }
         
         String NmMinum;
         int jumlah=0;

         var isFull = true;
         for(var i=0; i<minuman.length;i++){
         if(minuman[i] == null){
             isFull = false;
             break;
         }
         }
         
         if(isFull){
             var temp = minuman;
             minuman = new String[(minuman.length*2)];
             for(var i=0;i<temp.length;i++){
             minuman [i] = temp[i];
             }
         }
         
         for(var i=0;i<minuman.length;i++){
             if(minuman[i]==null){
         if(pesanMinuman.equals("1")){
         NmMinum = "Es Teh";
         String jml = String.valueOf(jumlah);
          jml = input("Masukan banyaknya "+NmMinum+" yang ingin dipesan");
          minuman[i] = NmMinum + " - x" + jml;
         hargaMnm += 5_000 * (Integer.valueOf(jml));
         System.out.println("Pesanan berhasil ditambahkan! Silahkan masukkan pesanan selanjutnya");
         jumlah = 0;
         break;
        }else if(pesanMinuman.equals("2")){
         NmMinum = "Kopi";
         String jml = String.valueOf(jumlah);
         jml = input("Masukan banyaknya "+NmMinum+" yang ingin dipesan");
         minuman[i] = NmMinum + " - x" + jml;
         hargaMnm += 3_000 * (Integer.valueOf(jml));
         System.out.println("Pesanan berhasil ditambahkan! Silahkan masukkan pesanan selanjutnya");
         jumlah = 0;
         break;
        }else if(pesanMinuman.equals("3")){
         NmMinum = "Es Kelapa";
         String jml = String.valueOf(jumlah);
         jml = input("Masukan banyaknya "+NmMinum+" yang ingin dipesan");
         minuman[i] = NmMinum + " - x" + jml;
         hargaMnm += 7_000 * (Integer.valueOf(jml));
         System.out.println("Pesanan berhasil ditambahkan! Silahkan masukkan pesanan selanjutnya");
        jumlah = 0;
         break;
         }else{
        System.out.println("Tidak ada nomer pesanan yang dimaksud, mohon isi dengan benar");
        break;
        } 
        }
         }
        }
    }
    
    public static void tampilInvoice(){
        
        invoice();
        System.out.println();
        System.out.println("1. Lanjutkan ke Pembayaran");
        
        var choice = input("Ketik Pilihan (ketik x untuk ke menu sebelumnya) ");
        
        if(choice.equals("1")){
            tampilBayarPesanan();
        }else if(choice.equals("x")){
            tampilMenu();
        }
    }
    
    public static void tampilBayarPesanan(){
        bayarPesanan();
        
        var total = input("Masukkan uang anda");
        int TOTAL = Integer.valueOf(total);
        
        if(TOTAL <ttl){
            System.out.println("Uang anda kurang");
            tampilMenu();
        }else{
            System.out.println("Bayar:"+total);
            System.out.println("Kembali:"+ (TOTAL -ttl));
            System.out.println("Terimakasih telah berbelanja di warung kami!");
            System.out.println();
        }
        
    }
    
}
